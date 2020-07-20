package com.example.bean;

public class UserBean {
    String name;
    String address;
    Integer age;

    public UserBean(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public UserBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
