package com.j1.w9.command2;

public class Light{
  public static final HIGHESTLEVEL=5;
  private int level;
  private String location;
  public Light(){
    this.level=HIGHESTLEVEL;
    this.location = new String();
  }
  public Light(String location){
    this.location = location;
  }
  public void on(){
    if(this.level==0)this.level=5;
    System.out.println("Light On");
  }
  public void off(){
    if(this.level!=0)this.level=0;
    System.out.println("Light Off");
  }
  public void dim(int level){
    this.level=level;
    if(level==0)this.off();
    else System.out.println("Light is dimmed to "+this.level);
  }
  public int getLevel(){
    return this.level;
  }
}