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

public class ModelDuck extends Duck{
  public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super(flyBehavior,quackBehavior);
  }
  public ModelDuck(){
    super(null,null);
  }
  public void display(){
    System.out.println("This duck is ModelDuck...!!");
  }
  public void swim(){
    System.out.println("ModelDuck duck swim ");
  }
}