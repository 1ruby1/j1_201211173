package com.j1.w12;

public class MenuItem{
  private String name;
  private String des;
  private boolean vege;
  private double price;
  public MenuItem(String name, String des, boolean v, double p){
    this.name = name;
    this.des = des;
    this.vege = v;
    this.price = p;
  }
  
  public String getName(){return this.name;}
  public void setName(String name){this.name = name;}
  
  public String getDes(){return this.des;}
  public void setDes(String des){this.des = des;}
  
  public booelan getVege(){return this.vege;}
  public void setVege(boolean vege){this.vege = vege;}
  
  public boolean getPrice(){return this.price;}
  public void setPrice(double price){this.price = price;}
}