/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver02 : 
 * We seperate some code.
 * But still have a problem.....
 */

package headfirst.factory.simpleFactory_ver02;

public class GreekPizza extends Pizza{
 
  public GreekPizza(){
    this("GreekPizza","Greek Topping",5);
  }
  public GreekPizza(String name, String topping, int bakeTime){
    super(name,topping,bakeTime);
  }
 
}

