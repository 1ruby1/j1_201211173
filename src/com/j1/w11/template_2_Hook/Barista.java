package com.j1.w11.template_2_Hook;

public class Barista{
   public static void main(String[] args){
    com.j1.w11.template_2.Tea tea = new com.j1.w11.template_2.Tea();
    com.j1.w11.template_2.Coffee coffee = new com.j1.w11.template_2.Coffee();
 
    System.out.println("\nMaking tea...");
    tea.prepareRecipe();
 
    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();

 
    TeaWithHook teaHook = new TeaWithHook();
    CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
    System.out.println("\nMaking tea...");
    teaHook.prepareRecipe();
 
    System.out.println("\nMaking coffee...");
    coffeeHook.prepareRecipe();
  }
}