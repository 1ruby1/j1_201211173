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

public class RubberDuck extends Duck{
  public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super(flyBehavior,quackBehavior);
  }
  public RubberDuck(){
    super(null,null);
  }
  public void display(){
    System.out.println("This duck is RubberDuck...!!");
  }
  public void swim(){
    System.out.println("RubberDuck duck swim ");
  }
}