/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver02 : 
 * We seperate some code.
 * But still have a problem.....
 */

package headfirst.factory.simpleFactory_ver02;

public class PizzaStore{
  private PizzaFactory factory;
  
  public PizzaStore(PizzaFactory factory){
    this.factory = factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza=this.factory.createPizza(type);
    
    //must seperate from store.....
    /*if(type.equals("cheese")){
      pizza = new CheesePizza();
    }else if(type.equals("greek")){
      pizza = new GreekPizza();
    }else if(type.equals("Pepperoni")){
      pizza = new PepperoniPizza();
    }*/
    
    
    System.out.println("===== process make "+type+" =====");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    System.out.println("=================================\n");
    
    return pizza;
  }
}

