package headfirst.Template.CaffeineBeverage0;

public class Tea extends CaffeineBeverage{
  public void prepareRecipe(){
    System.out.println("----prepare TEA------------");
    super.boilWater();
    this.stepTeaBag();
    super.pourInCup();
    this.addLemon();
    System.out.println("-----------------------------\n");
  }
  public void stepTeaBag(){
    System.out.println("TEA step a TEA BAG !!!!");
  }
  public void addLemon(){
    System.out.println("TEA add LEMON ++++");
  }
}