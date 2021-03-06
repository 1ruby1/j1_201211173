package  com.j1.w8.calculatorPro.myCal;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class MyCalculator{

 private String str;
 private double result;
 
 public MyCalculator(String str){
  this.str = str;
  this.result = 0;
 }

 public void calculate(){
 
  StringTokenizer tokens = new StringTokenizer(str, "+-", true);
  String s;
  double res=0,tmp=0;
  String preOp="+";
  ArrayList<String> tokenList = this.makeList(tokens);
  int tokenListSize = tokenList.size();
  
  for(int i=0;i<tokenListSize;i++ ){
   s = tokenList.get(i);
   System.out.println("start : "+s);
   if(s.equals("+")){
    preOp = s;
   }else if(s.equals("-")){
    preOp = s;
   }else {
    switch (s.substring(s.length()-1, s.length())) {
     case "^":
     case "d":
     case "p":
     case "n":
     case "s":
     case "g":
      i++;
      s+=tokenList.get(i);
      i++;
      s = this.checkTokenForSend(tokenList, s, i);
      break;
    }
    
    tmp=this.calculateToken(s);
    if(preOp.equals("+")){
     res+=tmp;
    }else if(preOp.equals("-")){
     res-=tmp;
    }
    System.out.println("cal : "+res+"\n");
   }
  }
  this.result = res;    
 }
 public String checkTokenForSend(ArrayList<String> list, String resS,int i){
  String s;
  for(;i<list.size();i++){
   s = list.get(i);
   switch (s.substring(s.length()-1, s.length())) {
   case "^":
   case "d":
   case "p":
   case "n":
   case "s":
   case "g":
    resS+=s;
    break;
   case "1":
   case "2":
   case "3":
   case "4":
   case "5":
   case "6":
   case "7":
   case "8":
   case "9":
   case "0":
    resS+=s;
    return resS;
   }
  }
  return resS;
 }
 public double calculateToken(String token){
  System.out.println("calculateSubToken (*/)  s : "+token);
  StringTokenizer tokens = new StringTokenizer(token, "*/", true);
  String s;
  double res=1,tmp=0;
  String preOp="*";
  
  while(tokens.hasMoreElements()){
   s = tokens.nextToken();
   System.out.println("start_s : "+s);
   if(s.equals("*")){
    preOp = s;
   }else if(s.equals("/")){
    preOp = s;
   }else {
    tmp=this.calculateSubToken(s);
    if(preOp.equals("*")){
     res*=tmp;
    }else if(preOp.equals("/")){
     res/=tmp;
    }
   }
   System.out.println("res_s : "+res+"\n");
  }
  return res;
 }
 
 public double calculateSubToken(String subToken){
  System.out.println("calculateSubToken (meicag^!)  s : "+subToken);
  StringTokenizer token_3 = new StringTokenizer(subToken, "meicag^!", true);  
  ArrayList<String> token_3_list = new ArrayList<String>();
  while(token_3.hasMoreElements()){
   token_3_list.add(token_3.nextToken());
  }
  System.out.println("calculateSubToken (meicag^!)  cnt : "+token_3_list.size());
  
  if(token_3_list.size()>1){
   for(int i=0;i<token_3_list.size();i++){
    switch (token_3_list.get(i)) {
    case "^":return this.calculatePOW(subToken);
    case "m":return this.calculateMod(subToken);
    case "e":return this.calculateEXP(subToken);
    case "i":return this.calculateSIN(subToken); //sin
    case "c":return this.calculateCOS(subToken); //cos
    case "t":return this.calculateTAN(subToken); //tan
    case "g":return this.calculateLOG(subToken); //log
    case "n":{
     if(token_3_list.get(i-1).substring(token_3_list.get(i-1).length()-1, token_3_list.get(i-1).length()).equals("l"));
     return this.calculateLN(subToken); //ln
     }
    case "!":return this.calculateMULS(subToken); //!
    }
   }
  }
    
  return Double.parseDouble(token_3_list.get(0)); 
 }
 public double calculateMod(String mod_str){
  System.out.print("this is calculate mode.....func "+mod_str+" ");
  StringTokenizer modToken = new StringTokenizer(mod_str, "mod", false);
  double a=1,b=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
   b = Double.parseDouble(modToken.nextToken());
  }
  System.out.println("a : "+a+"/  b : "+b);
  return a%b; 
 }
 public double calculateSIN(String sin_str){
   
  System.out.print("this is calculate sin.....func "+sin_str+" ");
  StringTokenizer modToken = new StringTokenizer(sin_str, "sin", false);
  double a=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
  }
  double b = Math.toRadians(a);
  System.out.println("a : "+a+"/  b : "+b);
  return Math.sin(b); 
 }
 public double calculateCOS(String cos_str){
  
  System.out.print("this is calculate cos.....func "+cos_str+" ");
  StringTokenizer modToken = new StringTokenizer(cos_str, "cos", false);
  double a=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
  }
  
  double b = Math.toRadians(a);
  System.out.println("a : "+a+"/  b : "+b);
  return Math.cos(b); 
 }
 public double calculateTAN(String tan_str){
  System.out.print("this is calculate tan.....func "+tan_str+" ");
  StringTokenizer modToken = new StringTokenizer(tan_str, "tan", false);
  double a=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
  }
  
  double b = Math.toRadians(a);
  System.out.println("a : "+a+"/  b : "+b);
  return Math.tan(b); 
 }
 public double calculateEXP(String exp_str){
  System.out.print("this is calculate exp.....func "+exp_str+" ");
  StringTokenizer modToken = new StringTokenizer(exp_str, "exp", false);
  double a=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
  }
  System.out.println("a : "+a+"/ ");
  return Math.exp(a); 
 }
 public double calculatePOW(String pow_str){
  System.out.print("this is calculate pow.....func "+pow_str+" ");
  StringTokenizer modToken = new StringTokenizer(pow_str, "^", false);
  double a=1,b=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
   b = Double.parseDouble(modToken.nextToken());
  }
  System.out.println("a : "+a+"/  b : "+b);
  return Math.pow(a,b); 
 }
 public double calculateLN(String ln_str){
  System.out.print("this is calculate ln.....func "+ln_str+" ");
  StringTokenizer modToken = new StringTokenizer(ln_str, "ln", false);
  double a=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
  }
  System.out.println("a : "+a+"/ ");
  return Math.log(a); 
 }
 public double calculateMULS(String muls_str){
  System.out.print("this is calculate ln.....muls "+muls_str+" ");
  StringTokenizer modToken = new StringTokenizer(muls_str, "!", false);
  double a=1,res=0;
  int i=0;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
  }
  System.out.println("a : "+a+"/ ");
  i = (int) Math.floor(a);
  res=1;
  for(;i>=1;i--){
   res*=a;
   a-=1;
  }
  
  return res; 
 }
 public double calculateLOG(String log_str){
  
  System.out.print("this is calculate log.....log "+log_str+" ");
  StringTokenizer modToken = new StringTokenizer(log_str, "log", false);
  double a=1;
  while(modToken.hasMoreElements()){
   a = Double.parseDouble(modToken.nextToken());
  }
  System.out.println("a : "+a+"/ ");
  return Math.log10(a); 
 }
 public ArrayList<String> makeList(StringTokenizer tokens){
        ArrayList<String> list = new ArrayList<String>();
        
        while(tokens.hasMoreElements()){
            list.add(tokens.nextToken());
        }
        return list;
    }
 public String getStr() {
  return str;
 }

 public double getResult() {
  return result;
 }

 public void setStr(String str) {
  this.str = str;
 }
}
