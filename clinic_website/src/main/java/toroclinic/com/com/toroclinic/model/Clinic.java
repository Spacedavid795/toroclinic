public class Clinic {
    package com.toroclinic.model;

import jakarta.persistence.*;

@Entity
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String hours;

    // Constructors
    public Clinic() {}

    public Clinic(String name, String address, String phone, String hours) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.hours = hours;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    public String getHours() { return hours; }
    public void setHours(String hours) { this.hours = hours; }
}



