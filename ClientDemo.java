package com.klef.jfsd.exam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.klef.jfsd.exam.client;
public class ClientDemo {

    public static void main(String[] args) {
        SessionFactory sf = hibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        // Creating a new client object
        client c = new client();
        Transaction t = s.beginTransaction(); // Use Hibernate's Transaction

        c.setAge(26);
        c.setEmail("saiteja");
        c.setGender("male");
        c.setLocation("nellore");
        c.setName("saiteja");
        c.setNumber(987897899);

        // Save the client to the database
        s.save(c);
        t.commit(); // Commit the transaction

        // Fetch all clients and print them
        Query<client> q = s.createQuery("from client", client.class);
        List<client> user = q.list();
        for (client u : user) {
            System.out.println(u);
        }

        s.close(); // Close the session
    }
}
