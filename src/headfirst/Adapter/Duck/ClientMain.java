package headfirst.Adapter.Duck;

public class ClientMain{
  public static void main(String[] arsg){
    Turkey t = new DuckAdapter(new MallardDuck());
    Duck d = new TurkeyAdapter(new WildTurkey());
    
    t.gobble();
    t.fly();
    d.quack();
    d.fly();
  }
}