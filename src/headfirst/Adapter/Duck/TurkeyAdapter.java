package headfirst.Adapter.Duck;

public class TurkeyAdapter implements Duck{
  private Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey =turkey;
  }
  public void quack(){
    this.turkey.gobble();
  }
  public void fly(){
    this.turkey.fly();
  }
}