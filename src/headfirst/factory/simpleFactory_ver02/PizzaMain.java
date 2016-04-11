/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver02 : 
 * We seperate some code.
 * But still have a problem.....
 */

package headfirst.factory.simpleFactory_ver02;

public class PizzaMain{
  public static void main(String []args){
    PizzaStore store = new PizzaStore(new PizzaFactory());
    Pizza chee = store.orderPizza("cheese");
    Pizza pepp = store.orderPizza("Pepperoni");
    
    chee.prepare();
    chee.bake();
    chee.cut();
    chee.box();
    System.out.println();
    pepp.prepare();
    pepp.bake();
    pepp.cut();
    pepp.box();
    System.out.println();
  }
}