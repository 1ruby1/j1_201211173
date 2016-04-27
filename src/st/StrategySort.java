package st;

import java.util.Date;
import ch.aplu.turtle.*;
public class StrategySort{
  public static void main(String[] args){
     String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
        Comparator stringComp=new StringComparator();
        Sorter.sort(B, stringComp);

        Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
        Comparator integerComp=new IntegerComparator();
        Sorter.sort(C, integerComp);
        for(int i=0; i<B.length; i++)
            System.out.println("B["+i+"]="+B[i]);
        System.out.println();
        for(int i=0; i<C.length; i++)
            System.out.println("C["+i+"]="+C[i]);

        System.out.println();
         WeightTurtle wt30 = new WeightTurtle(30);
        WeightTurtle wt10 = new WeightTurtle(10);
        WeightTurtle wt20 = new WeightTurtle(20);
        WeightTurtle[] wts={wt30, wt10, wt20};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wts, turtleComp);

        for(int i=0; i<wts.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+wts[i].getWeight());
  }
}

class Sorter{
  public static void sort(Object[] list, Comparator comp){
    int max = 0;
    Object tmp;
    for(int i=0;i<list.length;i++){
      for(int j=i;j<list.length;j++){
        if(comp.compare(list[i],list[j]) > 0){ 
          tmp = list[j];
          list[j]=list[i];
          list[i]=tmp;
        }
      }
    }
  }
}

class WeightTurtle extends Turtle{
  double weight;
  WeightTurtle(double weight){
    this.weight=weight;
  }
  public double getWeight(){return this.weight;}
}

interface Comparator{
  public double compare(Object o1,Object o2);
}

class IntegerComparator implements Comparator{
  public double compare(Object o1,Object o2){
    return (Integer)o1-(Integer)o2;
  }
}
class StringComparator implements Comparator{
  public double compare(Object o1,Object o2){
    return ((String)o1).compareTo((String)o2);
  }
}
class DateComparator implements Comparator{
  public double compare(Object o1,Object o2){
    return ((Date)o1).compareTo((Date)o2);
  }
}

class TurtleComparator implements Comparator {
  public double compare(Object o1,Object o2){
    return ((WeightTurtle)o1).getWeight()-((WeightTurtle)o2).getWeight();
  }
}
