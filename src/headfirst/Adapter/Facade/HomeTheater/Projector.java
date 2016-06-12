package headfirst.Adapter.Facade.HomeTheater;


public class Projector{
  String des;
  DvdPlayer dvd;
  
  public Projector(String des,DvdPlayer dvd){
    this.des = des;
    this.dvd = dvd;
  }
  
  public void on(){
    System.out.println(this.des+" ON");
  }
  public void off(){
    System.out.println(this.des+" OFF");
  }
  public void wideScreenMode(){
    System.out.println(des + " in widescreen mode (16x9 aspect ratio)");
  }
  public String toString() {
        return des;
    }
}
  