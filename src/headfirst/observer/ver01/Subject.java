/*
 * @author ruby
 * @since 2016_04_04
 * Example for observer
 * 
 */

package headfirst.observer.ver01;

public interface Subject{
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers();
}