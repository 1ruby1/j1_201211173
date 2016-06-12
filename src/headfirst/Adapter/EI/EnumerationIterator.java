package headfirst.Adapter.EI;

import java.util.Iterator;
import java.util.Enumeration;
import java.lang.UnsupportedOperationException;

public class EnumerationIterator implements Iterator{
  private Enumeration enums;
  
  public EnumerationIterator(Enumeration enums){
    this.enums = enums;
  }
  
  public boolean hasNext(){
    return this.enums.hasMoreElements();
  }
  public Object next(){
    return this.enums.nextElement();
  }
  public void remove(){
    throw new UnsupportedOperationException();
  }
}