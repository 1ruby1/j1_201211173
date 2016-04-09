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

public class Squeack implements QuackBehavior{
  public void quack(){
    System.out.println("SQUEACK !!");
  }
}