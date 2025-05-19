package jChat.client;

import javax.swing.*;

public class ClientWindow extends windowConstructor {
	private JButton connectBtn;
	private JButton disconnectBtn;
	private JLabel statusLbl;
	private JLabel serverAddrLbl;
	private JScrollPane msgBoard;
	private JScrollPane userBoard;
	private JLabel userLbl;
	private JTextField msgField;
	public JPanel mainPanel;

	String username;
	String serverAddress;
	int serverPort;

	private final mainClass controller;

	public ClientWindow(mainClass controller) {
		super(1000, 600, "jChat-Client v0.1");
		finalizeInit(mainPanel);
		this.controller = controller;

		connectBtn.addActionListener(actionEvent -> controller.openServerMng());

		updateServerData();
	}

	public void updateServerData() {
		this.username = controller.getUsername();
		this.serverAddress = controller.getServerAddress();
		this.serverPort = controller.getServerPort();
		debugDataConnection();
	}

	public void debugDataConnection() {
		System.out.println("username: " + username);
		System.out.println("serverAddress: " + serverAddress);
		System.out.println("serverPort: " + serverPort);
	}
}
