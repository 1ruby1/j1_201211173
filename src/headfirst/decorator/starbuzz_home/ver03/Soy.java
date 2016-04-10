/*
 * @author ruby
 * @since 2016_04_10
 * ver03 Beverage decorator
 * 
 * has a relation ship
 * with abstract class or interface.
 * 
 * Porpose is to flexible, 
 * class type is dynamically determined 
 * (detemined is runtime) and
 * new method can be added easily.
 */

package headfirst.decorator.starbuzz_home.ver03;

public class Soy extends CondimentPrettyPrint{
  
  private Beverage bever;
  public Soy(Beverage bever){
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
    return "Soy,"+this.bever.getDescription();
  }
  //overriding
  public double cost(){
    return 1.0+this.bever.cost();
  }
}