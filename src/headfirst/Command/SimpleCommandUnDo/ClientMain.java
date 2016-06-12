package headfirst.Command.SimpleCommandUnDo;

public class ClientMain{
  public static void main(String[] args){
    Light l = new Light();
    GarageDoor gd = new GarageDoor();
    
    GarageDoorOpenCommand gdOC = new GarageDoorOpenCommand(gd);
    LightOnCommand lOC = new LightOnCommand(l);
    
    SimpleRemoteControl c = new SimpleRemoteControl();
    c.setCommand(0,lOC);
    c.setCommand(1,gdOC);
    
    c.buttonWasPressed(0);
    c.buttonWasPressed(1);
    c.undoButtonWasPressed();
    
    c.buttOffWasPressed(0);
    c.undoButtonWasPressed();
    c.buttOffWasPressed(1);
  }
}