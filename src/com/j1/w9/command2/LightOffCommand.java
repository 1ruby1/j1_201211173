package com.j1.w9.command2;

public class LightOffCommand implements Command{
  private Light light;
  public LightOffCommand(Light light){
    this.light = light;
  }
  public void execute(){
    this.light.off();
  }
  public void undo(){
    if(this.light.getLevel()==Light.HIGHESTLEVEL)this.light.dim(this.light.getLevel());
    this.light.dim(this.light.getLevel()+1);
  }
  
}