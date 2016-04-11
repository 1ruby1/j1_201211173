package com.j1.w6.factory_method;

public abstract class PizzaStore{
 
  public Pizza orderPizza(String type){
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.cut();
    pizza.box();
    return pizza;
  }
 
  /*factory method : only subclass can define this method body.*/
  private abstract Pizza createPizza(String type);
}
  