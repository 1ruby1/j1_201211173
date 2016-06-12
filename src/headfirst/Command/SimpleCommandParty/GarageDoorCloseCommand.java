package headfirst.Command.SimpleCommandParty;

public class GarageDoorCloseCommand implements Command{
  private GarageDoor gd;
  public GarageDoorCloseCommand(GarageDoor gd){
    this.gd = gd;
  }
  public void execute(){
    this.gd.close();
  }
  public void undo(){
    this.gd.open();
  }
}