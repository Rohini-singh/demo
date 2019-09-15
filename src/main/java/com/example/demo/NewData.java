package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NewData {

    @Id
    @GeneratedValue
    private long id;
    private String data;

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }
}
