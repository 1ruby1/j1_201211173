package com.j1.w11.template_1;

public class Tea{
 public void prepareRecipe(){
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
  public void boilWater(){
    System.out.println("Tea BoilWater");
  }
  public void steepTeaBag(){
    System.out.println("Tea steepTeaBag");
  }
  public void pourInCup(){
    System.out.println("Tea pourInCup");
  }
  public void addLemon(){
    System.out.println("Tea addLemon");
  }
}