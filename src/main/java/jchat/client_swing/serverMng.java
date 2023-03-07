package jchat.client_swing;

public class serverMng extends javax.swing.JFrame {

	public serverMng() {
		initComponents();
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        portText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ipText = new javax.swing.JTextField();
        connectBtn = new javax.swing.JButton();
        statusLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Connection");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username:");

        userText.setBackground(new java.awt.Color(51, 51, 51));
        userText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(204, 204, 204));
        userText.setCaretColor(new java.awt.Color(204, 204, 204));
        userText.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Server IP:");

        portText.setBackground(new java.awt.Color(51, 51, 51));
        portText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        portText.setForeground(new java.awt.Color(204, 204, 204));
        portText.setCaretColor(new java.awt.Color(204, 204, 204));
        portText.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Server Port:");

        ipText.setBackground(new java.awt.Color(51, 51, 51));
        ipText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipText.setForeground(new java.awt.Color(204, 204, 204));
        ipText.setCaretColor(new java.awt.Color(204, 204, 204));
        ipText.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        connectBtn.setBackground(new java.awt.Color(51, 51, 51));
        connectBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        connectBtn.setForeground(new java.awt.Color(204, 204, 204));
        connectBtn.setText("Connect");
        connectBtn.setFocusable(false);
        connectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBtnActionPerformed(evt);
            }
        });

        statusLbl.setBackground(new java.awt.Color(51, 51, 51));
        statusLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(204, 204, 204));
        statusLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(connectBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ipText)
                    .addComponent(userText)
                    .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(connectBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("New Connection");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBtnActionPerformed
		if (userText.getText().equals("")) {
			Client_swing.Instance.username = "Anonymous";
		} else {
			Client_swing.Instance.username = userText.getText();
		}

		Client_swing.Instance.serverIp = ipText.getText();
		
		try {
			Client_swing.Instance.serverPort = Integer.parseInt(portText.getText());
		} catch (NumberFormatException e) {
			statusLbl.setText("The port number must be a positive integer.");
		}

		if (Client_swing.Instance.serverIp.equals("") || Client_swing.Instance.serverPort == 0) {
			statusLbl.setText("Server's IP or Port number are not valid.");
		} else {
			this.dispose();
			Client_swing.Instance.connect();
		}
    }//GEN-LAST:event_connectBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectBtn;
    private javax.swing.JTextField ipText;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField portText;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
