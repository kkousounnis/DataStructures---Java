package com.mycompany.model;

abstract class Vehicle {

    private String name;

    private String cost;

    abstract void buy();

    public Vehicle() {
    }

    public Vehicle(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
