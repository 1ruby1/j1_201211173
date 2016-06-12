package headfirst.Adapter.Duck;

public class DuckAdapter implements Turkey{
  private Duck duck;
  public DuckAdapter(Duck duck){
    this.duck = duck;
  }
  public void gobble(){
    this.duck.quack();
  }
  public void fly(){
    this.duck.fly();
  }
}