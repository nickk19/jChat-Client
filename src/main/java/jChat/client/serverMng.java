package jChat.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		mainWindow.Instance.initWindow(serverMngPanel, 300, 300, "New Connection");

		connectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				connectBtnAction();
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				dispose();
				System.exit(EXIT_ON_CLOSE);
			}
		});
	}

	private void connectBtnAction() {
		if (userFld.getText().isEmpty()) {
			mainWindow.setUsername("anon");
		} else {
			mainWindow.setUsername(userFld.getText().trim());
		}

		if(!serverAddrFld.getText().isEmpty() || !serverPortFld.getText().isEmpty()) {
			mainWindow.setServerAddress(serverAddrFld.getText().trim());
			try {
				mainWindow.setServerPort(Integer.parseInt(serverPortFld.getText().trim()));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(new Frame(),
						"The port number must be a positive integer.",
						"Bad server port",
						JOptionPane.WARNING_MESSAGE);
				return;
			}
		} else {
			JOptionPane.showMessageDialog(new Frame(),
					"Server's address or port is not valid.",
					"Bad server data",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		//Dispose serverMng and spawns mainWindow
		this.dispose();
		mainWindow.Instance.initWindow(mainWindow.Instance.mainPanel, 1000, 600, "jChat Client v0.1");
		mainWindow.debugConnectionData();
	}
}
