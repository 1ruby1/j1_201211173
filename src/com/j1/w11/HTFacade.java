package com.j1.w11;

public class HTFacade{
  private Amlitier amp;
  private Tuner tuner;
  private DvdPlayer dvd;
  private Projector projector;
  public HTFacade(Amlitier amp,Tuner tuner,DvdPlayer dvd,Projector projector){
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.projector = projector;
  }
  
  public void watchMovie(String movie){
    System.out.println("Get ready to watch a movie.....");
    this.projector.on();
    this.projector.wideScreenMode();
    this.amp.on();
    this,amp.setDvd(dvd);
    this.amp.setVolume(5);
    this.dvd.on();
    this.dvd.play(movie);
  }
  
  public void endMovie(){
    System.out.println("Shutting off.....");
    this.project.off();
    this.dvd.stop();
    this.dvd.eject();
    this.dvd.off();
  }
  
}