package com.mycompany.model;

import java.sql.SQLOutput;

public class Car extends Vehicle implements ICar {

    private String maxKilometers;

    public String getMaxKilometers() {
        return maxKilometers;
    }

    public void setMaxKilometers(String maxKilometers) {
        this.maxKilometers = maxKilometers;
    }

    public Car() {
    }

    public Car(String maxKilometers) {
        this.maxKilometers = maxKilometers;
    }

    public Car(String name, String cost, String maxKilometers) {
        this.setName(name);
        this.setCost(cost);
        this.maxKilometers = maxKilometers;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append(("Name='")).append(getName()).append('\'');
        sb.append("maxKilometers='").append(maxKilometers).append('\'');
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
