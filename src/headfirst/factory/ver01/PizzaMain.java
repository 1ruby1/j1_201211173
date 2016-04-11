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

public class PizzaMain{
  public static void main(String []args){
    PizzaStore store = new PizzaStore();
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