package com.j1.w12;
import java.util.ArrayList;

public class DinerMenu{
  /*public static int MAX_ITEMS = 3;
  private int numberofItems=0;
  private MenuItem[] menuItems;*/
  private ArrayList iList;
  public DinerMenu(){
    //this.menuItems = new MenuItem[MAX_ITEMS];
    this.iList = new ArrayList();
    addItem("name_1","des..._1",true,2.9);
    addItem("name_2","des..._2",true,3.9);
    addItem("name_3","des..._3",true,3.0);
  }
  
  public void addItem(String name,String des, boolean v, double price){
    MenuItem i1 = new MenuItem(name,des,v,price);
    /*if(numberofItems>=MAX_ITEMS){
      System.out.println("ERror");
    }else{
      this.menuItems[numberofItems] = i1;
      numberofItems++;
    }*/
    this.iList.add(i1);
  }
}