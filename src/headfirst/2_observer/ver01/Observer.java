/*
 * @author ruby
 * @since 2016_04_05
 * Example for observer
 * 
 */

package headfirst.observer.ver01;

public interface Observer{
  public void update(float temp, float humidity, float pressure);
}