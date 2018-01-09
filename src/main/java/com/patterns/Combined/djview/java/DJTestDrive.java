package com.patterns.Combined.djview.java;

public class DJTestDrive {

    public static void main(String[] args) {
        final BeatModelInterface model = new BeatModel();
        final ControllerInterface controller = new BeatController(model);
    }
}
