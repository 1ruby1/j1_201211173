package headfirst.templatemethod.barista;

public class CoffeeMacchiato extends Coffee {
 public void brew() {
  System.out.println("Dripping Coffee Macchiato through filter");
 }
 public void addCondiments() {
  System.out.println("Adding Milk and froth ^^");
 }
}