package com.mycompany.model;

import java.sql.SQLOutput;

public class Car extends Vehicle implements ICar {

    private String weight;

    public Car(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("weight='").append(weight).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    void buy() {
        System.out.println("Car bought.");
    }

    @Override
    public void startCarEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopCarEngine() {
        System.out.println("Engine stopped.");
    }
}
