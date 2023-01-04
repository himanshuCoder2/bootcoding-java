package com.bootcoding.java.MethodAPI;

public class DiscountSystem {

    public static char[] calculateDiscount(int[] userPurchase) {
        char[] discounts = new char[userPurchase.length];
        for (int i = 0; i < userPurchase.length; i++) {
            char discount;
            int percentage = userPurchase[i];
            discount = getDiscount(percentage);
            discounts[i] = discount;
        }
        return discounts;

    }
    private static  char getDiscount(int percentage) {
        char discount;
        if (percentage > 8) {
            discount = 50;
        } else if (percentage >= 5) {
            discount = 30 ;
        } else if (percentage >= 2 ) {
            discount = 10 ;
        } else {
            discount = 0 ;
        }
        return discount;
    }

        public static void main(String[]args){
        int[] userPurchase = {10, 5, 9, 1, 3, 7, 2, 0};
        char[] discountResult =calculateDiscount((userPurchase));
        for (int i=0; i<discountResult.length; i++ ) {
            System.out.println(userPurchase[i] + " -> " + discountResult[i]);
        }
    }
}
