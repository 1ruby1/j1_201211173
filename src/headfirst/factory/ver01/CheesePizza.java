/*
 *@author ruby
 * @since 2016_04_11
 * 
 * ver01 : 
 * We have to seperate 
 * which part can be changed
 * or which part don't chang
 */

package headfirst.factory.ver01;

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

