/*
 * @author ruby
 * @since 2016_04_09
 * ver2. observer (use java api)
 * 
 */

package headfirst.observer.ver02;

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