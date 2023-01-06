package com.bootcoding.java.OOPS.Inheritance.Cycle;

public class Cycle {
    int wheels;
    String model;
    String name;
    int price;
    Gear gear;


    public  void start(){
        System.out.println("Cycle has been Start");

    }
    public  void Running(){
        System.out.println("Cycle Running");
    }
}
