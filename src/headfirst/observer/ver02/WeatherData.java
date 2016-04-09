/*
 * @author ruby
 * @since 2016_04_09
 * ver2. observer (use java api)
 * 
 */

package headfirst.observer.ver02;
import java.util.Observable;

public class WeatherData extends Observable{
  private float temp;
  private float humidity;
  private float pressure;
  
  public WeatherData(){}
  
  public void measurementsChanged(){
    setChanged();
    this.notifyObservers();
  }
  public void setMeasurements(float temp, float humidity, float pressure){
    this.temp = temp;   
    this.humidity = humidity;
    this.pressure = pressure;
    this.measurementsChanged();
  }
  
  public float getTemp(){return this.temp;}
  public float getHumidity(){return this.humidity;}
  public float getPressure(){return this.pressure;}
}