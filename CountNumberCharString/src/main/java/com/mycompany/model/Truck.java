package com.mycompany.model;

public class Truck extends Vehicle implements ITruck {

    private Double height;

    public Truck() {
    }

    public Truck(Double height) {
        this.height = height;
    }

    @Override
    public void openBackDoor() {
        System.out.println("Door opened.");
    }

    @Override
    public void closeBackDoor() {
        System.out.println("Door closed.");
    }

    @Override
    void buy() {
        System.out.println("Truck bought with success.");
    }

    void buy(Sentence sentence) {
        System.out.println(sentence + " bought with success.");
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Truck{");
        sb.append("height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
