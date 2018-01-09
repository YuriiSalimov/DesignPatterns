package com.patterns.Combined.djview.java;

import java.util.*;

public final class HeartModel implements HeartModelInterface, Runnable {

    private final List<BeatObserver> beatObservers = new ArrayList<>();
    private final List<BPMObserver> bpmObservers = new ArrayList<>();
    private final Random random = new Random(System.currentTimeMillis());
    private int time = 1000;

    public HeartModel() {
        final Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int lastrate = -1;
        while (true) {
            int change = this.random.nextInt(10);
            if (this.random.nextInt(2) == 0) {
                change = 0 - change;
            }
            final int rate = 60000 / (this.time + change);
            if (rate < 120 && rate > 50) {
                this.time += change;
                notifyBeatObservers();
                if (rate != lastrate) {
                    lastrate = rate;
                    notifyBPMObservers();
                }
            }
            try {
                Thread.sleep(this.time);
            } catch (Exception e) {
                break;
            }
        }
    }

    @Override
    public int getHeartRate() {
        return 60000 / this.time;
    }

    @Override
    public void registerObserver(final BeatObserver o) {
        this.beatObservers.add(o);
    }

    @Override
    public void removeObserver(final BeatObserver o) {
        int i = this.beatObservers.indexOf(o);
        if (i >= 0) {
            this.beatObservers.remove(i);
        }
    }

    public void notifyBeatObservers() {
        for (BeatObserver observer : this.beatObservers) {
            observer.updateBeat();
        }
    }

    @Override
    public void registerObserver(final BPMObserver o) {
        this.bpmObservers.add(o);
    }

    @Override
    public void removeObserver(final BPMObserver o) {
        int i = this.bpmObservers.indexOf(o);
        if (i >= 0) {
            this.bpmObservers.remove(i);
        }
    }

    public void notifyBPMObservers() {
        for (BPMObserver observer : this.bpmObservers) {
            observer.updateBPM();
        }
    }
}
