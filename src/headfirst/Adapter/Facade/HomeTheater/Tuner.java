package headfirst.Adapter.Facade.HomeTheater;


public class Tuner{
  String des;
    Amplifier amplifier;
    double frequency;
 
    public Tuner(String description, Amplifier amplifier) {
        this.des = description;
    }
    public void on() {
        System.out.println(des + " on");
    }
    public void off() {
        System.out.println(des + " off");
    }
  public void setFrequency(double frequency) {
        System.out.println(des + " setting frequency to " + frequency);
        this.frequency = frequency;
    }
    public String toString() {
        return des;
    }
}
  