/*
 *abstract Factory
 * ver03
 * 
 */

package com.j1.w7.abstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
  
  public Dough createDough(){
    return new ThinCrustDough();
  }
  public Cheese createCheese(){
    return new ReggianoCheese();
  }
  
}