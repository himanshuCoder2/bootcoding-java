package com.bootcoding.java.OOPS.Inheritance.Table;

public class Table {
    int legs;
    boolean tableTop;
    String tableType;
    Material material;

    public void  move(){
        System.out.println("Moving Table to another Location");
    }
    public  void createTable(){
        System.out.println("Creating a Table");
    }
}
