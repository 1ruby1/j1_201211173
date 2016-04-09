/*
 * @author ruby
 * @since 2016_04_09
 * ver2. observer (use java api)
 * 
 */

package headfirst.observer.ver02;
import java.util.Observable;
import java.util.Observer;

public class StaticsTemperatureDisplay implements Observer,DisplayElement{
  Observable observable;
  private float hTemp;
  private float lTemp;
  
  public StaticsTemperatureDisplay(Observable observable){
    this.observable = observable;
    this.observable.addObserver(this);
  }
  public void update(Observable observable, Object arg){
    WeatherData weatherData =  (WeatherData)observable;
    float temp = weatherData.getTemp();
    
    if(this.hTemp<temp){
      if(this.lTemp==0)this.lTemp=this.hTemp;
      this.hTemp = temp;
      this.display();
    }else if(this.lTemp>temp){
      if(this.hTemp==0)this.hTemp=this.lTemp;
      this.lTemp = temp;
      this.display();
    }
   
    display();
  }
  public void display(){
   System.out.println("Current Statics Temperature => "+this.hTemp+"F highest degrees(H) and "+this.lTemp+"F lowwest degrees(L).");
  }
}