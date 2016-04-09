/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.02 DUCK
 * With interface
 * &
 * make deligation class which implements interface
 * &
 * choose behavior dynamically.
 */

package headfirst.strategy.dynamic_behavior;

public class DecoyDuck extends Duck{
  public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super(flyBehavior,quackBehavior);
  }
  public DecoyDuck(){
    super(null,null);
  }
  public void display(){
    System.out.println("This duck is DecoyDuck...!!");
  }
  public void swim(){
    System.out.println("DecoyDuck duck swim ");
  }
}