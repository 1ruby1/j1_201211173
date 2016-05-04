package com.j1.w9.command2;

public class SimpleRemoteControl{
  private Command[] onCommands;
  private Command[] offCommands;
  private Command undoCommand;
  public SimpleRemoteControl(int cnt){
    this.onCommands = new Command[cnt];
    this.offCommands = new Command[cnt];
    Command noCo = new NoCommand();
    for(int i=0;i<cnt;i++){
      this.onCommands[i]=noCo;
      this.offCommands[i]=noCo;
    }
  }
  public SimpleRemoteControl(){
    this(7);
  }
  public boolean setOnCommand(int slot,Command command){
    if(slot>this.onCommands.length)return false;
    else this.onCommands[slot]=command;
    return true;
  }
  public boolean setOnCommand(Command command){
    int i=0;
    for(;i<this.onCommands.length;i++){
      if(this.onCommands[i] instanceof NoCommand)break;
    }
    return this.setOnCommand(i,command);
  }
  public boolean setOffCommand(int slot,Command command){
    if(slot>this.offCommands.length)return false;
    else this.offCommands[slot]=command;
    return true;
  }
  public boolean setOffCommand(Command command){
    int i=0;
    for(;i<this.offCommands.length;i++){
      if(this.offCommands[i] instanceof NoCommand)break;
    }
    return this.setOffCommand(i,command);
  }
  
  public void onButtonWasPushed(int slot){
    this.onCommands[slot].execute();
    this.undoCommand = this.onCommands[slot];
  }
  public void offButtonWasPushed(int slot){
    this.offCommands[slot].execute();
    this.undoCommand = this.offCommands[slot];
  }
  public void undoButtonWasPushed(){
    this.undoCommand.undo();
  }
}