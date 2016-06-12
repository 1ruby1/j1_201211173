package headfirst.Command.SimpleCommand2;

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
  public void buttOffWasPressed(int i){
    this.slotList.get(i).undo();
  }
}