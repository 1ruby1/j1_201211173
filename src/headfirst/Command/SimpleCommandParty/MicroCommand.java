package headfirst.Command.SimpleCommandParty;

import java.util.List;
import java.util.ArrayList;
public class MicroCommand{
  
  private List<Command> commandList;
  
  public MicroCommand(){
    this.commandList = new ArrayList<Command>();
  }
  public void setCommand(int i,Command command){
    this.commandList.add(i,command);
  }
  public void buttonWasPressed(){
    for(Command c : this.commandList){
      c.execute();
    }
  }
  
}