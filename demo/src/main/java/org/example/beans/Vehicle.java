package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello from Vehicle");
    }
}
