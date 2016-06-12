package headfirst.Template.CaffeineBeverageHook;

public abstract class CaffeineBeverage{
  public final void prepareRecipe(){
    System.out.println("-----------------------------");
    this.boilWater();
    this.brew();
    this.pourInCup();
    if(this.customerWantsComdiments())this.addCondiments();
    System.out.println("-----------------------------\n");
  }
  public abstract void brew();
  public abstract void addCondiments();
  public void boilWater(){
    System.out.println("BOILing Water ****");
  }
  
  public void pourInCup(){
    System.out.println("POUR In Cup ~~~");
  }
  public boolean customerWantsComdiments(){
    return true;
  }
}