/*
 * @author ruby
 * @since 2016_04_05
 * Example for observer
 * 
 */

package headfirst.observer.ver01;
import java.util.ArrayList;

public class WeatherDataObserverMain{
  public static void main(String [] srgs){
    WeatherData weatherData = new WeatherData();
    StaticsTemperatureDisplay stDisplay = new StaticsTemperatureDisplay(weatherData);
    CurrentConditionsDisplay ccDisplay = new CurrentConditionsDisplay(weatherData);
    
    weatherData.setMeasurements(80,65,30.4f);
    System.out.println();
    weatherData.setMeasurements(80,67,25.4f);
    System.out.println();
    weatherData.setMeasurements(83,65,30.4f);
  }
}