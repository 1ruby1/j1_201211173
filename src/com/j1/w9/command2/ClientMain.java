package com.j1.w9.command2;

public class ClientMain{
  public static void main (String[] args){
     SimpleRemoteControl remote  = new SimpleRemoteControl();
    Light light1 = new Light();
    Light light2 = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light1);
    LightOffCommand lightOffCommand = new LightOffCommand(light2);
    remote.setOnCommand(lightOnCommand);
    remote.setOffCommand(lightOffCommand);
    remote.onButtonWasPushed(0);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();
  }
}