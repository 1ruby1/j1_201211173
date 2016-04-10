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

public abstract class Beverage{
  private String description;
  public Beverage(){
    this("no description");
  }
  public Beverage(String description){
    this.description = description;
  }
  
  public void setDescription(String description){
    this.description = description;
  }
  public String getDescription(){
    return this.description;
  }
  
  public abstract double cost();
}