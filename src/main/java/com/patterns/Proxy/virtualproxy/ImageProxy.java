package com.patterns.Proxy.virtualproxy;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class ImageProxy implements Icon {

    private ImageIcon imageIcon;
    private URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;

    public ImageProxy(final URL url) {
        this.imageURL = url;
    }

    @Override
    public int getIconWidth() {
        if (this.imageIcon != null) {
            return this.imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (this.imageIcon != null) {
            return this.imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon(final Component c, final Graphics g, final int x, final int y) {
        if (this.imageIcon != null) {
            this.imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!this.retrieving) {
                this.retrieving = true;
                this.retrievalThread = new Thread(() -> {
                    try {
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                this.retrievalThread.start();
            }
        }
    }
}
