package  com.j1.w8.calculatorPro.UI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class CalculatorUI extends JFrame{

 private Container jframeContainer;
 private ButtonPad keypad;
 private TextPad textPad;
 
 public CalculatorUI(){
  //set layout style
  this.jframeContainer = this.getContentPane();
  //this.jframeContainer.setLayout(new GridLayout(1,2));
  //this.jframeContainer.setLayout(new FlowLayout());
  this.jframeContainer.setLayout(new BorderLayout());
  
  //initialize keypad and textpad
  this.initTextPad();
  this.initKeyPad();
  
  //this.jframeContainer.add(keypad);
  //this.jframeContainer.add(textPad);
  this.jframeContainer.add(keypad, BorderLayout.WEST);
  this.jframeContainer.add(textPad, BorderLayout.EAST);
  
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.pack();
  this.setVisible(true);
 }
 
 private void initKeyPad(){
  this.keypad=new ButtonPad(this.textPad.getTextA(), this.textPad.getResulA(), this.textPad.getMemoryA());
 }
 private void initTextPad(){
  this.textPad = new TextPad();
 }
 public static void main(String[] args){
  CalculatorUI ui = new CalculatorUI();
 }
}
