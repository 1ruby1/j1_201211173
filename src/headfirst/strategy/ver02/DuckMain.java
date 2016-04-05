/*
 * @author ruby
 * @since 2016_04_05
 * 
 * for strategy
 * ver.02 DUCK
 * With interface
 */

package headfirst.strategy.ver02;

public class DuckMain{
  public static void main (String []args){
    Duck decoyDuck = new DecoyDuck();
    
    Quackable rubberQuack = new RubberDuck();
    Quackable redheadQuack = new RedheadDuck();
    Quackable mallardQuack = new MallardDuck();
    
    Flyable redheadFly = new RedheadDuck();
    Flyable mallardFly = new MallardDuck();
    
    System.out.println();
    rubberQuack.quack();
    redheadQuack.quack();
    mallardQuack.quack();
    System.out.println();
    redheadFly.fly();
    mallardFly.fly();
    System.out.println();
    decoyDuck.display();decoyDuck.swim();
    ((Duck)rubberQuack).display();((Duck)rubberQuack).swim();
    ((Duck)redheadQuack).display();((Duck)redheadQuack).swim();
    ((Duck)mallardFly).display();((Duck)mallardFly).swim();
    System.out.println();
  }
}