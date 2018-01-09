package com.patterns.Combined.djview.java;

public class HeartTestDrive {

    public static void main(String[] args) {
        final HeartModel heartModel = new HeartModel();
        final ControllerInterface model = new HeartController(heartModel);
    }
}
