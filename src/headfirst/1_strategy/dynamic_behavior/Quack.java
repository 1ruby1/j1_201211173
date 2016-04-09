/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.03 DUCK
 * With interface
 * &
 * make deligation class which implements interface
 * &
 * choose behavior dynamically.
 */

package headfirst.strategy.dynamic_behavior;

public class Quack implements QuackBehavior{
  public void quack(){
    System.out.println("Quack !!");
  }
}