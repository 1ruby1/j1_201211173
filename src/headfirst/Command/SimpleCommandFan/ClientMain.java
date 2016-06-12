package headfirst.Command.SimpleCommandFan;

public class ClientMain{
  public static void main(String[] args){
    Light l = new Light();
    GarageDoor gd = new GarageDoor();
    CeilingFan fan = new CeilingFan("location....");
    
    GarageDoorOpenCommand gdOC = new GarageDoorOpenCommand(gd);
    LightOnCommand lOC = new LightOnCommand(l);
    CeilingFanHighCommand fanCH = new CeilingFanHighCommand(fan);
    CeilingFanMediumCommand fanCM = new CeilingFanMediumCommand(fan);
    CeilingFanLowCommand fanCL = new CeilingFanLowCommand(fan);
    CeilingFanOffCommand fanCO = new CeilingFanOffCommand(fan);
    
    SimpleRemoteControl c = new SimpleRemoteControl();
    c.setCommand(0,lOC);
    c.setCommand(1,gdOC);
    c.setCommand(2,fanCH);
    c.setCommand(3,fanCM);
    c.setCommand(4,fanCL);
    c.setCommand(5,fanCO);
    
    c.buttonWasPressed(0);
    c.buttonWasPressed(1);
    c.undoButtonWasPressed();
    
    c.buttOffWasPressed(0);
    c.undoButtonWasPressed();
    c.buttOffWasPressed(1);
    
    System.out.println();
    System.out.println();
    
    c.buttonWasPressed(2);
    c.undoButtonWasPressed();
    c.buttonWasPressed(4);
    System.out.println();
    
    c.buttOffWasPressed(3);
    c.undoButtonWasPressed();
    c.buttOffWasPressed(5);
    
  }
}