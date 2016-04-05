/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.01 DUCK
 * 
 */

package headfirst.strategy.ver01;

public class DuckMain{
  
  public static void main(String [] args){
    Duck mallDuck = new MallardDuck();
    Duck readDuck = new RedheadDuck();
  
    mallDuck.display();
    readDuck.display();
  }
}