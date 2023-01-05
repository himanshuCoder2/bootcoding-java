package com.bootcoding.java.OOPS;


class Box{
    double length;
    double breadth;
    double height;

    public  static  Box createBox(){
        Box box = new Box();
        box.length =15.0;
        box.breadth=16.0;
        box.height=16.0;
        return box;
    }

    public  static Box createBox(double l,double b,double h){
        Box box = new Box();
        box.length =l;
        box.breadth=b;
        box.height=h;
        return box;
    }


    public  static  Box printBox(Box box){
        System.out.println("Box length ="+ box.length);
        System.out.println("Box breadth ="+ box.breadth);
        System.out.println("Box height =" + box.height);
        return box;
    }

}