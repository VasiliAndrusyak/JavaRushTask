package com.javarush.task.task15.task1530;

/* 
Template pattern
*/



public class Solution {
    public static void main(String[] args) {

        DrinkMaker maker = new TeaMaker();
        DrinkMaker maker1 = new LatteMaker();
        maker.makeDrink();
        maker1.makeDrink();
    }
}
