package com.cdk.hw.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Cacheable
public class Shopkeeper implements Serializable{
    @Id
    private int id;

    @Column(name = "NAME",length = 255)
    private String name;
    @Column(name = "PASSWORD")
    private String password;

    @Column(name="LOCATION",length = 255)
    private String location;
    public Shopkeeper(){

    }

    public Shopkeeper(int id,String name, String password, String location) {
        this.id=id;
        this.name = name;
        this.password = password;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Shopkeeper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
