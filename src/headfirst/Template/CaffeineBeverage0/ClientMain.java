package headfirst.Template.CaffeineBeverage0;

public class ClientMain{
  public static void main(String[] args){
    Coffee coffee = new Coffee();
    coffee.prepareRecipe();

    Tea tea = new Tea();
    tea.prepareRecipe();
  }
}