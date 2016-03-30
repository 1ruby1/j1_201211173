package headfirst.decorator.starbuzz;

public class StartbuzzCoffeeMain{
  public static void main (String[] args){
    Beverage darkRoast = new DarkRoast();
    Mocha mocha = new Mocha(darkRoast);
    System.out.println(mocha.getDescription()+" cost : "+mocha.cost()+"\n");
    
    
    Whip whip = new Whip(mocha);
    System.out.println(whip.getDescription()+" cost : "+whip.cost());
    
  }
}

abstract class Beverage{
  
  private String description = "Unknown Beverage";
  public String getDescription(){
    return description;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public abstract double cost();
}

class Espresso extends Beverage{
  public Espresso(){
    super.setDescription("Espresso");
  }
  public double cost(){
    return 1.99;
  }
}

class DarkRoast extends Beverage{
  public DarkRoast(){
    super.setDescription("DarkRoast Coffee");
  }
  public double cost(){
    return 0.99;
  }
}

abstract class CondimentDecorator extends Beverage{
  public abstract String getDescription();
}

class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage b){
    this.beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+". Mocha";
  }
  public double cost(){
    return beverage.cost()+0.20;
  }
}

class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage b){
    this.beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+". Whip";
  }
  public double cost(){
    return beverage.cost()+0.10;
  }
}

