/*
 * singleton classic
 */

package com.j1.w7.classicSingleton;

public class SingletonMain{
  public static void main(String []args){
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    Singleton instance3 = Singleton.getInstance();
  }
}