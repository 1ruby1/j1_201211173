/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.02 DUCK
 * With interface
 * &
 * make deligation class which implements interface
 */

package headfirst.strategy.ver03;

public class RedheadDuck extends Duck{
  public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super(flyBehavior,quackBehavior);
  }
  public RedheadDuck(){
    super(null,null);
  }
  public void display(){
    System.out.println("This duck is RedheadDuck...!!");
  }
  public void swim(){
    System.out.println("RedheadDuck duck swim ");
  }
}