package headfirst.Template.CaffeineBeverageHook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class Coffee extends CaffeineBeverage{
  
  public void brew(){
    System.out.println("CoFFEE brewing !!!!");
  }
  public void addCondiments(){
    System.out.println("CoFFEE add SUGAR and MILK ++++");
  }
  public boolean customerWantsComdiments(){
    String answer = getUserInput();
    
    if(answer.toLowerCase().startsWith("y"))return true;
    return false;
  }
  public String getUserInput(){
    String answer =null;
    System.out.println("add Milk and Sugar???? (y/n) ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    try{
      answer = in.readLine();
    }catch(Exception e){
      e.printStackTrace();
    }
    return answer;
  }
}