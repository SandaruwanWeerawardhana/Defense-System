
package demo;

import java.awt.Color;

public class Tank extends javax.swing.JFrame implements Observer {
    private final Observerble observerble = Observerble.getInstance();
    private boolean cleatToFire = false;

    public Tank() {
        observerble.addObserver(this);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAreaClear = new javax.swing.JLabel();
        jLabelShoot = new javax.swing.JLabel();
        jLabelMissileOperation = new javax.swing.JLabel();
        jLabelReaderOperation = new javax.swing.JLabel();
        jLabelRotateShooting = new javax.swing.JLabel();
        jLabelShoot5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBoxPosition = new javax.swing.JCheckBox();
        jSliderTank = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReceive = new javax.swing.JTextArea();
        jLabelReceiveMassage = new javax.swing.JLabel();
        jTextFieldSend = new javax.swing.JTextField();
        jLabelShoot7 = new javax.swing.JLabel();
        jLabelShoot8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAreaClear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelAreaClear.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAreaClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAreaClear.setText("Area Not Cleared");
        getContentPane().add(jLabelAreaClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 124, 35));

        jLabelShoot.setBackground(new java.awt.Color(255, 255, 255));
        jLabelShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelShoot.setForeground(new java.awt.Color(255, 255, 255));
        jLabelShoot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelShoot.setText("Shoot");
        jLabelShoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        getContentPane().add(jLabelShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 53, 119, 26));

        jLabelMissileOperation.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMissileOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMissileOperation.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMissileOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMissileOperation.setText("Missile Operation");
        jLabelMissileOperation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        getContentPane().add(jLabelMissileOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 53, 119, 26));

        jLabelReaderOperation.setBackground(new java.awt.Color(255, 255, 255));
        jLabelReaderOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelReaderOperation.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReaderOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReaderOperation.setText("Reader Operation");
        jLabelReaderOperation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        getContentPane().add(jLabelReaderOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, 119, 26));

        jLabelRotateShooting.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRotateShooting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRotateShooting.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRotateShooting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRotateShooting.setText("Rotate Shooting");
        jLabelRotateShooting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        getContentPane().add(jLabelRotateShooting, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 85, 119, 26));

        jLabelShoot5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelShoot5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelShoot5.setText("Ammo Count");
        getContentPane().add(jLabelShoot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 58, 78, -1));

        jButton1.setText("Send");
        jButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton1ItemStateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 338, 116, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 15, -1, -1));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 53, -1, -1));

        jCheckBoxPosition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxPosition.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxPosition.setText("Position");
        jCheckBoxPosition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxPositionItemStateChanged(evt);
            }
        });
        jCheckBoxPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPositionActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 113, 87, -1));

        jSliderTank.setBackground(new java.awt.Color(26, 0, 72));
        jSliderTank.setForeground(new java.awt.Color(255, 247, 255));
        jSliderTank.setMajorTickSpacing(20);
        jSliderTank.setMinorTickSpacing(10);
        jSliderTank.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderTank.setPaintLabels(true);
        jSliderTank.setPaintTicks(true);
        jSliderTank.setSnapToTicks(true);
        jSliderTank.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderTankStateChanged(evt);
            }
        });
        getContentPane().add(jSliderTank, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 303));

        jTextAreaReceive.setColumns(20);
        jTextAreaReceive.setRows(5);
        jScrollPane1.setViewportView(jTextAreaReceive);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 155, 382, 138));

        jLabelReceiveMassage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelReceiveMassage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReceiveMassage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReceiveMassage.setText("Receive");
        jLabelReceiveMassage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelReceiveMassage, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 129, 119, 20));

        jTextFieldSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSendActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 299, 382, 37));

        jLabelShoot7.setBackground(new java.awt.Color(255, 255, 255));
        jLabelShoot7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelShoot7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelShoot7.setText("Fuel");
        getContentPane().add(jLabelShoot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, -1));

        jLabelShoot8.setBackground(new java.awt.Color(255, 255, 255));
        jLabelShoot8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelShoot8.setText("Soilder Count");
        getContentPane().add(jLabelShoot8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 78, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Tank.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 520, 380));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String massage = "Tank : "+jTextFieldSend.getText();
        observerble.ReceiveMassage(massage);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPositionActionPerformed

    private void jTextFieldSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSendActionPerformed

    private void jButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton1ItemStateChanged
       
    }//GEN-LAST:event_jButton1ItemStateChanged

    private void jCheckBoxPositionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxPositionItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            observerble.setPosition(true);
            cleatToFire = true;
        } else if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            observerble.setPosition(false);
            cleatToFire = false;

            jLabelRotateShooting.setEnabled(false);
            jLabelReaderOperation.setEnabled(false);
            jLabelMissileOperation.setEnabled(false);
            jLabelShoot.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxPositionItemStateChanged

    private void jSliderTankStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderTankStateChanged
            
            observerble.fuelLevel(jSliderTank.getValue());
        
    }//GEN-LAST:event_jSliderTankStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new Tank().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAreaClear;
    private javax.swing.JLabel jLabelMissileOperation;
    private javax.swing.JLabel jLabelReaderOperation;
    private javax.swing.JLabel jLabelReceiveMassage;
    private javax.swing.JLabel jLabelRotateShooting;
    private javax.swing.JLabel jLabelShoot;
    private javax.swing.JLabel jLabelShoot5;
    private javax.swing.JLabel jLabelShoot7;
    private javax.swing.JLabel jLabelShoot8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderTank;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextAreaReceive;
    private javax.swing.JTextField jTextFieldSend;
    // End of variables declaration//GEN-END:variables

    @Override
    public void sendMassage(String text, char name) {
        if(name == 'T' || name == 'A'){
           jTextAreaReceive.append("Control Room : "+text+"\n");
       }
       
    }

    @Override
    public void AreaClear(boolean clear) {
        if(clear){
            jLabelAreaClear.setText("Area Clear");
        }else{
            jLabelAreaClear.setText("Area Not Clear");
        }
    }

    @Override
    public void Position(int level) {
        if(cleatToFire){
            jLabelRotateShooting.setEnabled(level >= 80);
            jLabelRotateShooting.setBackground(Color.RED);
            jLabelReaderOperation.setEnabled(level >= 60);
            jLabelReaderOperation.setBackground(Color.RED);
            jLabelMissileOperation.setEnabled(level >= 40);
            jLabelMissileOperation.setBackground(Color.RED);
            jLabelShoot.setEnabled(level >= 20);
            jLabelShoot.setBackground(Color.RED);
        }else{
            jLabelRotateShooting.setEnabled(false);
            jLabelReaderOperation.setEnabled(false);
            jLabelMissileOperation.setEnabled(false);
            jLabelShoot.setEnabled(false);
        }
    }

    void setLocationRelativeTo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void FuelCount(int count) {
      
    }
    
}
