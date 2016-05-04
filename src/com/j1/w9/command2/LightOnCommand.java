package com.j1.w9.command2;

public class LightOnCommand implements Command{
  private Light light;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    this.light.on();
  }
  public void execute(int level){
    this.light.on();
    this.light.dim(level);
  }
  public void undo(){
    if(this.light.getLevel()==0)this.light.dim(this.light.getLevel());
    else this.light.dim(this.light.getLevel()-1);
  }
  
}