package headfirst.Command.SimpleCommandUnDo;

public class GarageDoorOpenCommand implements Command{
  private GarageDoor gd;
  public GarageDoorOpenCommand(GarageDoor gd){
    this.gd = gd;
  }
  public void execute(){
    this.gd.open();
  }
  public void undo(){
    this.gd.close();
  }
}