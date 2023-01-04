package com.bootcoding.java.MethodAPI;

public class MethodAPIWithArray {
    public static void main(String[] args) {
        int[] ages={12,15,25,26,27,30};
        System.out.println(isSeniorCitizen(ages));
        System.out.println(isAdult(ages));


    }
    public static boolean isSeniorCitizen(int[] ages){
        for(int i=0; i<ages.length; i++){
            if(ages[i] <= 60){
                return true;
            }
        }
        return false;
    }
    public static boolean isAdult(int[] ages){
        for(int i=0; i<ages.length; i++){
            if(ages[i] >= 15 & ages[i]<=60){
                return  true;
            }

        }

        return false;
    }
}

