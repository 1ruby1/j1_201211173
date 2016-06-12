package headfirst.Adapter.EI;

import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;

public class ClientMain{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    list.add("aaaaa");
    list.add("bbbbb");
    list.add("ccccc");
    list.add("ddddd");
    list.add("EEEEE");
    list.add("FFFFF");
    
    EnumerationIterator ei = new EnumerationIterator(Collections.enumeration(list));
    while(true){
      if(ei.hasNext())System.out.println(((String)(ei.next())));
      else break;
    }
  }
}