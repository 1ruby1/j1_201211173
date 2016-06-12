package headfirst.Template.CaffeineBeverage0;

public class Coffee extends CaffeineBeverage{
  public void prepareRecipe(){
    System.out.println("----prepare COFFEE------------");
    super.boilWater();
    this.brewCoffeeGrinds();
    super.pourInCup();
    this.addSugarAndMilk();
    System.out.println("-----------------------------\n");
  }
  public void brewCoffeeGrinds(){
    System.out.println("CoFFEE brewing !!!!");
  }
  public void addSugarAndMilk(){
    System.out.println("CoFFEE add SUGAR and MILK ++++");
  }
}