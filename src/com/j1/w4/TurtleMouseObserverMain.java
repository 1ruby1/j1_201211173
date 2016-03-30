package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TurtleMouseObserverMain {
    public static void main(String[] args) {
        TurtleMouseListener t=new TurtleMouseListener();
        t.addStatusBar(20);
        t.setStatusText("Click or drag!");
    }
}