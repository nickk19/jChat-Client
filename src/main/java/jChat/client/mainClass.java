package jChat.client;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class mainClass {
	private String username;
	private String serverAddress;
	private int serverPort;

	private mainWindow mainWin; /*	Reference used to check if mainWindow has ever been opened
									(ie if it's first execution) */

	public static void main(String[] args) {
		setFlatLafLookAndFeel();
		setUIFont(new Font("Inter", Font.PLAIN, 20));

		mainClass controller = new mainClass();
		controller.openServerMng();
	}

	public static void setFlatLafLookAndFeel() {
		try {
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (UnsupportedLookAndFeelException e) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception ex) {
				System.err.println("Couldn't initialize look and feel");
			}
		}
	}

	public static void setUIFont(Font f) {
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, f);
			}
		}
	}

	public void openServerMng() {
		new serverMng(this); /* Pass the controller to serverMng */
	}

	public void setServerData(String username, String serverAddress, int serverPort) {
		this.username = username;
		this.serverAddress = serverAddress;
		this.serverPort = serverPort;

		//If mainWindow exists update it, otherwise (re)open it
		if (mainWin != null) {
			mainWin.updateServerData();
		} else {
			mainWin = new mainWindow(this); /* Create mainWindow and pass controller */
		}
	}

	public String getUsername() {
		return username;
	}

	public String getServerAddress() {
		return serverAddress;
	}

	public int getServerPort() {
		return serverPort;
	}
}
