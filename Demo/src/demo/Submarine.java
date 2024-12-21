
package demo;

import java.awt.Color;


public class Submarine extends javax.swing.JFrame implements Observer {
    private final Observerble observerble = Observerble.getInstance();
    private boolean clearFire = false;
    private  boolean areaClear = false;
    public Submarine() {
         observerble.addObserver(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAreaClear = new javax.swing.JLabel();
        jLabelShoot = new javax.swing.JLabel();
        jLabelTomahawkMiss = new javax.swing.JLabel();
        jLabelSonarOperation = new javax.swing.JLabel();
        jLabelTridentMissile = new javax.swing.JLabel();
        jButtonSend = new javax.swing.JButton();
        jLabelSoilderCount = new javax.swing.JLabel();
        jLabelAmmoCount = new javax.swing.JLabel();
        jSpinnerSoilderCount = new javax.swing.JSpinner();
        jSpinnerAmmoCount = new javax.swing.JSpinner();
        jSliderEnergy = new javax.swing.JSlider();
        jLabelSoilderCount1 = new javax.swing.JLabel();
        jLabelSoilderCount2 = new javax.swing.JLabel();
        jSliderOxygen = new javax.swing.JSlider();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReserveMassage = new javax.swing.JTextArea();
        jTextFieldSend = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SubMarine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAreaClear.setBackground(new java.awt.Color(255, 102, 102));
        jLabelAreaClear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelAreaClear.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAreaClear.setText("Area Not Cleared");
        jLabelAreaClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelAreaClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 126, 30));

        jLabelShoot.setBackground(new java.awt.Color(186, 14, 2));
        jLabelShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelShoot.setForeground(new java.awt.Color(255, 255, 255));
        jLabelShoot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelShoot.setText("Shoot");
        jLabelShoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));
        getContentPane().add(jLabelShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 42, 113, 24));

        jLabelTomahawkMiss.setBackground(new java.awt.Color(186, 14, 2));
        jLabelTomahawkMiss.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTomahawkMiss.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTomahawkMiss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTomahawkMiss.setText("Tomahawk Missile");
        jLabelTomahawkMiss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));
        getContentPane().add(jLabelTomahawkMiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 84, 113, 24));

        jLabelSonarOperation.setBackground(new java.awt.Color(0, 204, 51));
        jLabelSonarOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSonarOperation.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSonarOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSonarOperation.setText("Sonar Operation");
        jLabelSonarOperation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));
        getContentPane().add(jLabelSonarOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 42, 113, 24));

        jLabelTridentMissile.setBackground(new java.awt.Color(186, 14, 2));
        jLabelTridentMissile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTridentMissile.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTridentMissile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTridentMissile.setText("Trident-2 Missile");
        jLabelTridentMissile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));
        getContentPane().add(jLabelTridentMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 84, 113, 24));

        jButtonSend.setBackground(new java.awt.Color(116, 3, 246));
        jButtonSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSend.setForeground(new java.awt.Color(6, 0, 0));
        jButtonSend.setText("Send");
        jButtonSend.setAutoscrolls(true);
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 368, 142, -1));

        jLabelSoilderCount.setText("Soilder Count");
        getContentPane().add(jLabelSoilderCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 23, 75, 24));

        jLabelAmmoCount.setText("Ammo Count");
        getContentPane().add(jLabelAmmoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 55, 75, 24));
        getContentPane().add(jSpinnerSoilderCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 54, -1, -1));
        getContentPane().add(jSpinnerAmmoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 22, -1, -1));

        jSliderEnergy.setMajorTickSpacing(20);
        jSliderEnergy.setMinorTickSpacing(10);
        jSliderEnergy.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderEnergy.setPaintLabels(true);
        jSliderEnergy.setPaintTicks(true);
        jSliderEnergy.setValue(5);
        getContentPane().add(jSliderEnergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 54, -1, 345));

        jLabelSoilderCount1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSoilderCount1.setText("Energy");
        jLabelSoilderCount1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelSoilderCount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 23, -1, 24));

        jLabelSoilderCount2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSoilderCount2.setText("Oxygen");
        jLabelSoilderCount2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelSoilderCount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 23, -1, 24));

        jSliderOxygen.setMajorTickSpacing(20);
        jSliderOxygen.setMinorTickSpacing(10);
        jSliderOxygen.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderOxygen.setPaintLabels(true);
        jSliderOxygen.setPaintTicks(true);
        jSliderOxygen.setValue(5);
        getContentPane().add(jSliderOxygen, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 54, -1, 345));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setText("Position");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 92, 87, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reserve Massage");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 127, 113, 20));

        jTextAreaReserveMassage.setColumns(20);
        jTextAreaReserveMassage.setRows(5);
        jTextAreaReserveMassage.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextAreaReserveMassageAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextAreaReserveMassage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 152, 402, 166));
        getContentPane().add(jTextFieldSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 324, 402, 38));

        jLabel2.setBackground(new java.awt.Color(186, 14, 2));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Submarine.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 102), 2, true));
        jLabel2.setMaximumSize(new java.awt.Dimension(629, 410));
        jLabel2.setMinimumSize(new java.awt.Dimension(568, 405));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 570, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
           String massage = "Submarine : "+jTextFieldSend.getText();
           observerble.ReceiveMassage(massage);
    }//GEN-LAST:event_jButtonSendActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
     
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (areaClear==true) {
            if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                observerble.setPosition(true);
                clearFire = true;
            } else if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
                observerble.setPosition(false);
                clearFire = false;

                jLabelTridentMissile.setEnabled(false);
                jLabelTomahawkMiss.setEnabled(false);
                jLabelSonarOperation.setEnabled(false);
                jLabelShoot.setEnabled(false);
            }
        }
       
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jTextAreaReserveMassageAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextAreaReserveMassageAncestorAdded
        // TODO add your handling code here:sdderegasrfga

    }//GEN-LAST:event_jTextAreaReserveMassageAncestorAdded

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(()-> {
            new Submarine().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSend;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAmmoCount;
    private javax.swing.JLabel jLabelAreaClear;
    private javax.swing.JLabel jLabelShoot;
    private javax.swing.JLabel jLabelSoilderCount;
    private javax.swing.JLabel jLabelSoilderCount1;
    private javax.swing.JLabel jLabelSoilderCount2;
    private javax.swing.JLabel jLabelSonarOperation;
    private javax.swing.JLabel jLabelTomahawkMiss;
    private javax.swing.JLabel jLabelTridentMissile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderEnergy;
    private javax.swing.JSlider jSliderOxygen;
    private javax.swing.JSpinner jSpinnerAmmoCount;
    private javax.swing.JSpinner jSpinnerSoilderCount;
    private javax.swing.JTextArea jTextAreaReserveMassage;
    private javax.swing.JTextField jTextFieldSend;
    // End of variables declaration//GEN-END:variables

    @Override
    public void sendMassage(String text, char name) {
        if (name == 'A' || name == 'S') {
            jTextAreaReserveMassage.append("Control Room : "+text+"\n");
        }
    }

    @Override
    public void AreaClear(boolean clear) {
        if(clear){
            jLabelAreaClear.setText("Area Clear");
            areaClear = true;
        }else{
            jLabelAreaClear.setText("Area Not Clear");
        }
    }

    @Override
    public void Position(int level) {
        if(clearFire){
            jLabelTridentMissile.setEnabled(level >= 80);
            jLabelTridentMissile.setBackground(Color.RED);
            jLabelTomahawkMiss.setEnabled(level >= 60);
            jLabelTomahawkMiss.setBackground(Color.RED);
            jLabelSonarOperation.setEnabled(level >= 40);
            jLabelSonarOperation.setBackground(Color.RED);
            jLabelShoot.setEnabled(level >= 20);
            jLabelShoot.setBackground(Color.RED);  
        }else{
            jLabelTridentMissile.setEnabled(false);
            jLabelTomahawkMiss.setEnabled(false);
            jLabelSonarOperation.setEnabled(false);
            jLabelShoot.setEnabled(false);
        }
    }

    @Override
    public void FuelCount(int count) {
        
    }
}
