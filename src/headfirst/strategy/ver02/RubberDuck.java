/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.02 DUCK
 * With interface
 */

package headfirst.strategy.ver02;

public class RubberDuck extends Duck implements Quackable{
  public void display(){
    System.out.println("This duck is RubberDuck...!!");
  }
  public void swim(){
    System.out.println("RubberDuck duck swim ");
  }
  public void quack(){
    System.out.println("RubberDuck duck sounds quack quuuu.");
  }
}