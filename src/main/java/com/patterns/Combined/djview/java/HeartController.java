package com.patterns.Combined.djview.java;

public final class HeartController implements ControllerInterface {

    private final HeartModelInterface model;
    private DJView view;

    public HeartController(final HeartModelInterface model) {
        this.model = model;
        this.view = new DJView(this, new HeartAdapter(model));
        this.view.createView();
        this.view.createControls();
        this.view.disableStopMenuItem();
        this.view.disableStartMenuItem();
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void increaseBPM() {
    }

    @Override
    public void decreaseBPM() {
    }

    @Override
    public void setBPM(final int bpm) {
    }
}



