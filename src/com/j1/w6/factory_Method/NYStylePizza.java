package com.j1.w6.factory_method;

public class NYStylePizza extends Pizza{
  
  public NYStylePizza(String name){
    super(name);
  }
  public NYStylePizza(){
    this("NYStylePizza");
  }
}
  