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

	public void finalizeInit(JPanel panel) {
		setContentPane(panel);
		pack();
		setVisible(true);
	}
}
