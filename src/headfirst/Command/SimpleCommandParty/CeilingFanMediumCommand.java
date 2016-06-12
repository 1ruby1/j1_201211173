package headfirst.Command.SimpleCommandParty;

public class CeilingFanMediumCommand implements Command{
  private CeilingFan fan;
  int preSpeed;
  
  public CeilingFanMediumCommand( CeilingFan fan){
    this.fan = fan;
  }
  public void execute(){
    preSpeed = this.fan.getSpeed();
    this.fan.medium();
    System.out.println(fan.location+" SPEED : "+fan.getSpeed());
  }
 public void undo(){
    if(this.preSpeed==CeilingFan.HIGH){
      this.fan.high();
    }else if(this.preSpeed==CeilingFan.MEDIUM){
      this.fan.medium();
    }else if(this.preSpeed==CeilingFan.LOW){
      this.fan.low();
    }else if(this.preSpeed==CeilingFan.OFF){
      this.fan.off();
    }
    System.out.println(fan.location+" SPEED_UNDO : "+fan.getSpeed());
  }
}