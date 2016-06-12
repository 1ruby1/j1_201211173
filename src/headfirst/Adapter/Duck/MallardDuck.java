package headfirst.Adapter.Duck;

public class MallardDuck implements Duck{
  public void quack(){
    System.out.println("MallardDuck quack");
  }
  public void fly(){
    System.out.println("MallardDuck Fly...");
  }
}