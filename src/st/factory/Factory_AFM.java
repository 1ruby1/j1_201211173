package st.factory;

public class Factory_AFM{
  public static void main(String[] args){
    PizzaStore nyS = new NYPizzaStore();
    PizzaStore chS = new ChicagoPizzaStore();
    
    Pizza p1=nyS.orderPizza("cheese");
    System.out.println(p1.getName());
    System.out.println();
    Pizza p2=chS.orderPizza("cheese");
    System.out.println(p2.getName());
    System.out.println();
  }
}

abstract class PizzaStore{
  public Pizza orderPizza(String type){
    return this.createPizza(type);
  }
  public abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    Pizza pizza=null;
    if(type.equals("cheese")){
      pizza = new NYStyleCheesePizza("New York Style Cheese Pizza!!!");
    }else pizza = new NYStyleVeggeePizza("New York Style Veggee Pizza!!!");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
class ChicagoPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    Pizza pizza=null;
    if(type.equals("cheese")){
      pizza = new ChicagoStyleCheesePizza("Chicago Style Cheese Pizza ***");
    }else pizza = new ChicagoStyleVeggeePizza("Chicago Style Veggee Pizza ***");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}

abstract class Pizza{
  String name;
  Pizza(){this.name="Pizza_Name";}
  Pizza(String name){this.name = name;}
  
  void prepare(){
    System.out.println("preparing");
  }
  
  void bake(){
    System.out.println("bake");
  }
  
  void cut(){
    System.out.println("cut");
  }
  
  void box(){
    System.out.println("box");
  }
  
  void setName(String name){
    this.name = name;
  }
  
  String getName(){
    return this.name;
  }
}

class NYStyleCheesePizza extends Pizza{
  NYStyleCheesePizza(){super();}
  NYStyleCheesePizza(String name){super(name);} 
}

class NYStyleVeggeePizza extends Pizza{
  NYStyleVeggeePizza(){super();}
  NYStyleVeggeePizza(String name){super(name);} 
}

class ChicagoStyleCheesePizza extends Pizza{
  ChicagoStyleCheesePizza(){super();}
  ChicagoStyleCheesePizza(String name){super(name);} 
}

class ChicagoStyleVeggeePizza extends Pizza{
  ChicagoStyleVeggeePizza(){super();}
  ChicagoStyleVeggeePizza(String name){super(name);} 
}