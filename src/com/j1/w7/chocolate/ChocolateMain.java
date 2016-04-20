/*
 * singleton classic
 */

package com.j1.w7.chocolate;

public class ChocolateMain{
  public static void main(String []args){
    ChocolateBoilereton instance1 = ChocolateBoiler.getInstance();
    instance1.fill();
    ChocolateBoiler instance2 = ChocolateBoiler.getInstance();
  }
}