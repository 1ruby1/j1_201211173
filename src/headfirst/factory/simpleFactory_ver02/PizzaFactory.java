/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver02 : 
 * We seperate some code.
 * But still have a problem.....
 */

package headfirst.factory.simpleFactory_ver02;

public class PizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza=null;
    if(type.equals("cheese")){
      pizza = new CheesePizza();
    }else if(type.equals("greek")){
      pizza = new GreekPizza();
    }else if(type.equals("Pepperoni")){
      pizza = new PepperoniPizza();
    }
    
    return pizza;
  }
}