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

public class DuckMain{
  public static void main (String []args){
    Duck decoyDuck = new DecoyDuck(new FlyNoWay(),new MuteQuack());
    Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeack());
    Duck redheadDuck = new RedheadDuck(new FlyWithWings(), new Quack());
    Duck mallardDuck = new MallardDuck(new FlyWithWings(), new MuteQuack());
    Duck modelDuck = new MallardDuck(new FlyNoWay(), new Quack());
    
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
    System.out.println("\n========================================\n");
    modelDuck.display();modelDuck.swim();
    modelDuck.performFly();modelDuck.performQuack();
    modelDuck.setFlyBehavior(new FlyRocketPower());
    System.out.println("!change!");
    modelDuck.performFly();
    System.out.println();
    
  }
}