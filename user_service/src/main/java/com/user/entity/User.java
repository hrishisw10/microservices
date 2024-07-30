package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private String phone;
    List<Contact> contacts= new ArrayList<>();

    public User(Long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public User(Long id, String name, String phone, List<Contact> contacts) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
