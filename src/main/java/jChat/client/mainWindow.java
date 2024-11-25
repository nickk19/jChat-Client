package jChat.client;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;

public class mainWindow extends JFrame{
	private JButton connectBtn;
	private JButton disconnectBtn;
	private JLabel statusLbl;
	private JLabel serverAddrLbl;
	private JScrollPane msgBoard;
	private JScrollPane userBoard;
	private JLabel userLbl;
	private JTextField msgField;
	private JPanel mainPanel;

	public mainWindow(){
		this.setContentPane(mainPanel);
		this.setSize(1000, 600);
		this.setResizable(false);
		this.setTitle("jChat Client v0.1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		setFlatLafLookAndFeel();
		setUIFont(new Font("Inter",Font.PLAIN,20));
		new mainWindow();
	}

	public static void setFlatLafLookAndFeel() {
		try {
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch(UnsupportedLookAndFeelException e) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception ex) {
				System.err.println("Can't initialize look and feel");
			}
		}
	}

	public static void setUIFont(Font f){
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get (key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, f);
			}
		}
	}

}
