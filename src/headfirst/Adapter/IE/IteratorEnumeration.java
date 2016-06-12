package headfirst.Adapter.IE;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration{
  private Iterator iter;
  
  public IteratorEnumeration(Iterator iter){
    this.iter = iter;
  }
  
  public boolean hasMoreElements(){
    return this.iter.hasNext();
  }
  public Object nextElement(){
    return this.iter.next();
  }
}