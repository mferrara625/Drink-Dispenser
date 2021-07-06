package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CupHolder small = new CupHolder(20,50,"Small");
        CupHolder medium = new CupHolder(30, 50, "Medium");
        CupHolder large = new CupHolder(45, 50, "Large");
        Syrups coke = new Syrups("Coke",1000.00,5);
        DrinkDispenser.syrupList.add(coke);
        System.out.println(small.quantity);
        DrinkDispenser.serveDrink(small, coke);
        System.out.println(small.quantity);
        coke.getVolume();

    }
}
