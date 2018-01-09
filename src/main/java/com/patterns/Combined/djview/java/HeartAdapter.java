package com.patterns.Combined.djview.java;

public final class HeartAdapter implements BeatModelInterface {

    private final HeartModelInterface heart;

    public HeartAdapter(final HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public int getBPM() {
        return this.heart.getHeartRate();
    }

    @Override
    public void setBPM(final int bpm) {
    }

    @Override
    public void registerObserver(final BeatObserver o) {
        this.heart.registerObserver(o);
    }

    @Override
    public void removeObserver(final BeatObserver o) {
        this.heart.removeObserver(o);
    }

    @Override
    public void registerObserver(final BPMObserver o) {
        this.heart.registerObserver(o);
    }

    @Override
    public void removeObserver(final BPMObserver o) {
        this.heart.removeObserver(o);
    }
}
