/*
 * @author ruby
 * @since 2016_04_09
 * ver2. observer (use java api)
 * 
 */

package headfirst.observer.ver02;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
  Observable observable;
  private float temp;
  private float humidity;
  
  public CurrentConditionsDisplay(Observable observable){
    this.observable = observable;
    this.observable.addObserver(this);
  }
  public void update(Observable observable, Object arg){
    WeatherData weatherData =  (WeatherData)observable;
    this.temp = weatherData.getTemp();
    this.humidity = weatherData.getHumidity();
    display();
  }
  public void display(){
    System.out.println("Current Conditions => "+this.temp+" F degrees and "+this.humidity+" humidity.");
  }
}