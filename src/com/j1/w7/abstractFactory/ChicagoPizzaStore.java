/*
 *abstract Factory
 * ver03
 * 
 */

package com.j1.w7.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        //this part is factory defined.(line 13)
        PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        return pizza;
    }
}