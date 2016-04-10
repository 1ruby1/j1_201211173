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

public abstract class CondimentDecorator extends Beverage{
  
  public CondimentDecorator(){
    this("no description");
  }
  public CondimentDecorator(String description){
    super.setDescription(description);
  }
  
  public void setDescription(String description){
    super.setDescription(description);
  }
  public abstract String getDescription();
  
  public abstract double cost();
}