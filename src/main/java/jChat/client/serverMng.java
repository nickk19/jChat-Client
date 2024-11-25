package jChat.client;

import javax.swing.*;
import java.awt.*;

public class serverMng extends JFrame {
	private JPanel serverMngPanel;
	private JLabel userLbl;
	private JTextField userFld;
	private JLabel serverAddrLbl;
	private JTextField serverAddrFld;
	private JLabel serverPortLbl;
	private JTextField serverPortFld;
	private JButton connectBtn;
	private JButton cancelBtn;

	public serverMng() {
		this.setContentPane(serverMngPanel);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setTitle("New Connection");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		mainWindow.setFlatLafLookAndFeel();
		mainWindow.setUIFont(new Font("Inter",Font.PLAIN,18));

		new serverMng();
	}
}
