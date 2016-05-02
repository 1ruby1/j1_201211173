package com.j1.w9.command1;

public class GarageDoorUpCommand implements Command{
  private GarageDoor garageDoor;
  public GarageDoorUpCommand(GarageDoor garageDoor){
    this.garageDoor = garageDoor;
  }
  public void execute(){
    this.garageDoor.up();
  }
}