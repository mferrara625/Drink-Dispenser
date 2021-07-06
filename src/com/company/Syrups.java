package com.company;

public class Syrups {
    public String flavorName;
    public double currentLiquidAmt;
    public int amtPerShot;

    public Syrups(String flavorName, double currentLiquidAmt, int amtPerShot){
        this.flavorName = flavorName;
        this.currentLiquidAmt = currentLiquidAmt;
        this.amtPerShot = amtPerShot;
    }
    public void dispense(double amt){
        currentLiquidAmt -= amt;
    }
    public void getVolume(){
        System.out.println(currentLiquidAmt);
    }
    
}
