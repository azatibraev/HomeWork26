package com.company.HomeWork_1;

public class Car {

    private short id;
    private String numberOfCar;

    public Car() {
    }

    public Car(short id, String numberOfCar) {
        this.id = id;
        this.numberOfCar = numberOfCar;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car id= " + id + '\n' +
                "numberOfCar= " + numberOfCar +'\n';
    }
}
