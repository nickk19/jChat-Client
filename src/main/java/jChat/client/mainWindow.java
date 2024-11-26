package jChat.client;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;

public class mainWindow extends JFrame {
	private JButton connectBtn;
	private JButton disconnectBtn;
	private JLabel statusLbl;
	private JLabel serverAddrLbl;
	private JScrollPane msgBoard;
	private JScrollPane userBoard;
	private JLabel userLbl;
	private JTextField msgField;
	public JPanel mainPanel;

	private static String username;
	private static String serverAddress;
	private static int serverPort;
	public static mainWindow Instance;

	public mainWindow() {
		Instance = this;

		//Used to spawn serverMng to create new connection
		newConnection();
	}

	public static String getUsername() {
		return username;
	}

	public static String getServerAddress() {
		return serverAddress;
	}

	public static int getServerPort() {
		return serverPort;
	}

	public static void setUsername(String username) {
		mainWindow.username = username;
	}

	public static void setServerAddress(String serverAddress) {
		mainWindow.serverAddress = serverAddress;
	}

	public static void setServerPort(int serverPort) {
		mainWindow.serverPort = serverPort;
	}

	public void initWindow(JPanel panel, int width, int height, String title) {
		setContentPane(panel);
		setSize(width, height);
		setResizable(false);
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		setFlatLafLookAndFeel();
		setUIFont(new Font("Inter", Font.PLAIN, 20));

		new mainWindow();
	}

	public static void setFlatLafLookAndFeel() {
		try {
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (UnsupportedLookAndFeelException e) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception ex) {
				System.err.println("Can't initialize look and feel");
			}
		}
	}

	public static void setUIFont(Font f) {
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, f);
			}
		}
	}

	public static void newConnection() {
		setUsername(null);
		setServerAddress(null);
		setServerPort(-1);
		new serverMng();
	}

	public static void debugConnectionData() {
		System.out.println("username: " + getUsername());
		System.out.println("serverAddress: " + getServerAddress());
		System.out.println("serverPort: " + getServerPort());
	}
}
