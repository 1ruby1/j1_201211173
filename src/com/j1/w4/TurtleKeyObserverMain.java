/*
 * author jsl
 * since 20160327
 * key observer
 *
 * move on arrow key press
 *
 */

package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TurtleKeyObserverMain {
    public static void main(String[] args) {
        TurtleKeyListener t=new TurtleKeyListener();
        t.addStatusBar(20);
        t.setStatusText("Press any key!");
    }
}