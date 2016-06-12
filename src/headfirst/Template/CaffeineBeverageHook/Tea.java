package headfirst.Template.CaffeineBeverageHook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class Tea extends CaffeineBeverage{

  public void brew(){
    System.out.println("TEA step a TEA BAG !!!!");
  }
  public void addCondiments(){
    System.out.println("TEA add LEMON ++++");
  }
  public boolean customerWantsComdiments(){
    String answer = getUserInput();
    
    if(answer.toLowerCase().startsWith("y"))return true;
    return false;
  }
  public String getUserInput(){
    String answer =null;
    System.out.println("add Lemon???? (y/n) ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    try{
      answer = in.readLine();
    }catch(Exception e){
      e.printStackTrace();
    }
    return answer;
  }
}