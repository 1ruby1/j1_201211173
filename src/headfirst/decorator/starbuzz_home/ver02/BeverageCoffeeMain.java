/*
 * @author ruby
 * @since 2016_04_10
 * ver02 Beverage decorator
 * has a relation ship
 * with abstract class or interface.
 * Porpose is to flexible, 
 * class type is dynamically determined 
 * (detemined is runtime) and
 * new method can be added easily.
 */

package headfirst.decorator.starbuzz_home.ver02;

public class BeverageCoffeeMain{
  public static void main(String [] args){
    Beverage decaf = new Decaf();
    Milk milk = new Milk(decaf);
    Mocha mocha1 = new Mocha(milk);
    Mocha mocha2 = new Mocha(mocha1);
    Whip whip = new Whip(mocha2);
    
    Beverage house = new HouseBlend();
    Soy soy = new Soy(house);
    Whip whip1 = new Whip(soy);
    Whip whip2 = new Whip(whip1);
    
    System.out.println("\ndescription -> "+whip.getDescription());
    System.out.println("cost -> "+whip.cost());
    System.out.println("\ndescription -> "+whip2.getDescription());
    System.out.println("cost -> "+whip2.cost()+"\n");
  }
}