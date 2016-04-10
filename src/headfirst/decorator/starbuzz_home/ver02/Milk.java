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

public class Milk extends CondimentDecorator{
  
  private Beverage bever;
  public Milk(Beverage bever){
    this.bever = bever;
  }
  
 //setter
  public void setBeverage(Beverage bever){
    this.bever = bever;
  }
  //getter
  public Beverage getBeverage(){
    return this.bever;
  }
  
  //abstract_
  public String getDescription(){
    return "Milk & "+this.bever.getDescription();
  }
  //overriding
  public double cost(){
    return 2.2+this.bever.cost();
  }
}