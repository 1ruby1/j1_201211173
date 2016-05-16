package com.j1.w11.template_2_Hook;

public abstract class CaffeInBeverageWithHook{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }
  public abstract void brew();
  public abstract void addCondiments();
  
  public void boilWater(){
    System.out.println("Caffe in Beverage BoilWater");
  }
  public void pourInCup(){  
    System.out.println("Caffe in Beverage PourInCup");
  }
  public boolean customerWantsCondiments(){
    return true;
  }
}