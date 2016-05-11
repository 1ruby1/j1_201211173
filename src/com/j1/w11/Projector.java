package com.j1.w11;

public class Projector{
  private String description;
  private DvdPlayer dvd;
  
  public Projector(DvdPlayer dvd){
    this.dvd = dvd;
  }
  
  public void on(){
    System.out.println("Projector ON...");
    this.dvd.on();
  }
  public void off(){
    System.out.println("Projector OFF...");
    this.dvd.off();
  }
  public void wideScreenMode(){
    this.description="This is wideScreen Mode projector..."
  }
  
  public String getDescription(){
    return this.description;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public DvdPlayer getDvd(){
    return this.dvd;
  }
  public void setDvd(DvdPlayer dvd){
    this.dvd = dvd;
  }
}