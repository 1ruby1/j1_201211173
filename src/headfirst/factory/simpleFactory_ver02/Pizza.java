/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver02 : 
 * We seperate some code.
 * But still have a problem.....
 */

package headfirst.factory.simpleFactory_ver02;

public abstract class Pizza{
 private String name;
  private String topping;
  private int bakeTime;
  
  public Pizza(){
    this("originPizza","originTopping",5);
  }
  public Pizza(String name, String topping, int bakeTime){
    this.name = name;
    this.topping = topping;
    this.bakeTime = bakeTime;
  }
  
  public void prepare(){
    System.out.println("This is "+this.name);
  }
  public String topping(){
    return this.name+" topping : "+this.topping;
  }
  public void bake(){
    System.out.println("Bake Time is "+this.bakeTime);
  }
  public void cut(){
    System.out.println("Cutting "+this.name);
  }
  public void box(){
    System.out.println("Boxxing "+this.name);
  }
  
  public String getName(){return this.name;}
  public void setName(String name){this.name=name;}
  public String getTopping(){return this.topping;}
  public void setTopping(String topping){this.topping=topping;}
  public int getBakeTime(){return this.bakeTime;}
  public void setBakeTime(int bakeTime){this.bakeTime=bakeTime;}
}

