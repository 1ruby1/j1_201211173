/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.01 DUCK
 * 
 */

package headfirst.strategy.ver01;

public class RedheadDuck extends Duck{
  public void swim(){
    System.out.println("This duck swim doesn't swim.....T T");
  }
  public void display(){
    System.out.println("This duck is RedheadDuck **");
  }
  public void quack(){
    System.out.println("This duck sounds quack uuuu.");
  }
}