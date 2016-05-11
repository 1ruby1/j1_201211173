package com.j1.w11;

public class DvdPlayer{
  private String description;
  private Amplifier amp;
  private String movie;
    
  public DvdPlayer(Amplifier amp, String movie){
    this.amp = amp;
    this.movie = movie;
  }
  
  public void on(){
    System.out.println("DvdPlayer ON...");
    this.amp.on();
  }
  public void off(){
    System.out.println("DvdPlayer OFF...");
    this.amp.off();
  }
  public void play(String movie){
    this.movie = movie;
    System.out.println("DvdPlayer play..."+movie);
  }  
  public void stop(){
    System.out.println("DvdPlayer stop..."+movie);
  }
  public void eject(){
    System.out.println("DvdPlayer eject...");
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
   public String getMovie(){
    return this.movie;
  }
  public void setMovie(String movie){
    this.movie = movie;
  }
}