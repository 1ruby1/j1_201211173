/*
 * @author ruby
 * @since 2016_04_10
 * ver03 Beverage decorator
 * has a relation ship
 * with abstract class or interface.
 * 
 * Porpose is to flexible, 
 * class type is dynamically determined 
 * (detemined is runtime) and
 * new method can be added easily.
 */

package headfirst.decorator.starbuzz_home.ver03;

public class Decaf extends Beverage{
  public Decaf(){
    this("Decaf");
  }
  public Decaf(String description){
    super(description);
  }
  
  public double cost(){
    return 1.5;
  }
}