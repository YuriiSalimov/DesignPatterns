package com.patterns.Combined.djview.java;

public final class BeatController implements ControllerInterface {

    private final BeatModelInterface model;
    private final DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        this.view = new DJView(this, this.model);
        this.view.createView();
        this.view.createControls();
        this.view.disableStopMenuItem();
        this.view.enableStartMenuItem();
        this.model.initialize();
    }

    @Override
    public void start() {
        this.model.on();
        this.view.disableStartMenuItem();
        this.view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        this.model.off();
        this.view.disableStopMenuItem();
        this.view.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        final int bpm = this.model.getBPM() + 1;
        setBPM(bpm);
    }

    @Override
    public void decreaseBPM() {
        final int bpm = this.model.getBPM() - 1;
        setBPM(bpm);
    }

    @Override
    public void setBPM(final int bpm) {
        this.model.setBPM(bpm);
    }
}
