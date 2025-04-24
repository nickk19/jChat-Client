package jChat.client;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class BaseClass {
	private String username;
	private String serverAddress;
	private int serverPort;

	private ClientWindow ClientWin; /*Reference used to check if ClientWindow has ever been opened
									(ie if it's first execution) */

	public static void main(String[] args) {
		setFlatLafLookAndFeel();
		setUIFont(new Font("Inter", Font.PLAIN, 20));

		BaseClass controller = new BaseClass();
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
		new ManagerWindow(this); /* Pass the controller to ManagerWindow */
	}

	public void setServerData(String username, String serverAddress, int serverPort) {
		this.username = username;
		this.serverAddress = serverAddress;
		this.serverPort = serverPort;

		/* If mainWindow exists update it, otherwise (re)open it */
		if (ClientWin != null) {
			ClientWin.updateServerData();
		} else {
			ClientWin = new ClientWindow(this); /* Create mainWindow and pass controller */
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
