package jChat.client;

import javax.swing.*;

public abstract class BaseWindow extends JFrame {
	public BaseWindow(int width, int height, String title) {
		setSize(width, height);
		setResizable(false);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	/* Needed because can't pass JPanel at superclass constructor, since, well, it's not initialized */
	public void finalizeInit(JPanel panel) {
		setContentPane(panel);
		pack();
		setVisible(true);
	}
}
