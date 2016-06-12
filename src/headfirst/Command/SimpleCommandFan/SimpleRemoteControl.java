package headfirst.Command.SimpleCommandFan;

import java.util.List;
import java.util.ArrayList;
public class SimpleRemoteControl{
  
  private List<Command> onCommandList;
  private List<Command> offCommandList;
  private Command undoCommand;
  
  public SimpleRemoteControl(){
    this.onCommandList = new ArrayList<Command>();
    this.offCommandList = new ArrayList<Command>();
    this.undoCommand = null;
  }
  public void setCommand(int i,Command command){
    this.onCommandList.add(i,command);
    this.offCommandList.add(i,command);
  }
  public void buttonWasPressed(int i){
    this.onCommandList.get(i).execute();
    this.undoCommand = this.onCommandList.get(i);
  }
  public void buttOffWasPressed(int i){
    this.offCommandList.get(i).execute();
    this.undoCommand = this.offCommandList.get(i);
  }
  public void undoButtonWasPressed(){
    this.undoCommand.undo();
  }
}