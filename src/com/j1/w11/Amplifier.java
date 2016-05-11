package com.j1.w11;

public class Amplifier{
  private String description;
  private Tuner tuner;
  private DvdPlayer dvd;
    
  public Amplifier(Tuner tuner, DvdPlayer dvd){
    this.tuner = tuner;
    this.dvd = dvd;
  }
  
  public void on(){
    System.out.println("Amplifier ON...");
  }
  public void off(){
    System.out.println("Amplifier OFF...");
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
  public Tuner getTuner(){
    return this.tuner;
  }
  public void setTuner(Amplifier tuner){
    this.tuner = tuner;
  }
   public DvdPlayer getDvd(){
    return this.dvd;
  }
  public void setDvd(String dvd){
    this.dvd = dvd;
  }
}