/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver01 : 
 * We have to seperate 
 * which part can be changed
 * or which part don't chang
 */

package headfirst.factory.ver01;

public class PizzaStore{
  
  public Pizza orderPizza(String type){
    Pizza pizza=null;
    
    //must seperate from store.....
    if(type.equals("cheese")){
      pizza = new CheesePizza();
    }else if(type.equals("greek")){
      pizza = new GreekPizza();
    }else if(type.equals("Pepperoni")){
      pizza = new PepperoniPizza();
    }
    
    System.out.println("process make "+type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    System.out.println();
    
    return pizza;
  }
}

