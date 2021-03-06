package  com.j1.w8.calculatorPro.UI;

import com.j1.w8.calculatorPro.myCal.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ButtonPad extends JPanel{

 private ActionListener listener;
 private JPanel normalBtnPad;
 private JPanel radioPad;
 private JPanel specialBtnPad;
 
 private ArrayList<JButton> normalBtnList;
 private ArrayList<JRadioButton> radioBtnList;
 private ArrayList<JButton> specialBtnList;
 
 private TextArea textA;
 private TextArea resulA;
 private TextArea textM;
 
 private Map<Integer,ArrayList<String>> textMap;
 
 private ArrayList<int[][]> bracketList; 
 private String str;
 private String pre_res;
 
 public ButtonPad(TextArea textA, TextArea resulA, TextArea textM){
  
  this.textA = textA;
  this.resulA = resulA;
  this.textM = textM;
  
  this.bracketList = new ArrayList<int[][]>();
  this.radioBtnList = new ArrayList<JRadioButton>();
  this.normalBtnPad = new JPanel();
  this.radioPad = new JPanel();
  this.specialBtnPad = new JPanel();
  this.str = new String();
  this.pre_res=new String();
  
  //this.setLayout(new GridLayout(3, 1));
  this.setLayout(new BorderLayout());
  this.initListener();
  
  this.initNormalBtnPad();
  this.initRadioPad();
  this.initSpecialBtnPad();
  
  /*this.add(this.normalBtnPad);
  this.add(this.radioPad);
  this.add(this.specialBtnPad);*/
  this.add(normalBtnPad,BorderLayout.NORTH);
  this.add(specialBtnPad,BorderLayout.SOUTH);
 }
 
 private void initNormalBtnPad(){
  
  this.normalBtnPad.setLayout(new GridLayout(4,6,2,2));
  this.normalBtnText();
  this.normalBtnList = new ArrayList<JButton>();
  this.setButtons(this.normalBtnPad,this.normalBtnList);
 }
 private void initRadioPad(){
  
  this.radioPad.setLayout(new GridLayout(1, 6));
  JRadioButton  rb1 = new JRadioButton("Deg");
  JRadioButton  rb2 = new JRadioButton("Rad");
  
  this.radioBtnList.add(rb1);
  this.radioBtnList.add(rb2);
  
  ButtonGroup  group = new ButtonGroup();
  group.add(rb1);  group.add(rb2);
  
 }
 private void initSpecialBtnPad(){
  
  this.specialBtnPad.setLayout(new GridLayout(2,6,2,2));
  this.specialBtnText();
  this.specialBtnList = new ArrayList<JButton>();
  this.setButtons(this.normalBtnPad,specialBtnList);
 }
 
 private void normalBtnText(){
  
  this.textMap = new HashMap<Integer, ArrayList<String>>();
  
  ArrayList<String> strAry1 = new ArrayList<String>();
  strAry1.add("1");strAry1.add("2");strAry1.add("3");strAry1.add("4");strAry1.add("5");strAry1.add("6");
  this.textMap.put(new Integer(0), strAry1);
  
  ArrayList<String> strAry2 = new ArrayList<String>();
  strAry2.add("7");strAry2.add("8");strAry2.add("9");strAry2.add("0");strAry2.add("+");strAry2.add("-");
  this.textMap.put(new Integer(1), strAry2);
  
  ArrayList<String> strAry3 = new ArrayList<String>();
  strAry3.add("*");strAry3.add("%");strAry3.add("(");strAry3.add(")");strAry3.add("��");strAry3.add("=");
  this.textMap.put(new Integer(2), strAry3);
  
  ArrayList<String> strAry4 = new ArrayList<String>();
  strAry4.add("00");strAry4.add("e");strAry4.add("/");strAry4.add(".");strAry4.add("=");strAry4.add("C");
  this.textMap.put(new Integer(3), strAry4);
  
 }
 private void specialBtnText(){
  
  this.textMap = new HashMap<Integer, ArrayList<String>>();
  
  ArrayList<String> strAry1 = new ArrayList<String>();
  strAry1.add("sin");strAry1.add("cos");strAry1.add("tan");strAry1.add("��");strAry1.add("!");strAry1.add("^");
  this.textMap.put(new Integer(0), strAry1);
  
  ArrayList<String> strAry2 = new ArrayList<String>();
  strAry2.add("��");strAry2.add("Mod");strAry2.add("Exp");strAry2.add("log");strAry2.add("ln");strAry2.add("");
  this.textMap.put(new Integer(1), strAry2);
  
 }
 
 private void setButtons(JPanel jpanel,ArrayList<JButton> list){
  
  ArrayList<String> strAry;
  for(Integer textMapKey : this.textMap.keySet()){
   strAry = this.textMap.get(textMapKey);
   int leng = strAry.size();
   for(int i=0;i<leng;i++){
    JButton btn = new JButton(strAry.get(i));
    btn.addActionListener(this.listener);
    list.add(btn);
    jpanel.add(btn);
   }
  }
 }
 
 public void initListener(){
  this.listener = new ActionListener() {
   private int isError;
   public final static String ERRORMSG_1 = "syntax error !\nBracket is not closed";
   public final static String ERRORMSG_2 = "syntax error !\nEquation must end with \")\" or number.";
   public final static String ERRORMSG_3 = "syntax error !\nOperator(.) must follow [number.] shape.\n";
   public final static String ERRORMSG_4 = "syntax error !\nOperator(^) must follow [(number)^(number)] shape.\n";
   public final static String ERRORMSG_5 = "syntax error !\nOperator(Mod) must follow [(number)Mod(number)] shape.\n";
   public final static String ERRORMSG_6 = "syntax error !\nOperator(Exp) must follow [(number)Exp(number)] shape.\n";
   public final static String ERRORMSG_7 = "syntax error !\nOperator(/) : Can not divide with 0.";
   public final static String ERRORMSG_8 = "syntax error !\nWe don't define imaginary number (i).";
   
   @Override
   public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    JButton btn = (JButton)e.getSource();
    String text = btn.getText();
    String txtValue = textA.getText();
    int txtLeng = txtValue.length()-1;
    
    for(JButton jbtn : normalBtnList){
     if(jbtn.getText().equals("-")){
      jbtn.setEnabled(true);
     }
     if(jbtn.getText().equals("0")){
      jbtn.setEnabled(true);
     }
    }
    
    //syntax error check start
    int errorNo = this.syntaxCheck(text, txtValue, txtLeng);
    this.setNewText(text, txtValue, txtLeng);
   }

   public int getIsError() {
    return isError;
   }
   
   public int syntaxCheck(String text, String txtValue, int txtLeng){
    this.isError=-1;
    if(text.equals("0")){
     if(txtValue.substring(txtLeng, txtLeng+1).equals("/")){
      isError=7;
     }
     
    }
    else if(text.equals("-")){
     if(txtValue.substring(txtLeng, txtLeng+1).equals("��")){
      isError=8;
     }
    }
    else if(text.equals("(")){
     int[][] val = new int[1][2];
     str+="(";
     val[0][0]=str.length()-1;
     val[0][1]=-1;
     bracketList.add(val);
     
    }
    else if(text.equals(")")){
     int leng = bracketList.size()-1;
     for(;leng>=0;leng--){
      if(bracketList.get(leng)[0][1]==-1){
       bracketList.get(leng)[0][1]=str.length()-1;
       break;
      }
     }
     
    }
    else if(text.equals("=")){
     switch (txtValue.substring(txtLeng, txtLeng+1)) {
     case ")":
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
      this.isError=-1;
      if(!bracketList.isEmpty()){
       if(bracketList.get(0)[0][1]==-1)this.isError=1;
      }
      break;
     default :
      this.isError=2;
      break;
     } 
     
    }
    else if(text.equals(".")){
     switch (txtValue.substring(txtLeng, txtLeng+1)) {
     case ")":
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
      this.isError=-1;break;
     default :
      this.isError=3;
      break;
     }  
    }
    else if(text.equals("^")){
     switch (txtValue.substring(txtLeng, txtLeng+1)) {
     case ")":
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
      this.isError=-1;break;
     default :
      this.isError=4;
      break;
     }  
    }
    else if(text.equals("Mod")){
     switch (txtValue.substring(txtLeng, txtLeng+1)) {
     case ")":
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
      this.isError=-1;
      break;
     default :
      this.isError=5;
      break;
     }
     for(JButton jbtn : normalBtnList){
      if(jbtn.getText().equals("0")){
       jbtn.setEnabled(false);
      }
     }
    }
    else if(text.equals("Exp")){
     switch (txtValue.substring(txtLeng, txtLeng+1)) {
     case ")":
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
      this.isError=-1;break;
     default :
      this.isError=6;
      break;
     }
     
    }
    else if(text.equals("��")){
     for(JButton jbtn : normalBtnList){
      if(jbtn.getText().equals("-")){
       jbtn.setEnabled(false);
      }
     }

    }
    //syntax error check END
    return this.isError;
   }

   public void setNewText(String text, String txtValue, int txtLeng){
    
    switch (text) {
    case "=": 
     str = txtValue;
     MyCalculatorTree cal = new MyCalculatorTree(bracketList, str);
     cal.calculateBracket();
     System.out.println(cal.getResult());
     resulA.setText(Double.toString(cal.getResult()));
     textM.append(str+" = "+resulA.getText()+"\n");
     textA.setText(txtValue+" = "+resulA.getText());
     pre_res=resulA.getText();
     str = "";
     break;
    case "C":
     System.out.println("clear : ");
     txtValue="";
     resulA.setText("");
     str="";
     break;
    case "��":
     System.out.println("�� : ");
     int end=txtLeng;
     switch (txtValue.substring(txtLeng, txtLeng+1)) {
     case "^":
      break;
     case "d":
      end-=2; break;
     case "n":
      if(txtValue.substring(txtLeng-1, txtLeng).equals("l"))end-=1;
      else end-=2;
      break;
     case "s":
     case "g":
     case "p":
      end-=2; break;
     default:
      break;
     }
     txtValue=txtValue.substring(0, end);
           if(textA.getText().equals("")) textA.setText("");
           break;
    case "(":
     /*switch (txtValue.substring(txtLeng,txtLeng+1)) {
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
      txtValue+="*";
      break;
     }*/
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
     if(!pre_res.equals("")){
      txtValue="";
      pre_res = "";
     }
     txtValue+=text;
     break;
    default:
     if(!pre_res.equals("")){txtValue=pre_res;pre_res="";}
     txtValue+=text;
     break;
    }
    System.out.println("pre_res : "+pre_res);
    textA.setText(txtValue);
   }
  };
 }

 
 public ActionListener getListener() {
  return listener;
 }

 public void setListener(ActionListener listener) {
  this.listener = listener;
 }

 public JPanel getNormalBtnPad() {
  return normalBtnPad;
 }

 public void setNormalBtnPad(JPanel normalBtnPad) {
  this.normalBtnPad = normalBtnPad;
 }

 public JPanel getRadioPad() {
  return radioPad;
 }

 public void setRadioPad(JPanel radioPad) {
  this.radioPad = radioPad;
 }

 public JPanel getSpecialBtnPad() {
  return specialBtnPad;
 }

 public void setSpecialBtnPad(JPanel specialBtnPad) {
  this.specialBtnPad = specialBtnPad;
 }

 public Map<Integer, ArrayList<String>> getTextMap() {
  return textMap;
 }

 public void setTextMap(Map<Integer, ArrayList<String>> textMap) {
  this.textMap = textMap;
 }

 
 
 
}
