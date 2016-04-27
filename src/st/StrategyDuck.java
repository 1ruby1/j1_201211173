package st;

public class StrategyDuck{
  public static void main(String[] args){
    
    Duck d1 = new RedheadDuck(new Squeack(), new FlyWithWings());
    Duck d2 = new RubberDuck(new Quack(), new FlyNoWay());
    Duck d3 = new DecoyDuck(new MuteQuack(), new FlyNoWay());
    
    d1.performSound();
    d1.performFly();
    d2.performSound();
    d2.performFly();
    d3.performSound();
    d3.performFly();
  }
}

interface SoundBehavior{
  public void sound();
}
interface FlyBehavior{
  public void fly();
}

class Squeack implements SoundBehavior{
  public void sound(){
    System.out.println("Squeack !");
  }
}
class MuteQuack implements SoundBehavior{
  public void sound(){
    System.out.println("MuteQuack.....");
  }
}
class Quack implements SoundBehavior{
  public void sound(){
    System.out.println("Quack ^^");
  }
}
class FlyNoWay implements FlyBehavior{
  public void fly(){
    System.out.println("I Cant Fly T_T");
  }
}
class FlyWithWings implements FlyBehavior{
  public void fly(){
    System.out.println("Fly With Wings..!!!!");
  }
}

////////////////////////////////////////

class Duck{
  SoundBehavior sb;
  FlyBehavior fb;
  public Duck(SoundBehavior sb,FlyBehavior fb){
    this.sb = sb;
    this.fb = fb;
  }
  public void swim(){}
  public void display(){}
  public void performFly(){this.fb.fly();}
  public void performSound(){this.sb.sound();}
}

class RedheadDuck extends Duck{
  public RedheadDuck(SoundBehavior sb,FlyBehavior fb){
    super(sb,fb);
  }
}
class RubberDuck extends Duck{
  public RubberDuck(SoundBehavior sb,FlyBehavior fb){
    super(sb,fb);
  }
}
class DecoyDuck extends Duck{
  public DecoyDuck(SoundBehavior sb,FlyBehavior fb){
    super(sb,fb);
  }
}