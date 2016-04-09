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

public class MallardDuck extends Duck{
  public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super(flyBehavior,quackBehavior);
  }
  public MallardDuck(){
    super(null,null);
  }
  public void display(){
    System.out.println("This duck is MallardDuck...!!");
  }
  public void swim(){
    System.out.println("MallardDuck duck swim ");
  }
}