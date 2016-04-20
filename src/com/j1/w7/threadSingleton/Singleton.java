/*
 * singleton classic
 */

package com.j1.w7.threadSingleton;

public class Singleton{
  private static Singleton INSTANCE;
  private static int NUMCALLED;
  private Singleton(){NUMCALLED=0;}
  public static synchronized Singleton getInstance(){
    if (INSTANCE == null) {
      INSTANCE = new Singleton();
    }
    NUMCALLED++;
    System.out.println("numCalled : "+NUMCALLED);
    return INSTANCE;
  }
}