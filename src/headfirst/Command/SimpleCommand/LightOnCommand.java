package headfirst.Command.SimpleCommand;

public class LightOnCommand implements Command{
  private Light light;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    this.light.on();
  }
}