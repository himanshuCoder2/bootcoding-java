package com.bootcoding.java.OOPS;

public class Duster {
    double length;
    double breadth;
    double height;
    int  price;


    public static Duster createDuster(double l,double b,double h, int p)
    {
        Duster duster = new Duster();
        duster.length = l;
        duster.breadth = b;
        duster.height = h;
        duster.price = p;
        return duster;
    }

    public  static  Duster printDuster( Duster duster){
        System.out.println("Duster length " + " -> " + duster.length);
        System.out.println("Duster breadth " + " -> "  + duster.breadth);
        System.out.println("Duster height " + " -> "  + duster.height);
        System.out.println("Duster Price " + " -> "  + duster.price);
        return duster;
    }
}
