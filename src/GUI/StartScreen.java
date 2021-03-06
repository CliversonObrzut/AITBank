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
public class StartScreen extends javax.swing.JFrame
{
    Session ss;
    /**
     * Creates new form GUI
     */
    public StartScreen()
    {
        initComponents();
        ss = new Session();
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
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AIT Bank");

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setPreferredSize(new java.awt.Dimension(761, 504));

        aitLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/AITBankLogo.jpg"))); // NOI18N

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_start.png"))); // NOI18N
        startButton.setBorder(null);
        startButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_start_click.png"))); // NOI18N
        startButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_start_over.png"))); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(aitLogoLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(startButton)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(aitLogoLabel)
                .addGap(115, 115, 115)
                .addComponent(startButton)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        aitLogoLabel.getAccessibleContext().setAccessibleName("AITLogoLabel");
        aitLogoLabel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startButtonActionPerformed
    {//GEN-HEADEREND:event_startButtonActionPerformed
        FunctionsScreen fs = new FunctionsScreen(ss);
        fs.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aitLogoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
