package com.j1.w6.simpleFactory;

public class VeggiPizza extends Pizza{
  private String topping2;
  
  public VeggiPizza(){
    super("VeggiPizza","originTopping",5);
    this.topping2 = "Veggi..##";
  }
  public VeggiPizza(String name, String topping,String topping2, int bakeTime){
    super(name,topping,bakeTime);
    this.topping2 = topping2;
  }
  
  public void prepare(){
    super.prepare();
  }
  public String topping(){
    return super.topping()+", "+this.topping2;
  }
  public void bake(){
    super.bake();
  }
  public void cut(){
    super.cut();
  }
  public void box(){
    super.box();
  }
  
  public String getTopping2(){return this.topping2;}
  public void setTopping2(String topping2){ this.topping2=topping2;}
}