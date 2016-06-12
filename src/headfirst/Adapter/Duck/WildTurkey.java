package headfirst.Adapter.Duck;

public class WildTurkey implements Turkey{
  public void gobble(){
    System.out.println("WildTurkey Gobble");
  }
  public void fly(){
    System.out.println("WildTurkey Fly...");
  }
}