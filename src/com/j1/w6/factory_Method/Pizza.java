package com.j1.w6.factory_method;

public abstract class Pizza{
  private String name;
  
  public void prepare(){
    System.out.println("Baking........."):
  }
  public void bake(){
    System.out.println("Baking........."):
  }
  public void cut(){
    System.out.println("Cutting........."):
  }
  public void box(){
    System.out.println("Boxxing........."):
  }
  
  /*@setter*/
  public String getName(String name){
    this.name= name;
  }
  /*@getter*/
  public void getName(){
    return this.name;
  }
}
  