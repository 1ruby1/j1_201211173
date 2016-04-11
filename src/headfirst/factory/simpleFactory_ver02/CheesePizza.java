/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver02 : 
 * We seperate some code.
 * But still have a problem.....
 */

package headfirst.factory.simpleFactory_ver02;

public class CheesePizza extends Pizza{
 
  public CheesePizza(){
    this("CheesePizza","Cheese Topping",5);
  }
  public CheesePizza(String name, String topping, int bakeTime){
    super(name,topping,bakeTime);
  }
  
  /*
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
  }*/
}

