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

public class FlyNoWay implements FlyBehavior{
  public void fly(){
    System.out.println("Can't Fly....T=T");
  }
}