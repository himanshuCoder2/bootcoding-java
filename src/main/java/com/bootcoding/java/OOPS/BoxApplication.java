package com.bootcoding.java.OOPS;

public class BoxApplication {
    public static void main(String[] args) {
        Box b1=Box.createBox();
        Box b2=Box.createBox(3.4,6.5,6.2);
        Box.printBox(b1);
        Box.printBox(b2);

    }

}
