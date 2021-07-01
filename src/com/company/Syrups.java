package com.company;

public class Syrups {
    String flavorName;
    static double currentLiquidAmt;
    int amtPerShot;

    public Syrups(String flavorName, double currentLiquidAmt, int amtPerShot){
        this.flavorName = flavorName;
        this.currentLiquidAmt = currentLiquidAmt;
        this.amtPerShot = amtPerShot;
    }
    public static void dispense(double amt){
        currentLiquidAmt -= amt;
    }
    public static void getVolume(){
        System.out.println(currentLiquidAmt);
    }
    
}
