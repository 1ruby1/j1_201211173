/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.01 DUCK
 * 
 */

package headfirst.strategy.ver01;

public class MallardDuck extends Duck{
  public void swim(){
    System.out.println("This duck swim ");
  }
  public void display(){
    System.out.println("This duck is MalardDuck...!!");
  }
  public void quack(){
    System.out.println("This duck sounds quack quuuu.");
  }
}