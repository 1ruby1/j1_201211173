package headfirst.templatemethod.barista;

public class BeverageTestDrive {
 public static void main(String[] args) {
 
  Tea tea = new Tea();
  Coffee coffee = new Coffee();
  CoffeeMacchiato coffee2 = new CoffeeMacchiato();
 
  System.out.println("\nMaking tea...");
  tea.prepareRecipe();
 
  System.out.println("\nMaking coffee...");
  coffee.prepareRecipe();

  System.out.println("\nMaking CoffeeMacchiato...");
  coffee2.prepareRecipe();
 
  TeaWithHook teaHook = new TeaWithHook();
  CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
  System.out.println("\nMaking tea...");
  teaHook.prepareRecipe();
 
  System.out.println("\nMaking coffee...");
  coffeeHook.prepareRecipe();
  
  System.out.println("\nMaking CoffeeMacchiato...");
  coffeeHook.prepareRecipe();
 }
}