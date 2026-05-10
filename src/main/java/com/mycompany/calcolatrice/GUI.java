package com.mycompany.calcolatrice;

import java.text.DecimalFormat;

public class GUI extends javax.swing.JFrame {
    //TODO: fix bug se premi uguale o segno consecutivamente, fix bug se premi - o / consecutivamente, fix operazioni dopo scritta "errore"
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    private final int MAXLEN = 11;
    private String numVS = "";
    private Double op1;
    private Double op2;
    private DecimalFormat df;
    private Double res = 0.0;
    private int op = 0; //0: DV; 1: MP; 2: ST; 3: SM;
    private int lockBT = 2; //0: tutto tranne C, 1: tutto tranne C,= e +-*/, 2: tutto
    
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bC = new javax.swing.JButton();
        bCE = new javax.swing.JButton();
        bDL = new javax.swing.JButton();
        bDV = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b00 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bMP = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bST = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bSM = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bDP = new javax.swing.JButton();
        bEQ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(null);

        jLabel1.setBackground(new java.awt.Color(20, 20, 20));
        jLabel1.setFont(new java.awt.Font("IBM Plex Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 50, 50));
        jLabel1.setText("0");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 2, true), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));

        bC.setBackground(new java.awt.Color(50, 50, 50));
        bC.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bC.setForeground(new java.awt.Color(240, 240, 240));
        bC.setText("C");
        bC.setFocusPainted(false);
        bC.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bC.addActionListener(this::bCActionPerformed);

        bCE.setBackground(new java.awt.Color(50, 50, 50));
        bCE.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bCE.setForeground(new java.awt.Color(240, 240, 240));
        bCE.setText("CE");
        bCE.setFocusPainted(false);
        bCE.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bCE.addActionListener(this::bCEActionPerformed);

        bDL.setBackground(new java.awt.Color(50, 50, 50));
        bDL.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bDL.setForeground(new java.awt.Color(240, 240, 240));
        bDL.setText("DL");
        bDL.setFocusPainted(false);
        bDL.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bDL.addActionListener(this::bDLActionPerformed);

        bDV.setBackground(new java.awt.Color(50, 50, 50));
        bDV.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bDV.setForeground(new java.awt.Color(240, 240, 240));
        bDV.setText("/");
        bDV.setFocusPainted(false);
        bDV.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bDV.addActionListener(this::bDVActionPerformed);

        b7.setBackground(new java.awt.Color(50, 50, 50));
        b7.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b7.setForeground(new java.awt.Color(240, 240, 240));
        b7.setText("7");
        b7.setFocusPainted(false);
        b7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b7.addActionListener(this::b7ActionPerformed);

        b4.setBackground(new java.awt.Color(50, 50, 50));
        b4.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b4.setForeground(new java.awt.Color(240, 240, 240));
        b4.setText("4");
        b4.setFocusPainted(false);
        b4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b4.addActionListener(this::b4ActionPerformed);

        b1.setBackground(new java.awt.Color(50, 50, 50));
        b1.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b1.setForeground(new java.awt.Color(240, 240, 240));
        b1.setText("1");
        b1.setFocusPainted(false);
        b1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b1.addActionListener(this::b1ActionPerformed);

        b00.setBackground(new java.awt.Color(50, 50, 50));
        b00.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b00.setForeground(new java.awt.Color(240, 240, 240));
        b00.setText("Ans");
        b00.setFocusPainted(false);
        b00.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b00.addActionListener(this::bANSActionPerformed);

        b8.setBackground(new java.awt.Color(50, 50, 50));
        b8.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b8.setForeground(new java.awt.Color(240, 240, 240));
        b8.setText("8");
        b8.setFocusPainted(false);
        b8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b8.addActionListener(this::b8ActionPerforme);

        b9.setBackground(new java.awt.Color(50, 50, 50));
        b9.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b9.setForeground(new java.awt.Color(240, 240, 240));
        b9.setText("9");
        b9.setFocusPainted(false);
        b9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b9.addActionListener(this::b9ActionPerformed);

        bMP.setBackground(new java.awt.Color(50, 50, 50));
        bMP.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bMP.setForeground(new java.awt.Color(240, 240, 240));
        bMP.setText("X");
        bMP.setFocusPainted(false);
        bMP.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bMP.addActionListener(this::bMPActionPerformed);

        b5.setBackground(new java.awt.Color(50, 50, 50));
        b5.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b5.setForeground(new java.awt.Color(240, 240, 240));
        b5.setText("5");
        b5.setFocusPainted(false);
        b5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b5.addActionListener(this::b5ActionPerformed);

        b6.setBackground(new java.awt.Color(50, 50, 50));
        b6.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b6.setForeground(new java.awt.Color(240, 240, 240));
        b6.setText("6");
        b6.setFocusPainted(false);
        b6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b6.addActionListener(this::b6ActionPerformed);

        bST.setBackground(new java.awt.Color(50, 50, 50));
        bST.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bST.setForeground(new java.awt.Color(240, 240, 240));
        bST.setText("-");
        bST.setFocusPainted(false);
        bST.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bST.addActionListener(this::bSTActionPerformed);

        b2.setBackground(new java.awt.Color(50, 50, 50));
        b2.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b2.setForeground(new java.awt.Color(240, 240, 240));
        b2.setText("2");
        b2.setFocusPainted(false);
        b2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b2.addActionListener(this::b2ActionPerformed);

        b3.setBackground(new java.awt.Color(50, 50, 50));
        b3.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b3.setForeground(new java.awt.Color(240, 240, 240));
        b3.setText("3");
        b3.setFocusPainted(false);
        b3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b3.addActionListener(this::b3ActionPerformed);

        bSM.setBackground(new java.awt.Color(50, 50, 50));
        bSM.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bSM.setForeground(new java.awt.Color(240, 240, 240));
        bSM.setText("+");
        bSM.setFocusPainted(false);
        bSM.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bSM.addActionListener(this::bSMActionPerformed);

        b0.setBackground(new java.awt.Color(50, 50, 50));
        b0.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        b0.setForeground(new java.awt.Color(240, 240, 240));
        b0.setText("0");
        b0.setFocusPainted(false);
        b0.setMargin(new java.awt.Insets(2, 2, 2, 2));
        b0.addActionListener(this::b0ActionPerformed);

        bDP.setBackground(new java.awt.Color(50, 50, 50));
        bDP.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bDP.setForeground(new java.awt.Color(240, 240, 240));
        bDP.setText(",");
        bDP.setFocusPainted(false);
        bDP.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bDP.addActionListener(this::bDPActionPerformed);

        bEQ.setBackground(new java.awt.Color(50, 50, 50));
        bEQ.setFont(new java.awt.Font("IBM Plex Sans", 0, 35)); // NOI18N
        bEQ.setForeground(new java.awt.Color(240, 240, 240));
        bEQ.setText("=");
        bEQ.setFocusPainted(false);
        bEQ.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bEQ.addActionListener(this::bEQActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bDL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bST, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bST, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCEActionPerformed
        if(lockBT!=2) return;
        jLabel1.setText("0");
        numVS = "";
    }//GEN-LAST:event_bCEActionPerformed

    private void bDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDLActionPerformed
        if(lockBT!=2) return;
        if (numVS != null && numVS.length() > 1)
        {
            numVS = numVS.substring(0, numVS.length() - 1);
            jLabel1.setText(numVS);
        }
        else if(numVS.length() == 1)
        {   
            numVS = "";
            jLabel1.setText("0");
        }
    }//GEN-LAST:event_bDLActionPerformed

    private void bDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDVActionPerformed
        if(lockBT == 0) return;
        lockBT=2;
        if(!numVS.equals("")) op1 = Double.valueOf(jLabel1.getText().replace(",", "."));
        op = 0;
        numVS = "";
        jLabel1.setText("0");
    }//GEN-LAST:event_bDVActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "9";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b9ActionPerformed

    private void bANSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bANSActionPerformed
        if(lockBT!=2) return;
        numVS = formatNumber(res);
        jLabel1.setText(numVS);
    }//GEN-LAST:event_bANSActionPerformed
    private void b8ActionPerforme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerforme
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "8";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b8ActionPerforme

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "7";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b7ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "4";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "1";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b1ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "6";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "5";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b5ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return; 
        numVS += "2";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(numVS.length()>MAXLEN || lockBT!=2) return;
        numVS += "3";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b3ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if(numVS.equals("0") || numVS.length()>MAXLEN || lockBT!=2) return; 
        numVS += "0";
        jLabel1.setText(numVS);
    }//GEN-LAST:event_b0ActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        lockBT=2;
        op1=null;
        op2=null;
        jLabel1.setText("0");
        numVS = "";
    }//GEN-LAST:event_bCActionPerformed

    private void bEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEQActionPerformed
        if(op1 == null || lockBT == 0) return;
        if(lockBT==2) //prima volta che premi =
        {
            op2 = Double.valueOf(jLabel1.getText().replace(",", "."));
        }
        
        if(op==0) res = op1/op2;
        if(op==1) res = op1*op2;
        if(op==2) res = op1-op2;
        if(op==3) res = op1+op2;
            
        if (res.isInfinite() || res.isNaN()) {
            jLabel1.setText("Errore");
            lockBT=0;
            return;
        }
        numVS = formatNumber(res);
        jLabel1.setText(numVS);
        lockBT=1;
        op1 = res;
    }//GEN-LAST:event_bEQActionPerformed

    private void bSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSMActionPerformed
        if(lockBT == 0) return;
        lockBT=2;
        if(!numVS.equals("")) op1 = Double.valueOf(jLabel1.getText().replace(",", "."));
        op = 3;
        numVS = "";
        jLabel1.setText("0");
    }//GEN-LAST:event_bSMActionPerformed

    private void bSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSTActionPerformed
        if(lockBT == 0) return;
        
        if(numVS.equals("")) // - come segno
        {
            if(lockBT!=2) return;
            numVS += "-";
            jLabel1.setText(numVS);
            return;
        }
        
        if(!numVS.equals("-")) // - come operatore
        {
            lockBT=2;
            op1 = Double.valueOf(jLabel1.getText().replace(",", "."));
            op = 2;
            numVS = "";       
            jLabel1.setText("0");
        }
    }//GEN-LAST:event_bSTActionPerformed

    private void bMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMPActionPerformed
        if(lockBT == 0) return;
        lockBT=2;
        if(!numVS.equals("")) op1 = Double.valueOf(jLabel1.getText().replace(",", "."));
        op = 1;
        numVS = "";
        jLabel1.setText("0");
    }//GEN-LAST:event_bMPActionPerformed

    private void bDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDPActionPerformed
        if(numVS.contains(",") || numVS.equals("") || lockBT!=2) return; 
        numVS += ","; 
        jLabel1.setText(numVS); 
    }//GEN-LAST:event_bDPActionPerformed

    private String formatNumber(Double numero) {
        if (numero == 0) return "0";

        int esponente = (int) Math.floor(Math.log10(Math.abs(numero)));

        int espMax = 9;

        if (Math.abs(esponente) > espMax) {
            return String.format("%.2E", numero); // da 10^7 not. scientifica
        } else {
            DecimalFormat df = new DecimalFormat("#.#########"); //altrimenti tronca decimali
            String risultato = df.format(numero);

            if (risultato.length() > MAXLEN) {
                long parteIntera = Math.abs(numero.longValue());
                int lunghezzaIntera = String.valueOf(parteIntera).length(); //ottengo dim della parte intera del numero

                if (numero < 0) lunghezzaIntera++; //conto +1 se negativo (per il segno meno)

                int decimaliPossibili = MAXLEN - lunghezzaIntera - 1; //spazio disponibile per decimali

                if (decimaliPossibili > 0) {
                    DecimalFormat dfTronca = new DecimalFormat("#." + "#".repeat(decimaliPossibili));
                    return dfTronca.format(numero).replace(".", ",");
                } else {
                    if (lunghezzaIntera <= MAXLEN) {
                        return String.valueOf(numero.longValue()); //solo parte intera
                    } else {
                        return String.format("%.2E", numero).replace(".", ","); //se dovesse superare MAXLEN -> not.scientifica
                    }
                }
            }
            return risultato;
        }
    }
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b00;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCE;
    private javax.swing.JButton bDL;
    private javax.swing.JButton bDP;
    private javax.swing.JButton bDV;
    private javax.swing.JButton bEQ;
    private javax.swing.JButton bMP;
    private javax.swing.JButton bSM;
    private javax.swing.JButton bST;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
