/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.03 DUCK
 * With interface
 * &
 * make deligation class which implements interface
 */

package headfirst.strategy.ver03;

public class FlyWithWings implements FlyBehavior{
  public void fly(){
    System.out.println("Fly With Wings <||>");
  }
}