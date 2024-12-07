package com.klef.jfsd.exam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Ensure you have a primary key

    private int age;
    private String email;
    private String gender;
    private String location;
    private String name;
    private long number;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "client [id=" + id + ", age=" + age + ", email=" + email + ", gender=" + gender + ", location=" + location
                + ", name=" + name + ", number=" + number + "]";
    }
}
