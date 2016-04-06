package com.j1.w6.simpleFactory;

abstract public class PizzaTestMain{
  public static void main(String [] args){
    SimplePizzaFactory fac = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(fac);
    Pizza chPizza = store.orderPizza("cheesePizza");
    Pizza vgPizza = store.orderPizza("veggiPizza");
    
    chPizza.prepare();
    System.out.println(chPizza.topping());
    chPizza.bake();
    chPizza.cut();
    chPizza.box();
    System.out.println();
    vgPizza.prepare();
    System.out.println(vgPizza.topping());
    vgPizza.bake();
    vgPizza.cut();
    vgPizza.box();
  }
}