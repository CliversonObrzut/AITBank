/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AITBank.Session;

/**
 *
 * @author Cliverson
 */
public class WithdrawValuesScreen extends javax.swing.JFrame
{
    Session ss;
    /**
     * Creates new form GUI
     * @param ss
     */
    public WithdrawValuesScreen(Session ss)
    {
        initComponents();
        this.ss = ss;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        aitLogoLabel = new javax.swing.JLabel();
        middleLeftButton = new javax.swing.JButton();
        upperRightButton = new javax.swing.JButton();
        upperLeftButton = new javax.swing.JButton();
        middleRightButton = new javax.swing.JButton();
        bottonRightButton = new javax.swing.JButton();
        upperLeftLabel = new javax.swing.JLabel();
        middleLeftLabel = new javax.swing.JLabel();
        middleRightLabel = new javax.swing.JLabel();
        upperRightLabel = new javax.swing.JLabel();
        bottomRightLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AIT Bank");
        setName("bankFrame"); // NOI18N

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setPreferredSize(new java.awt.Dimension(761, 504));

        aitLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/AITBankLogo.jpg"))); // NOI18N

        middleLeftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectLeft.png"))); // NOI18N
        middleLeftButton.setBorder(null);
        middleLeftButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectLeft_click.png"))); // NOI18N
        middleLeftButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                middleLeftButtonActionPerformed(evt);
            }
        });

        upperRightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight.png"))); // NOI18N
        upperRightButton.setBorder(null);
        upperRightButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight_click.png"))); // NOI18N
        upperRightButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                upperRightButtonActionPerformed(evt);
            }
        });

        upperLeftButton.setBackground(new java.awt.Color(0, 174, 179));
        upperLeftButton.setForeground(new java.awt.Color(0, 0, 0));
        upperLeftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectLeft.png"))); // NOI18N
        upperLeftButton.setBorder(null);
        upperLeftButton.setBorderPainted(false);
        upperLeftButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectLeft_click.png"))); // NOI18N
        upperLeftButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                upperLeftButtonActionPerformed(evt);
            }
        });

        middleRightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight.png"))); // NOI18N
        middleRightButton.setBorder(null);
        middleRightButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight_click.png"))); // NOI18N
        middleRightButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                middleRightButtonActionPerformed(evt);
            }
        });

        bottonRightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight.png"))); // NOI18N
        bottonRightButton.setBorder(null);
        bottonRightButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight_click.png"))); // NOI18N
        bottonRightButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bottonRightButtonActionPerformed(evt);
            }
        });

        upperLeftLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        upperLeftLabel.setForeground(new java.awt.Color(204, 204, 204));
        upperLeftLabel.setText("$20");

        middleLeftLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        middleLeftLabel.setForeground(new java.awt.Color(204, 204, 204));
        middleLeftLabel.setText("$50");

        middleRightLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        middleRightLabel.setForeground(new java.awt.Color(204, 204, 204));
        middleRightLabel.setText("OTHER");

        upperRightLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        upperRightLabel.setForeground(new java.awt.Color(204, 204, 204));
        upperRightLabel.setText("$100");

        bottomRightLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        bottomRightLabel.setForeground(new java.awt.Color(204, 204, 204));
        bottomRightLabel.setText("BACK");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(upperLeftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upperLeftLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(middleLeftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleLeftLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(upperRightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upperRightButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(bottomRightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottonRightButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(middleRightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleRightButton))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(aitLogoLabel)
                .addGap(299, 299, 299))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(aitLogoLabel)
                .addGap(38, 38, 38)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(upperLeftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(upperRightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(upperLeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(middleRightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(middleLeftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(middleLeftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(middleRightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bottonRightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bottomRightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(upperRightButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        aitLogoLabel.getAccessibleContext().setAccessibleName("AITLogoLabel");
        aitLogoLabel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottonRightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bottonRightButtonActionPerformed
    {//GEN-HEADEREND:event_bottonRightButtonActionPerformed
        ss.function = "";
        FunctionsScreen fs = new FunctionsScreen(ss);
        fs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bottonRightButtonActionPerformed

    private void upperLeftButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_upperLeftButtonActionPerformed
    {//GEN-HEADEREND:event_upperLeftButtonActionPerformed
        ss.value = 20;
        AccountsScreen acs = new AccountsScreen(ss);
        acs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_upperLeftButtonActionPerformed

    private void middleLeftButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_middleLeftButtonActionPerformed
    {//GEN-HEADEREND:event_middleLeftButtonActionPerformed
        ss.value = 50;
        AccountsScreen acs = new AccountsScreen(ss);
        acs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_middleLeftButtonActionPerformed

    private void upperRightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_upperRightButtonActionPerformed
    {//GEN-HEADEREND:event_upperRightButtonActionPerformed
        ss.value = 100;
        AccountsScreen acs = new AccountsScreen(ss);
        acs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_upperRightButtonActionPerformed

    private void middleRightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_middleRightButtonActionPerformed
    {//GEN-HEADEREND:event_middleRightButtonActionPerformed
        KeyboardScreen kbs = new KeyboardScreen(ss);
        kbs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_middleRightButtonActionPerformed
                                                
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        }
//        catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(AccountsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(AccountsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(AccountsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(AccountsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//                new AccountsScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aitLogoLabel;
    private javax.swing.JLabel bottomRightLabel;
    private javax.swing.JButton bottonRightButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton middleLeftButton;
    private javax.swing.JLabel middleLeftLabel;
    private javax.swing.JButton middleRightButton;
    private javax.swing.JLabel middleRightLabel;
    private javax.swing.JButton upperLeftButton;
    private javax.swing.JLabel upperLeftLabel;
    private javax.swing.JButton upperRightButton;
    private javax.swing.JLabel upperRightLabel;
    // End of variables declaration//GEN-END:variables
}
