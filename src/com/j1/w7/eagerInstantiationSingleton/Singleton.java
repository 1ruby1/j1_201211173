/*
 * singleton eager Instantiation
 */

package com.j1.w7.eagerInstantiationSingleton;

public class Singleton{
  private static Singleton INSTANCE;
  private static int NUMCALLED;
  {
    INSTANCE = new Singlegon();
    NUMCALLED = 0;
  }
  private Singleton(){NUMCALLED=0;}
  public static Singleton getInstance(){
    NUMCALLED++;
    System.out.println("numCalled : "+NUMCALLED);
    return INSTANCE;
  }
}