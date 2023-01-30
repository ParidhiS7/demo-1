package com.spring.demos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private long pincode;

    private String street;
    private String city;
   // private int employee_id;


    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", pincode=" + pincode +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
