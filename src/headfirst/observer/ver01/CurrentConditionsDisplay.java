/*
 * @author ruby
 * @since 2016_04_05
 * Example for observer
 * 
 */

package headfirst.observer.ver01;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
  private float temp;
  private float humidity;
  private Subject weatherData;
  
// construtor
  public CurrentConditionsDisplay(Subject weatherData){
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }
    
  public void update(float temp, float humidity, float pressure){
    this.temp = temp;
    this.humidity = humidity;
    this.display();
  }
  public void display(){
    System.out.println("Current Conditions => "+this.temp+"F degrees and "+this.humidity+"% humidity.");
  }
}