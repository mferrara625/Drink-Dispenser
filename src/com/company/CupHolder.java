package com.company;

public class CupHolder {
    static double volumePerCup;
    static double quantity;
    static String size;

    public CupHolder(double volumePerCup, double quantity, String size){
        this.volumePerCup = volumePerCup;
        this.quantity = quantity;
        this.size = size;
    }
    public static void dispenseCup(){
        System.out.println(volumePerCup);
        quantity--;
    }
    public static void refill(double amt){
        quantity += amt;
    }
}
