package com.j1.w11;

public class Tuner{
  private String description;
  private Amplifier amp;
  private double frequency;
    
  public Tuner( String description,Amplifier amp){
    this.amp = amp;
    this.description = description
  }
  
  public void on(){
    System.out.println("Tuner ON...");
  }
  public void off(){
    System.out.println("Tuner OFF...");
  }
  public void setVolume(int num){
    this.description = "Volume is "+num;
    System.out.println(this.description);
  }
  
  public String getDescription(){
    return this.description;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public Amplifier getAmp(){
    return this.amp;
  }
  public void setAmp(Amplifier amp){
    this.amp = amp;
  }
   public double getFrequency(){
    return this.frequency;
  }
  public void setFrequency(double frequency){
    this.frequency = frequency;
  }
}