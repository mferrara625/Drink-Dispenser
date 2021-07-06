package com.company;

import java.util.ArrayList;
import java.util.List;



public class DrinkDispenser {
    static List<Syrups> syrupList = new ArrayList<>();
    static List<Shots> shotList = new ArrayList<>();


    public static void serveDrink(CupHolder size, Syrups syrupType){
        size.dispenseCup();
        syrupType.dispense(size.volumePerCup);
        System.out.println(size.size + " " + syrupType.flavorName);
    }
    public static void serveDrink(CupHolder size, Syrups syrupType, Shots shotIndex, int amount){
        size.dispenseCup();
        syrupType.dispense(size.volumePerCup);
        for (int i = 0; i < amount; i++){
            shotIndex.dispense();
        }
        System.out.println(size + " " + shotIndex + " " + syrupType);
    }
    public static void lowSyrups(double vol){
        for (Syrups syrup : syrupList){
            if(syrup.currentLiquidAmt < vol){
                System.out.println(syrup);
            }
        }
    }
    public void lowShots(double num){
        for (Shots shot : shotList){
            if(shot.currentLiquidAmt < num){
                System.out.println(shot);
            }
        }
    }
    public void addSyrup(){

    }
//    public String toString(){
//        return + " " +
//    }

 }
