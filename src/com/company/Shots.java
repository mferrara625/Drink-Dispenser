package com.company;

public class Shots {
 static String flavorName;
 static double currentLiquidAmt;
 static int amtPerShot;

   public Shots(String flavorName, double currentLiquidAmt, int amtPerShot){
    this.flavorName = flavorName;
    this.currentLiquidAmt = currentLiquidAmt;
    this.amtPerShot = amtPerShot;
   }
   public static void dispense(){
    currentLiquidAmt -= amtPerShot;
    System.out.println(flavorName);
   }
   public static void getVolume(){
       System.out.println(DrinkDispenser.shotList.size());
   }
}
