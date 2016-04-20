/*
 * threadSingleton
 */

package com.j1.w7.threadSingleton;

public class SingletonMain{
  public static void main(String []args){
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    Singleton instance3 = Singleton.getInstance();
  }
}