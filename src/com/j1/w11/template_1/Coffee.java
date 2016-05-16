package com.j1.w11.template_1;

public class Coffee{
  public void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater(){
    System.out.println("Coffee BoilWater");
  }
  public void brewCoffeeGrinds(){
    System.out.println("Coffee brewCoffeeGrinds");
  }
  public void pourInCup(){
    System.out.println("Coffee pourInCup");
  }
  public void addSugarAndMilk(){
    System.out.println("Coffee addSugarAndMilk");
  }
  
}