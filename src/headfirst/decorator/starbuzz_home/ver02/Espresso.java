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

public class Espresso extends Beverage{
  public Espresso(){
    this("Espresso");
  }
  public Espresso(String description){
    super(description);
  }
  
  public double cost(){
    return 2.0;
  }
}