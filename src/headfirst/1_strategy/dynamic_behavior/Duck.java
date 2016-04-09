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

public class Duck{
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;
  
  public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }
  public Duck(){
    this(null,null);
  }
  
  public void swim(){
    System.out.println("This duck swim ");
  }
  public void display(){
    System.out.println("This is duck");
  }
  public void performFly(){
    this.flyBehavior.fly();
  }
  public void performQuack(){
    this.quackBehavior.quack();
  }
  
  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }
  public FlyBehavior getFlyBehavior(){
    return this.flyBehavior;
  }
  public void setQuackBehavior(QuackBehavior quackBehavior){
    this.quackBehavior = quackBehavior;
  }
  public QuackBehavior getQuackBehavior(){
    return this.quackBehavior;
  }
  
}