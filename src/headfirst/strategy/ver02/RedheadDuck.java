/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.02 DUCK
 * With interface
 */

package headfirst.strategy.ver02;

public class RedheadDuck extends Duck implements Flyable,Quackable{
  public void display(){
    System.out.println("This duck is RedheadDuck...!!");
  }
  public void swim(){
    System.out.println("RedheadDuck duck swim ");
  }
  public void fly(){
    System.out.println("RedheadDuck duck is Flying...!!");
  }
  public void quack(){
    System.out.println("RedheadDuck duck sounds quack quuuu.");
  }
}