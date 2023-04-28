package com.atharva.toysystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.GenerationType;
@Entity
public class Child {
    @Id
    @GeneratedValue

    private int id;
    private String Name;
    private String Address;

    private String Pname;

    private String Starttime;

    private String Endtime;

    private String Phone;

    private String Learn;

    private String Play;


    public Child() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getStarttime() {
        return Starttime;
    }

    public void setStarttime(String stime) {
        Starttime = stime;
    }

    public String getEndtime() {
        return Endtime;
    }

    public void setEndtime(String etime) {
        Endtime = etime;
    }


    public String getPhone() {return Phone; }

    public void setPhone(String phone) {Phone = phone;}

    public String getLearn() {
        return Learn;
    }

    public void setLearn(String learn) {Learn = learn;}

    public String getPlay() {
        return Play;
    }

    public void setPlay(String play) {Play = play;}




}