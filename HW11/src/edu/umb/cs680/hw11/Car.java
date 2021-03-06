package edu.umb.cs680.hw11;

import java.util.ArrayList;

public class Car {

    private String model;
    private String make;
    private int mileage;
    private int year;
    private float price;
    private int dominationCount;

    public Car(String model, String make, int mileage, int year, float price) {
        this.model = model;
        this.make = make;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public int getDominationCount() {
        return dominationCount;
    }

    public void setDominationCount(ArrayList<Car> cars) {
        int dominationCount = 0;
        for(Car car : cars) {
            if(!car.equals(this)) {
                if((this.getPrice() <= car.getPrice() && this.getYear() >= car.getYear() && this.getMileage() <= car.getMileage())
                        && (this.getPrice() < car.getPrice() || this.getYear() > car.getYear() || this.getMileage() < car.getMileage())) {
                    dominationCount++;
                }
            }
        }
        this.dominationCount = dominationCount;
    }

}
