package com.j1.w9.command1;
import java.util.List;
import java.util.ArrayList;

public class SimpleRemoteControl{
  //private List<Command> slotList;
  private Command slot;
  public SimpleRemoteControl(){
    //this.slotList = new ArrayList<Command>();
  }
  public void setCommand(Command command){
    //this.slotList.add(command);
    this.slot = command;
  }
  public void buttonPressed(){
    /*for(Command command : this.slotList){
      command.execute();
    }*/
    this.slot.execute();
  }
  
}