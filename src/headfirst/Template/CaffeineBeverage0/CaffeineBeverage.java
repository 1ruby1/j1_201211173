package headfirst.Template.CaffeineBeverage0;

public abstract class CaffeineBeverage{
  public abstract void prepareRecipe();
  
  public void boilWater(){
    System.out.println("BOILing Water ****");
  }
  
  public void pourInCup(){
    System.out.println("POUR In Cup ~~~");
  }
}