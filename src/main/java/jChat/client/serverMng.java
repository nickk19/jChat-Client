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
		this.setContentPane(serverMngPanel);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setTitle("New Connection");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		//TODO: This shit doesn't work, check if you can fix it
		//mainWindow.Instance.initWindow(serverMngPanel, 300, 300, "New Connection");

		connectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				connectBtnAction();
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				dispose();
			}
		});
	}

	private void connectBtnAction() {
		if (userFld.getText().isEmpty()) {
			mainWindow.username = "anon";
		} else {
			mainWindow.username = userFld.getText().trim();
		}

		if(!serverAddrFld.getText().isEmpty() || !serverPortFld.getText().isEmpty()) {
			mainWindow.serverAddress = serverAddrFld.getText().trim();

			try {
				mainWindow.serverPort = Integer.parseInt(serverPortFld.getText().trim());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(new Frame(),
						"The port number must be a positive integer.",
						"Bad server port",
						JOptionPane.WARNING_MESSAGE);
				return;
			}
		} else {
			JOptionPane.showMessageDialog(new Frame(),
					"Server's address or is not valid.",
					"Bad server data",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		this.dispose();
		//Oblivious scope-switching call to mainWindow method
		mainWindow.Instance.initWindow(mainWindow.Instance.mainPanel, 1000, 600, "jChat Client v0.1");
	}
}
