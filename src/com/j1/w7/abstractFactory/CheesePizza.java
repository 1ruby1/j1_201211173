/*
 *abstract Factory
 * ver03
 * 
 */

package com.j1.w7.abstractFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
 
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + this.getName());
        this.setDough(ingredientFactory.createDough());
        this.setCheese(ingredientFactory.createCheese());
    }
}