/*
 * @author ruby
 * @since 2016_04_04
 * Example for observer
 * 
 */

package headfirst.observer.ver01;
import java.util.ArrayList;

public class WeatherData implements Subject{
  //ConcreateSubject
  private ArrayList<Observer> observerList;
  private float temp;
  private float humidity;
  private float pressure;
 
////// constructor 
  public WeatherData(){
    this.observerList = new ArrayList<Observer>();
    this.temp=0;
    this.humidity=0;
    this.pressure=0;
  }
  public WeatherData(Observer observer){
    this();
    this.observerList.add(observer);
  }
  
//////  overriding methods
  public void registerObserver(Observer observer){
    this.observerList.add(observer);
  }
  public void removeObserver(Observer observer){
    this.observerList.remove(observer);
  }
  public void notifyObservers(){
    for(Observer observer:this.observerList){
      observer.update(this.temp,this.humidity,this.pressure);
    }
  }
  
////////  
  public float getTemp(){
    return this.temp;
  }
  public float getHumidity(){
    return this.humidity;
  }
  public float getPressure(){
    return this.pressure;
  }
  public void setMeasurements(float temp, float humidity, float pressure){
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    this.measurementsChanged();
  }
  public void measurementsChanged(){
    notifyObservers();
  }
}