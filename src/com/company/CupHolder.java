package com.company;

public class CupHolder {
    public double volumePerCup;
    public double quantity;
    public String size;

    public CupHolder(double volumePerCup, double quantity, String size){
        this.volumePerCup = volumePerCup;
        this.quantity = quantity;
        this.size = size;
    }
    public void dispenseCup(){
        System.out.println(volumePerCup);
        quantity--;
    }
    public void refill(double amt){
        quantity += amt;
    }
}
