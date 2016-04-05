/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.02 DUCK
 * With interface
 */

package headfirst.strategy.ver02;

public class DecoyDuck extends Duck{
  public void display(){
    System.out.println("This duck is DecoyDuck...!!");
  }
  public void swim(){
    System.out.println("DecoyDuck duck swim ");
  }
}