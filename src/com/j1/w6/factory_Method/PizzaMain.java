package com.j1.w6.factory_method;

public class PizzaMain{
  public static void main(String []args){
    PizzaStore nyStore = new NYPizzaStore();
    nyStore.orderPizza("cheese");
    
    System.out.println(pizza.getName());
  }
}