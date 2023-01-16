package jchat.client_swing;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Client_swing extends javax.swing.JFrame {

    String serverIp = "";
    int serverPort = 0;
    Socket mySocket;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader inStream; 		//Input stream from server
    DataOutputStream outStream; 	//Output stream to server

    public Client_swing() {
        initComponents();
        serverAddr();
        connect();
        receive();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        msgTextField = new javax.swing.JTextField();
        ipLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        msgArea = new javax.swing.JTextArea();
        statusLabel = new javax.swing.JLabel();
        connectButton = new javax.swing.JButton();
        disconnectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jChat-Client");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setBackground(new java.awt.Color(51, 51, 51));

        userLabel.setBackground(new java.awt.Color(51, 51, 51));
        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(204, 204, 204));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("Username:");
        userLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        msgTextField.setBackground(new java.awt.Color(51, 51, 51));
        msgTextField.setForeground(new java.awt.Color(204, 204, 204));
        msgTextField.setBorder(null);
        msgTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        msgTextField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        msgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPress(evt);
            }
        });

        ipLabel.setBackground(new java.awt.Color(51, 51, 51));
        ipLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipLabel.setForeground(new java.awt.Color(204, 204, 204));
        ipLabel.setText("Connected to:");
        ipLabel.setFocusable(false);

        scrollPane.setBackground(new java.awt.Color(51, 51, 51));
        scrollPane.setForeground(new java.awt.Color(204, 204, 204));
        scrollPane.setFocusable(false);

        msgArea.setEditable(false);
        msgArea.setBackground(new java.awt.Color(51, 51, 51));
        msgArea.setColumns(20);
        msgArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msgArea.setForeground(new java.awt.Color(204, 204, 204));
        msgArea.setRows(5);
        msgArea.setBorder(null);
        msgArea.setCaretColor(new java.awt.Color(204, 204, 204));
        msgArea.setFocusable(false);
        msgArea.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        scrollPane.setViewportView(msgArea);

        statusLabel.setBackground(new java.awt.Color(51, 51, 51));
        statusLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(204, 204, 204));
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        connectButton.setBackground(new java.awt.Color(51, 51, 51));
        connectButton.setForeground(new java.awt.Color(204, 204, 204));
        connectButton.setText("Connect");
        connectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        connectButton.setEnabled(false);
        connectButton.setFocusable(false);
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectPress(evt);
            }
        });

        disconnectButton.setBackground(new java.awt.Color(51, 51, 51));
        disconnectButton.setForeground(new java.awt.Color(204, 204, 204));
        disconnectButton.setText("Disconnect");
        disconnectButton.setFocusable(false);
        disconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectPress(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(userLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgTextField))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(connectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disconnectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 714, Short.MAX_VALUE)
                        .addComponent(ipLabel)
                        .addGap(12, 12, 12))
                    .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipLabel)
                    .addComponent(statusLabel)
                    .addComponent(connectButton)
                    .addComponent(disconnectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(msgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendPress(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPress
        try {
            String strUtente = msgTextField.getText();
            if (strUtente.equals("DISCONNECT")) {
                disconnect();
            } else {
                outStream.writeBytes(strUtente + "\n");
                outStream.flush();
                msgTextField.setText("");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "You are not connected to any server.", "Not connected", JOptionPane.ERROR_MESSAGE);
            clean();
        }
    }//GEN-LAST:event_sendPress

    private void connectPress(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectPress
        serverAddr();
        connect();
    }//GEN-LAST:event_connectPress

    private void disconnectPress(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectPress
        disconnect();
    }//GEN-LAST:event_disconnectPress

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        disconnect();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Client_swing().setVisible(true);
            }
        });
    }

    public void serverAddr() throws HeadlessException, NumberFormatException {
        do {
            serverIp = "";
            serverPort = 0;

            serverIp = JOptionPane.showInputDialog(rootPane, "Server IP: ", "Server IP", JOptionPane.QUESTION_MESSAGE);
            try {
                serverPort = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Server Port: ", "Server Port", JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Port number needs to be a positive number", "Invalid Port number", JOptionPane.ERROR_MESSAGE);
            }

            if (serverIp == "" || serverPort == 0) {
                JOptionPane.showMessageDialog(rootPane, "Server's IP and Port are not valid.", "Invalid IP or Port", JOptionPane.ERROR_MESSAGE);
            }
        } while (serverIp == "" || serverPort == 0);
    }

    public Socket connect() {
        try {
            mySocket = new Socket(serverIp, serverPort);
            outStream = new DataOutputStream(mySocket.getOutputStream());
            inStream = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
            userLabel.setText(mySocket.getInetAddress().getCanonicalHostName() + ":");

            ipLabel.setText("Connected to: " + serverIp);
            ipLabel.setVisible(true);

            connectButton.setEnabled(false);
            disconnectButton.setEnabled(true);
        } catch (ConnectException e) {
            JOptionPane.showMessageDialog(rootPane, "Connection refused. Is the server online?", "Connection refused.", JOptionPane.ERROR_MESSAGE);
            disconnect();
        } catch (IOException e) {
            statusLabel.setText("Error while connecting.");
            disconnect();
        }
        return mySocket;
    }

    public void receive() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mySocket != null && mySocket.isConnected()) {
                    String strRicevuta;
                    try {
                        strRicevuta = inStream.readLine();
                        msgArea.append(strRicevuta + "\n");
                    } catch (IOException e) {}
                }
            }
        }).start();
    }

    public void disconnect() {
        try {
            if (mySocket != null) {     //For some reasons the socket may also be disconnected
                outStream.writeBytes("DISCONNECT\n");
                mySocket.close();
                bufferedReader.close();
                inStream.close();
                outStream.close();
            }
            mySocket = null;
            clean();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error while closing the network stack", "Network error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void clean() {
        ipLabel.setVisible(false);
        connectButton.setEnabled(true);
        disconnectButton.setEnabled(false);
        
        statusLabel.setText("Disconnected.");
        msgTextField.setText("");
        msgArea.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectButton;
    private javax.swing.JButton disconnectButton;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JTextArea msgArea;
    private javax.swing.JTextField msgTextField;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
