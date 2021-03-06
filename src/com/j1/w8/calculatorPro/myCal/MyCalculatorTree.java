package  com.j1.w8.calculatorPro.myCal;

import java.lang.Character.Subset;
import java.util.ArrayList;

public class MyCalculatorTree extends MyCalculator{

 private ArrayList<int[][]> bracketList; 
 
 public MyCalculatorTree(ArrayList<int[][]> bracketList,String fullStr){
  super(fullStr);
  this.bracketList = bracketList;
 }
 private MyCalculatorTree(String str) {
  super(str);
  // TODO Auto-generated constructor stub
 }
 
 public void calculateBracket(){
  System.out.println(super.getStr());
  int i;
  String tmpS,subStr,subStr0,subStr2;
  int [][] bracketSet= new int[1][2]; 
  int tmpSLeng,subStrLeng;
  double tmpRes;
  
  if(!this.bracketList.isEmpty()){
   while(this.bracketList.size()>0){
    i=this.bracketList.size()-1;
    bracketSet = this.bracketList.get(i);
    System.out.println("bracket Set : ("+bracketSet[0][0]+" , "+bracketSet[0][1]+")");
    subStr0 = super.getStr().substring(0, bracketSet[0][0]);
    subStr = super.getStr().substring(bracketSet[0][0]+1, bracketSet[0][1]);
    subStr2 = super.getStr().substring(bracketSet[0][1]+1, super.getStr().length());
    subStrLeng = subStr.length()+2;
    System.out.println(subStr+" ("+subStrLeng+") to MyCalculator ("+i+")");
    MyCalculator tmpCal = new MyCalculator(subStr);
    tmpCal.calculate();
    
    //s = super.getStr().substring(i-1, i);
    tmpS=Double.toString(tmpCal.getResult());
    tmpSLeng = tmpS.length();
    for(int k=0;k<this.bracketList.size();k++){
     if(this.bracketList.get(k)[0][1]>bracketSet[0][1]){
      this.bracketList.get(k)[0][1]+=tmpSLeng-subStrLeng;
     }
    }
    System.out.println("clactree48 setStr : "+subStr0+tmpS+subStr2);
    super.setStr(subStr0+tmpS+subStr2);
    this.bracketList.remove(i);
    i++;
   }
  }
  super.calculate();
  
  System.out.println(super.getStr()+" = "+super.getResult());
 }
}
