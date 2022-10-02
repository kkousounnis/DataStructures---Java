package com.mycompany.service;

import com.mycompany.model.Car;

public class VehicleService {

    public void Vehicle(){

        Car car1 = new Car("Audi", "100000", "300");

        car1.startCarEngine();
        car1.stopCarEngine();
        System.out.println(car1);
    }
}
