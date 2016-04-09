/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.02 DUCK
 * With interface
 */

package headfirst.strategy.ver02;

public class MallardDuck extends Duck implements Flyable,Quackable{
  public void display(){
    System.out.println("This duck is MalardDuck...!!");
  }
  public void swim(){
    System.out.println("MalardDuck duck swim ");
  }
  public void fly(){
    System.out.println("MalardDuck duck is Flying...!!");
  }
  public void quack(){
    System.out.println("MalardDuck duck sounds quack quuuu.");
  }
}