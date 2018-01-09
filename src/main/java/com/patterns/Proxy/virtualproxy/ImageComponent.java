package com.patterns.Proxy.virtualproxy;

import java.awt.*;
import javax.swing.*;

public final class ImageComponent extends JComponent {

	private Icon icon;

	public ImageComponent(final Icon icon) {
		this.icon = icon;
	}

	public void setIcon(final Icon icon) {
		this.icon = icon;
	}

	public void paintComponent(final Graphics g) {
		super.paintComponent(g);
		final int w = this.icon.getIconWidth();
		final int h = this.icon.getIconHeight();
		final int x = (800 - w)/2;
		final int y = (600 - h)/2;
		this.icon.paintIcon(this, g, x, y);
	}
}
