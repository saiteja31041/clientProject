package com.klef.jfsd.exam;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import employe.employe;

public class hibernateUtil {
	public static SessionFactory sessionfactory;
	public static SessionFactory getSessionFactory() {
		if(sessionfactory==null) {
			Properties props = new Properties();
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:3306/client");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "123456789");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			props.put(Environment.HBM2DDL_AUTO, "update");
			props.put(Environment.SHOW_SQL, true);
			props.put(Environment.FORMAT_SQL, true);
			Configuration configuration = new Configuration();
			configuration.addProperties(props);
			configuration.addAnnotatedClass(client.class);
			
			ServiceRegistry registry = new StandardServiceRegistryBuilder()
				    .applySettings(configuration.getProperties()).build();
			sessionfactory = configuration.buildSessionFactory(registry);

		}
		return sessionfactory;
	}

}
