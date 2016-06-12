package headfirst.Adapter.IE;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ArrayList;

public class ClientMain{
  public static void main(String[] arsg){
    ArrayList<String> list = new ArrayList<String>();
    list.add("aaaaa");
    list.add("bbbbb");
    list.add("ccccc");
    list.add("ddddd");
    list.add("EEEEE");
    list.add("FFFFF");
    
    IteratorEnumeration ie = new IteratorEnumeration(list.listIterator());
    while(true){
      if(ie.hasMoreElements())System.out.println(((String)(ie.nextElement())));
      else break;
    }
    
  }
}