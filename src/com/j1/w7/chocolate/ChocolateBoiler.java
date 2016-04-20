/*
 * singleton classic
 */

package com.j1.w7.chocolate;

public class ChocolateBoiler{
  private static ChocolateBoiler INSTANCE;
  private static int NUMCALLED   //20151025 jsl
  private boolean empty;
  private boolean boiled;
  
  private ChocolateBoiler(){
    this.empty = false;
    this.boiled = false;
  }
  
  public static ChocolateBoiler getINSTANCE(){
    if(INSTANCE == null){
      INSTANCE = new ChocolateBoiler();
      NUMCALLED = 0;
    }
    NUMCALLED++;
    System.out.println("Returning instance of Chocolate Boiler");
    System.out.println("jsl: numCalled "+numCalled++);
    return INSTANCE;
  }
  public void fill() {
  if (isEmpty()) {
   empty = false;
   boiled = false;
   // fill the boiler with a milk/chocolate mixture
  }
 }
 
 public void drain() {
  if (!isEmpty() && isBoiled()) {
   // drain the boiled milk and chocolate
   empty = true;
  }
 }
 
 public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   boiled = true;
  }
 }
  
 public boolean isEmpty() {
  return empty;
 }
 
 public boolean isBoiled() {
  return boiled;
 }
}