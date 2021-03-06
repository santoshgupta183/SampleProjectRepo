package com.example.myapplication.model;

public class User {
    private String id;
    private String fName;
    private String lName;
    private int age;
    private String address;

    public User() {
    }

    public User(String id, String fName, String lName, int age, String address) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
