package com.j1.w11.template_2;

public abstract class CaffeInBeverage{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  public abstract void brew();
  public abstract void addCondiments();
  
  public void boilWater(){
    System.out.println("Caffe in Beverage BoilWater");
  }
  public void pourInCup(){  
    System.out.println("Caffe in Beverage PourInCup");
  }
}