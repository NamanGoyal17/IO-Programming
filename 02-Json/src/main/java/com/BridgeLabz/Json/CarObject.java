package com.BridgeLabz.Json;

import com.google.gson.Gson;

class Car{
    private String name;
    private String model;
    private int year;

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

}
public class CarObject {
    public static void main(String[] args) {
        Car car = new Car("BMW" , "X5" , 2018);
        Gson gson = new Gson();
        String json = gson.toJson(car);
        System.out.println(json);
    }
}
