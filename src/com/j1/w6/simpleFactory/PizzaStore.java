package com.j1.w6.simpleFactory;

public class PizzaStore{
  SimplePizzaFactory pizzaFactory;
  
  public PizzaStore(SimplePizzaFactory pizzaFactory){
    //DMI : Dynamic Method Invocation 
    //(at compile time we don't know but at run time we know.)
    this.pizzaFactory = pizzaFactory;
  }
  
  public Pizza orderPizza(String type){
    Pizza pizza=null;
    pizza = pizzaFactory.createPizza(type);
    /*pizza.prepare();
    pizza.topping();
    pizza.bake();
    pizza.cut();
    pizza.box();
    */
    return pizza;
  }
}