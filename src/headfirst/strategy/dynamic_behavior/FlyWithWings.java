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

public class FlyWithWings implements FlyBehavior{
  public void fly(){
    System.out.println("Fly With Wings <||>");
  }
}