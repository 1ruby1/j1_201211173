/*
 *abstract Factory
 * ver03
 * 
 */

package com.j1.w7.abstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
  
  public Dough createDough(){
    return new ThickCrustDough();
  }
  public Cheese createCheese(){
    return new MozzarellaCheese();
  }
  
}