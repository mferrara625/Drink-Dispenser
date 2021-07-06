package com.company;

public class Shots {
 public String flavorName;
 public double currentLiquidAmt;
 public int amtPerShot;

   public Shots(String flavorName, double currentLiquidAmt, int amtPerShot){
    this.flavorName = flavorName;
    this.currentLiquidAmt = currentLiquidAmt;
    this.amtPerShot = amtPerShot;
   }
   public void dispense(){
    currentLiquidAmt -= amtPerShot;
    System.out.println(flavorName);
   }
   public void getVolume(){
       System.out.println(DrinkDispenser.shotList.size());
   }
}
