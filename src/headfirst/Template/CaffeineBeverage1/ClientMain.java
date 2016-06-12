package headfirst.Template.CaffeineBeverage1;

public class ClientMain{
  public static void main(String[] args){
    Coffee coffee = new Coffee();
    coffee.prepareRecipe();

    Tea tea = new Tea();
    tea.prepareRecipe();
  }
}