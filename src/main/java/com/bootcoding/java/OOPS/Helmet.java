package com.bootcoding.java.OOPS;

public class Helmet {
    String color;
    int price;
    String type;
    double weight;

    public static Helmet infoHelmet(String c, int p, String t, double w)
    {
        Helmet helmet = new Helmet();
        helmet .color = c;
        helmet .price = p;
        helmet .type = t;
        helmet .weight = w;
        return helmet;
    }

    public  static  Helmet printHelmet( Helmet helmet){
        System.out.println("Helmet Color " + " -> " + helmet.color );
        System.out.println("Helmet Price " + " -> "  + helmet.price);
        System.out.println("Helmet Type " + " -> "  + helmet.type);
        System.out.println("Helmet weight " + " -> "  + helmet.weight);
        return helmet;
    }

}
