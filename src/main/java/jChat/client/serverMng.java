package jChat.client;

import javax.swing.*;
import java.awt.*;

public class serverMng extends BaseWindow {
	private JPanel serverMngPanel;
	private JLabel userLbl;
	private JTextField userFld;
	private JLabel serverAddrLbl;
	private JTextField serverAddrFld;
	private JLabel serverPortLbl;
	private JTextField serverPortFld;
	private JButton connectBtn;
	private JButton cancelBtn;

	private final mainClass controller;

	public serverMng(mainClass controller) {
		super(300, 300, "New Connection");
		finalizeInit(serverMngPanel);
		this.controller = controller; /* Gets controller */

		connectBtn.addActionListener(actionEvent -> connectBtnAction());
		cancelBtn.addActionListener(actionEvent -> dispose());
	}

	private void connectBtnAction() {
		String username;
		if (userFld.getText().isEmpty()) {
			username = "anon";

		} else {
			username = userFld.getText().trim();
		}

		String serverAddress;
		int serverPort;
		if(!serverAddrFld.getText().isEmpty() || !serverPortFld.getText().isEmpty()) {
			serverAddress = serverAddrFld.getText().trim();
			try {
				serverPort = Integer.parseInt(serverPortFld.getText().trim());
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

		/* Dispose serverMng and pass data back to mainClass */
		dispose();
		controller.setServerData(username, serverAddress, serverPort);
	}
}
