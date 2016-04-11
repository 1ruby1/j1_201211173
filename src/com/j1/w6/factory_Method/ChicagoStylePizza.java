package com.j1.w6.factory_method;

public class ChicagoStylePizza extends Pizza{
  
  public ChicagoStylePizza(String name){
    super(name);
  }
  public ChicagoStylePizza(){
    this("ChicagoStylePizza");
  }
}
  