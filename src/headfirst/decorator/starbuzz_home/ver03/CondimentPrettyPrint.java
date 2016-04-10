/*
 * @author ruby
 * @since 2016_04_10
 * ver03 Beverage decorator
 * has a relation ship
 * with abstract class or interface.
 * Porpose is to flexible, 
 * class type is dynamically determined 
 * (detemined is runtime) and
 * new method can be added easily.
 */

package headfirst.decorator.starbuzz_home.ver03;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public abstract class CondimentPrettyPrint extends Beverage{
  
  public CondimentPrettyPrint(){
    this("no description");
  }
  public CondimentPrettyPrint(String description){
    super.setDescription(description);
  }
  
  public void setDescription(String description){
    super.setDescription(description);
  }
  public abstract String getDescription();
  
  public String getPrettyDescription(){
    String list = this.getDescription();
    String returnStr = new String();
    StringTokenizer token = new StringTokenizer(list,",");
    Map<String,Integer> map = new HashMap<String,Integer>();
    String tmp=null;
    int cnt=0;
    
    if(list==null)return null;
    while(token.hasMoreTokens()){
      tmp = token.nextToken();
       if(map.containsKey(tmp)){
         map.put(tmp, map.get(tmp) + 1);
      }else{
        map.put(tmp,new Integer(1));
      }
    }
    
    for(String key : map.keySet()){
      returnStr+=key+"("+map.get(key)+") / ";
    }
    return returnStr;
  }
  
  public abstract double cost();
}