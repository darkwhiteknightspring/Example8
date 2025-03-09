package com.example.beans;


import org.springframework.stereotype.Component;

@Component
public class Vehicle1 {
    private String name = "Audi";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing hello from the vehicle bean");
    }

    @Override
    public String toString(){
        return "Vehicle name is : " + name;
    }

}
