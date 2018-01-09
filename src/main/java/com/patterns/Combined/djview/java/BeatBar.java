package com.patterns.Combined.djview.java;

import javax.swing.*;

public final class BeatBar extends JProgressBar implements Runnable {

    private static final long serialVersionUID = 2L;
    private JProgressBar progressBar;
    private Thread thread;

    public BeatBar() {
        this.thread = new Thread(this);
        setMaximum(100);
        this.thread.start();
    }

    public void run() {
        while (true) {
            int value = getValue();
            value = (int) (value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                break;
            }
            ;
        }
    }
}
