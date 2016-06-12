package headfirst.Command.SimpleCommand;

import java.util.List;
import java.util.ArrayList;
public class SimpleRemoteControl{
  private List<Command> slotList;
  
  public SimpleRemoteControl(){
    this.slotList = new ArrayList<Command>();
  }
  public void setCommand(int i,Command command){
    this.slotList.add(i,command);
  }
  public void buttonWasPressed(int i){
    this.slotList.get(i).execute();
  }
}