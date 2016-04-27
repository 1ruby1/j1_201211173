package st.factory;

public class Factory_AFC{
  public static void main(String[] args){
    PizzaStore nyS = new NYPizzaStore();
    PizzaStore chS = new ChicagoPizzaStore();
    Pizza p1 = nyS.orderPizza("cheese");
    p1.setName("NY Style Cheese Pizza....");
    System.out.println(p1+"\n");
    
    Pizza p2 = chS.orderPizza("cheese");
    p2.setName("Chicago Style Cheese Pizza ^^");
    System.out.println(p2+"\n");
    
    p1 = nyS.orderPizza("Pepperoni");
    p1.setName("NY Style Pepperoni Pizza....");
    System.out.println(p1+"\n");
    
    p2 = chS.orderPizza("Pepperoni");
    p2.setName("Chicago Style Pepperoni Pizza ^^");
    System.out.println(p2+"\n");
    
    
  }
}

interface PizzaIngredientFactory{
  public Cheese createCheese();
  public Dough createDough();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
}
interface Cheese{
  public String toString();
}
class NYCheese implements Cheese{
  public String toString(){return "NYCheese";}
}
class ChiagoCheese implements Cheese{
  public String toString(){return "ChiagoCheese";}
}

interface Dough{
  public String toString();
}
class NYDough implements Dough{
  public String toString(){return "NYDough";}
}
class ChiagoDough implements Dough{
  public String toString(){return "ChiagoDough";}
}

interface Pepperoni{
  public String toString();
}
class NYPepperoni implements Pepperoni{
  public String toString(){return "NYPepperoni";}
}
class ChiagoPepperoni implements Pepperoni{
  public String toString(){return "ChiagoPepperoni";}
}

interface Veggies{
  public String toString();
}
class Garlic implements Veggies{
  public String toString(){return "Garlic";}
}
class Onion implements Veggies{
  public String toString(){return "Onion";}
}
class RedPepper implements Veggies{
  public String toString(){return "RedPepper";}
}
class MushRoom implements Veggies{
  public String toString(){return "MushRoom";}
}

class NYPizzaIngredientFactory implements PizzaIngredientFactory{
  public Cheese createCheese(){
    return new NYCheese();
  }
  public Dough createDough(){
    return new NYDough();
  }
  public Veggies[] createVeggies(){
    Veggies v[] = {new Garlic(), new Onion(), new RedPepper()};
    return v;
  }
  public Pepperoni createPepperoni(){
    return new NYPepperoni();
  }
}
class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
  public Cheese createCheese(){
    return new ChiagoCheese();
  }
  public Dough createDough(){
    return new ChiagoDough();
  }
  public Veggies[] createVeggies(){
    Veggies v[] = {new Garlic(), new Onion(), new MushRoom()};
    return v;
  }
  public Pepperoni createPepperoni(){
    return new ChiagoPepperoni();
  }
}

///////////////////////////////////////////////////////

abstract class Pizza{
  String name;
  Cheese cheese;
  Dough dough;
  Veggies[] veggies;
  Pepperoni pepperoni;
  
  public Pizza(String name){this.name = name;}
  
  public abstract void prepare();
  
  public void bake(){System.out.println("bake");}
  public void cut(){System.out.println("cut");} 
  public  void box(){System.out.println("box");}
  public  void setName(String name){this.name = name; }
  
  public String getName(){    return this.name;}
 
  public String toString(){
    String res = new String();
    res+="---------- "+this.name+"---------- \n";
    if(this.cheese!=null)res+=this.cheese+" + ";
    if(this.dough!=null)res+=this.dough+" + ";
    if(this.pepperoni!=null)res+=this.pepperoni+" + ";
    if(this.veggies!=null){
      for (int i = 0; i < this.veggies.length; i++) {
        res+=this.veggies[i]+" + ";
      }
    }
    
    res=res.substring(0,res.length()-2);
    return res;
  }
}
class CheesePizza extends Pizza{
  PizzaIngredientFactory factory;
  public CheesePizza(PizzaIngredientFactory factory){
    super("CheesePizza");
    this.factory = factory;
  }
  public void prepare(){
    this.cheese=this.factory.createCheese();
    this.dough = this.factory.createDough();
    this.veggies = this.factory.createVeggies();
  }
}
class PepperoniPizza extends Pizza{
  PizzaIngredientFactory factory;
  public PepperoniPizza(PizzaIngredientFactory factory){
    super("PepperoniPizza");
    this.factory = factory;
  }
  public void prepare(){
    this.pepperoni=this.factory.createPepperoni();
    this.dough = this.factory.createDough();
    this.veggies = this.factory.createVeggies();
  }
}
/////////////////////////////////////////////////////////////////////

abstract class PizzaStore{
  public Pizza orderPizza(String type){
    Pizza pizza = createPizza(type);
    System.out.println("--- Making a " + pizza.getName() + " ---");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
  protected abstract Pizza createPizza(String type);
}
class NYPizzaStore extends PizzaStore{
  protected Pizza createPizza(String type){
    NYPizzaIngredientFactory f = new NYPizzaIngredientFactory();
    Pizza pizza=null;
    if(type.equals("cheese")){
      pizza = new CheesePizza(f);
    }else{
      pizza = new PepperoniPizza(f);
    }
    pizza.prepare();
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
class ChicagoPizzaStore extends PizzaStore{
  protected Pizza createPizza(String type){
    ChicagoPizzaIngredientFactory f = new ChicagoPizzaIngredientFactory();
    Pizza pizza=null;
    if(type.equals("cheese")){
      pizza = new CheesePizza(f);
    }else{
      pizza = new PepperoniPizza(f);
    }
    pizza.prepare();
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}