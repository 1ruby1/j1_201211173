package  com.j1.w8.calculatorPro.UI;

import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JPanel;

public class TextPad extends JPanel{

 private static final long serialVersionUID = 4884017180231545125L;
 private TextArea textA;
 private TextArea resulA;
 private TextArea memoryA;
 
 private String memoryStr;
 private String str;
 private String result;
 
 public TextPad(){
  this.setLayout(new GridLayout(3, 1));
  
  this.textA = new TextArea();
  this.textA.setVisible(true);
  
  this.resulA = new TextArea();
  this.resulA.setVisible(true);
  this.resulA.setEditable(false);
  
  this.memoryA = new TextArea();
  this.memoryA.setVisible(true);
  this.memoryA.setEditable(false);
  
  this.add(this.textA);
  this.add(this.resulA);
  this.add(this.memoryA);
 }

 
 
 public TextArea getTextA() {
  return textA;
 }

 public void setTextA(TextArea textA) {
  this.textA = textA;
 }

 public TextArea getResulA() {
  return resulA;
 }

 public void setResulA(TextArea resulA) {
  this.resulA = resulA;
 }

 public TextArea getMemoryA() {
  return memoryA;
 }

 public void setMemoryA(TextArea memoryA) {
  this.memoryA = memoryA;
 }

 public String getMemoryStr() {
  return memoryStr;
 }

 public void setMemoryStr(String memoryStr) {
  this.memoryStr = memoryStr;
 }

 public String getStr() {
  return str;
 }

 public void setStr(String str) {
  this.str = str;
 }

 public String getResult() {
  return result;
 }

 public void setResult(String result) {
  this.result = result;
 }
 
}
