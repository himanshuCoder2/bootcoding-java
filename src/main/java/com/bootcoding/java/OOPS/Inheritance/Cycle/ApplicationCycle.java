package com.bootcoding.java.OOPS.Inheritance.Cycle;

public class ApplicationCycle {
    public static void main(String[] args) {
        SportCycle sc = new SportCycle();
        sc.wheels=2;
        sc.model="Next";
        sc.name="Mountain";
        sc.price= 9000;
        sc.start();
        sc.Running();

        GearCycle gc= new GearCycle();
        gc.wheels=2;
        gc.model="Next";
        gc.name="Hero";
        gc.price= 12000;
        gc.gear();
        gc.start();
        gc.Running();
    }
}
