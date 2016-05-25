package headfirst.templatemethod.frame;

import java.awt.*;
import javax.swing.*;

public class NewFrame extends JFrame {

 JButton btnApple, btnBanana,btnOrange;
 class MyAction implements ActionListener{
   public void actionPerformed(ActionEvent ev){
     if(ev.getSource == btnApple)System.out.println("Apple");
     else if(ev.getSource == btnBanana)System.out.println("Banana");
     else if(ev.getSource == btnOrange)System.out.println("Orange");
   }
 }
 public NewFrame(){
   Container mainPane = getContentPane();
   mainPane.setBackground(Color.WHITE);
   mainPane.setLayout(null);
   
   btnApple = new JButton("Apple");
   btnBanana = new JButton("Banana");
   btnOrange = new JButton("Orange");
   
   btnApple.setBounds(10,10,100,30);
   btnBanana.setBounds(10,50,100,30);
   btnOrange.setBounds(10,90,100,30);
   
   this.add(btnApple);
   this.add(btnBanana);
   this.add(btnOrange);
   
   setSize(300,300);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   btnApple.addActionListener(new MyAction());
   btnBanana.addActionListener(new MyAction());
   btnOrange.addActionListener(new MyAction());
 }

 public static void main(String[] args) {
  new NewFrame();
 }
}