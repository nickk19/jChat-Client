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
	public JPanel mainPanel;

	//This is bad, but can't be done otherwise
	public static String username;
	public static String serverAddress;
	public static int serverPort;
	public static mainWindow Instance;

	public mainWindow(){
		Instance = this;

		//A class constructor that instantly switches scope to another class. wow...
		newConnection();
	}

	public void initWindow(JPanel panel, int width, int height, String title) {
		this.setContentPane(panel);
		this.setSize(width, height);
		this.setResizable(false);
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		System.out.println("username: " + username);
		System.out.println("serverAddress: " + serverAddress);
		System.out.println("serverPort: " + serverPort);
	}

	public static void main(String[] args) {
		setFlatLafLookAndFeel();
		setUIFont(new Font("Inter",Font.PLAIN,20));

		new mainWindow().setVisible(false);
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

	public static void newConnection(){
		new serverMng().setVisible(true);
	}
}
