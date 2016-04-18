/*
 *abstract Factory
 * ver03
 * 
 */

package com.j1.w7.abstractFactory;

public class PizzaMain{
  
  public static void main(String []args){
    PizzaStore nyPS = new NYPizzaStore();
    PizzaStore chPS = new ChicagoPizzaStore();
    
    Pizza nyP = nyPS.orderPizza("cheese");
    Pizza chP = chPS.orderPizza("cheese");
    
    System.out.println("Ethan ordered a " + nyP + "\n");
    System.out.println("Ethan ordered a " + chP + "\n");
  }
}