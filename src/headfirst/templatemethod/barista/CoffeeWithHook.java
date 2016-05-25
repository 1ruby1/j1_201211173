package headfirst.templatemethod.barista;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
 private String condiments="Adding Sugar and Milk";
  
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 
 public void addCondiments() {  
  System.out.println("Adding Sugar and Milk");
 }
 public void addCondiments() {  
  System.out.println(this.condiments);
 }
 
 public boolean customerWantsCondiments() {

  String answer = getUserCoffeeMenu();

  if (answer.toLowerCase().startsWith("s")) {
    answer = getUserInput();
  } else if(answer.toLowerCase().startsWith("c")){
    answer = getUserInput("Would you like Milk and froth with your coffee (y/n)? ");
    if(answer.toLowerCase().startsWith("y"))this.condiments = "Adding Milk and froth ^^";
  }
  if(answer.toLowerCase().startsWith("y"))return true;
    else return false;
 }
 
 private String getUserCoffeeMenu() {
  String answer = null;

  System.out.println("What type of coffee?(s:simple coffee / c: coffee macchiato) : "); 

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  try {
   answer = in.readLine();
  } catch (IOException ioe) {
   System.err.println("IO error trying to read your answer");
  }
  if (answer == null) {
   return "no";
  }
  return answer;
 }
 
 private String getUserInput() {
  String answer = null;

  System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  try {
   answer = in.readLine();
  } catch (IOException ioe) {
   System.err.println("IO error trying to read your answer");
  }
  if (answer == null) {
   return "no";
  }
  return answer;
 }
 private String getUserInput(String str) {
  String answer = null;

  System.out.print(str);

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  try {
   answer = in.readLine();
  } catch (IOException ioe) {
   System.err.println("IO error trying to read your answer");
  }
  if (answer == null) {
   return "no";
  }
  return answer;
 }
}