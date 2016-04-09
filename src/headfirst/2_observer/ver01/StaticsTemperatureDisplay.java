/*
 * @author ruby
 * @since 2016_04_05
 * Example for observer
 * 
 */

package headfirst.observer.ver01;

public class StaticsTemperatureDisplay implements Observer, DisplayElement{
  private float hTemp;
  private float lTemp;
  private Subject weatherData;
  
// construtor
  public StaticsTemperatureDisplay(Subject weatherData){
    this.weatherData = weatherData;
    this.hTemp = 0;
    this.lTemp = 0;
    this.weatherData.registerObserver(this);
  }
    
  public void update(float temp, float humidity, float pressure){
    if(this.hTemp<temp){
      if(this.lTemp==0)this.lTemp=this.hTemp;
      this.hTemp = temp;
      this.display();
    }else if(this.lTemp>temp){
      if(this.hTemp==0)this.hTemp=this.lTemp;
      this.lTemp = temp;
      this.display();
    }
  }
  public void display(){
    System.out.println("Current Statics Temperature => "+this.hTemp+"F highest degrees(H) and "+this.lTemp+"F lowwest degrees(L).");
  }
}