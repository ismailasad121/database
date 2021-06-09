package com.example.first;

public class Customer {

    private String Name;
    private int Age;
    private boolean isActive;
    private int id;

    //Use Generate to make all these functions
    public Customer(String name, int age, boolean isActive, int id) {
        Name = name;
        Age = age;
        this.isActive = isActive;
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", isActive=" + isActive +
                ", id=" + id +
                '}';
    }
}
