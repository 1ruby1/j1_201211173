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

public class DuckMain{
  public static void main (String []args){
    Duck decoyDuck = new DecoyDuck(new FlyNoWay(),new MuteQuack());
    Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeack());
    Duck redheadDuck = new RedheadDuck(new FlyWithWings(), new Quack());
    Duck mallardDuck = new MallardDuck(new FlyWithWings(), new MuteQuack());
    
    decoyDuck.display();decoyDuck.swim();
    decoyDuck.performFly();decoyDuck.performQuack();
    System.out.println();
    rubberDuck.display();rubberDuck.swim();
    rubberDuck.performFly();rubberDuck.performQuack();
    System.out.println();
    redheadDuck.display();redheadDuck.swim();
    redheadDuck.performFly();redheadDuck.performQuack();
    System.out.println();
    mallardDuck.display();mallardDuck.swim();
    mallardDuck.performFly();mallardDuck.performQuack();
    System.out.println();
    
  }
}