package com.j1.w6.simpleFactory;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza=null;
    if(type.equals("cheesePizza")){
      pizza = new CheesePizza();
    }else if(type.equals("veggiPizza")){
      pizza = new VeggiPizza();
    }
    return pizza;
  }
}