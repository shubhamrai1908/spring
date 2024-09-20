package com.example;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    int lid;
    String brand;
    public int getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void complie(){
        System.out.println("Inside complie");
    }
}
