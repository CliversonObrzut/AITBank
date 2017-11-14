/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AITBank.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliverson
 */
public class KeyboardScreen extends javax.swing.JFrame
{

    Session ss;

    /**
     * Creates new form GUI
     *
     * @param ss
     */
    public KeyboardScreen(Session ss)
    {
        initComponents();
        this.ss = ss;
        inputTextField.setText("$0,00");
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
        bottomRightButton = new javax.swing.JButton();
        bottomRightLabel = new javax.swing.JLabel();
        keyboardPanel = new javax.swing.JPanel();
        button4 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonEnter = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        inputTextField = new javax.swing.JTextField();
        messageTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AIT Bank");
        setIconImage(getIconImage());
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

        bottomRightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight.png"))); // NOI18N
        bottomRightButton.setBorder(null);
        bottomRightButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/button_selectRight_click.png"))); // NOI18N
        bottomRightButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bottomRightButtonActionPerformed(evt);
            }
        });

        bottomRightLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        bottomRightLabel.setForeground(new java.awt.Color(204, 204, 204));
        bottomRightLabel.setText("BACK");

        keyboardPanel.setBackground(new java.awt.Color(0, 0, 0));

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button4.png"))); // NOI18N
        button4.setBorder(null);
        button4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button4_click.png"))); // NOI18N
        button4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button4_over.png"))); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button4ActionPerformed(evt);
            }
        });

        button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button7.png"))); // NOI18N
        button7.setBorder(null);
        button7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button7_click.png"))); // NOI18N
        button7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button7_over.png"))); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button7ActionPerformed(evt);
            }
        });

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button2.png"))); // NOI18N
        button2.setBorder(null);
        button2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button2_click.png"))); // NOI18N
        button2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button2_over.png"))); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button2ActionPerformed(evt);
            }
        });

        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button5.png"))); // NOI18N
        button5.setBorder(null);
        button5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button5_click.png"))); // NOI18N
        button5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button5_over.png"))); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button5ActionPerformed(evt);
            }
        });

        button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button8.png"))); // NOI18N
        button8.setBorder(null);
        button8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button8_click.png"))); // NOI18N
        button8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button8_over.png"))); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button8ActionPerformed(evt);
            }
        });

        button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button0.png"))); // NOI18N
        button0.setBorder(null);
        button0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button0_click.png"))); // NOI18N
        button0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button0_over.png"))); // NOI18N
        button0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button0ActionPerformed(evt);
            }
        });

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button3.png"))); // NOI18N
        button3.setBorder(null);
        button3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button3_click.png"))); // NOI18N
        button3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button3_over.png"))); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button3ActionPerformed(evt);
            }
        });

        button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button6.png"))); // NOI18N
        button6.setBorder(null);
        button6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button6_click.png"))); // NOI18N
        button6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button6_over.png"))); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button6ActionPerformed(evt);
            }
        });

        button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button9.png"))); // NOI18N
        button9.setBorder(null);
        button9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button9_click.png"))); // NOI18N
        button9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button9_over.png"))); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button9ActionPerformed(evt);
            }
        });

        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/buttonC.png"))); // NOI18N
        buttonClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        buttonClear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/buttonC_click.png"))); // NOI18N
        buttonClear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/buttonC_over.png"))); // NOI18N
        buttonClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonClearActionPerformed(evt);
            }
        });

        buttonEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/buttonE.png"))); // NOI18N
        buttonEnter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
        buttonEnter.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/buttonE_click.png"))); // NOI18N
        buttonEnter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/buttonE_over.png"))); // NOI18N
        buttonEnter.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonEnterActionPerformed(evt);
            }
        });

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button1.png"))); // NOI18N
        button1.setAlignmentY(0.0F);
        button1.setBorder(null);
        button1.setBorderPainted(false);
        button1.setIconTextGap(0);
        button1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        button1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button1_click.png"))); // NOI18N
        button1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/AITBank/Images/Keyboard/button1_over.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout keyboardPanelLayout = new javax.swing.GroupLayout(keyboardPanel);
        keyboardPanel.setLayout(keyboardPanelLayout);
        keyboardPanelLayout.setHorizontalGroup(
            keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(buttonClear)
                    .addComponent(button1))
                .addGap(12, 12, 12)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addComponent(button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button3))
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button0)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9)))
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addComponent(button5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        keyboardPanelLayout.setVerticalGroup(
            keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1)
                    .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addComponent(button9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEnter))
                    .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button8)
                            .addGroup(keyboardPanelLayout.createSequentialGroup()
                                .addComponent(button7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonClear)))
                        .addComponent(button0)))
                .addContainerGap())
        );

        inputTextField.setBackground(new java.awt.Color(0, 0, 0));
        inputTextField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        inputTextField.setForeground(new java.awt.Color(204, 204, 204));
        inputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTextField.setBorder(null);

        messageTextField.setBackground(new java.awt.Color(0, 0, 0));
        messageTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        messageTextField.setForeground(new java.awt.Color(255, 255, 51));
        messageTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        messageTextField.setBorder(null);
        messageTextField.setDisabledTextColor(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(middleLeftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keyboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(upperLeftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(bottomRightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomRightButton))
                    .addComponent(upperRightButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(middleRightButton, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(aitLogoLabel)
                .addGap(299, 299, 299))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(aitLogoLabel)
                .addGap(38, 38, 38)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(upperRightButton)
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upperLeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(middleRightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(middleLeftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(118, 118, 118)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bottomRightButton)
                                    .addComponent(bottomRightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(keyboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))))
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

    private void bottomRightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bottomRightButtonActionPerformed
    {//GEN-HEADEREND:event_bottomRightButtonActionPerformed
        ss.function = "";
        FunctionsScreen fns = new FunctionsScreen(ss);
        fns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bottomRightButtonActionPerformed

    private void upperLeftButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_upperLeftButtonActionPerformed
    {//GEN-HEADEREND:event_upperLeftButtonActionPerformed

    }//GEN-LAST:event_upperLeftButtonActionPerformed

    private void middleLeftButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_middleLeftButtonActionPerformed
    {//GEN-HEADEREND:event_middleLeftButtonActionPerformed

    }//GEN-LAST:event_middleLeftButtonActionPerformed

    private void upperRightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_upperRightButtonActionPerformed
    {//GEN-HEADEREND:event_upperRightButtonActionPerformed

    }//GEN-LAST:event_upperRightButtonActionPerformed

    private void middleRightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_middleRightButtonActionPerformed
    {//GEN-HEADEREND:event_middleRightButtonActionPerformed

    }//GEN-LAST:event_middleRightButtonActionPerformed

    // Keyboard actions
    private void AddValueToScreen(String s)
    {
        if (ss.value != 0)
        {
            int value = (int) ss.value;
            String valueString = Integer.toString(value);
            valueString = valueString.concat(s);
            ss.value = Integer.parseInt(valueString);
            inputTextField.setText(ATM.decimalNumber.format(ss.value));

        }
        else
        {
            if (s != "0")
            {
                ss.value = Integer.parseInt(s);
                inputTextField.setText(ATM.decimalNumber.format(ss.value));

            }
        }
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button1ActionPerformed
    {//GEN-HEADEREND:event_button1ActionPerformed
        String s = "1";
        AddValueToScreen(s);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button2ActionPerformed
    {//GEN-HEADEREND:event_button2ActionPerformed
        String s = "2";
        AddValueToScreen(s);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button3ActionPerformed
    {//GEN-HEADEREND:event_button3ActionPerformed
        String s = "3";
        AddValueToScreen(s);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button4ActionPerformed
    {//GEN-HEADEREND:event_button4ActionPerformed
        String s = "4";
        AddValueToScreen(s);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button5ActionPerformed
    {//GEN-HEADEREND:event_button5ActionPerformed
        String s = "5";
        AddValueToScreen(s);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button6ActionPerformed
    {//GEN-HEADEREND:event_button6ActionPerformed
        String s = "6";
        AddValueToScreen(s);
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button7ActionPerformed
    {//GEN-HEADEREND:event_button7ActionPerformed
        String s = "7";
        AddValueToScreen(s);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button8ActionPerformed
    {//GEN-HEADEREND:event_button8ActionPerformed
        String s = "8";
        AddValueToScreen(s);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button9ActionPerformed
    {//GEN-HEADEREND:event_button9ActionPerformed
        String s = "9";
        AddValueToScreen(s);
    }//GEN-LAST:event_button9ActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonClearActionPerformed
    {//GEN-HEADEREND:event_buttonClearActionPerformed
        inputTextField.setText("$0,00");
        ss.value = 0;
    }//GEN-LAST:event_buttonClearActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button0ActionPerformed
    {//GEN-HEADEREND:event_button0ActionPerformed
        String s = "0";
        AddValueToScreen(s);
    }//GEN-LAST:event_button0ActionPerformed

    private void buttonEnterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonEnterActionPerformed
    {//GEN-HEADEREND:event_buttonEnterActionPerformed
        if (ss.value == 0)
        {
            try
            {
                throw new ZeroValueException("The value can not be zero!");
            }
            catch (ZeroValueException ex)
            {
                Logger.getLogger(KeyboardScreen.class.getName()).log(Level.SEVERE, null, ex);
                messageTextField.setText("The value can not be zero!");
            }
        }

        else
        {
            AccountsScreen acs = new AccountsScreen(ss);
            acs.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_buttonEnterActionPerformed

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
    private javax.swing.JButton bottomRightButton;
    private javax.swing.JLabel bottomRightLabel;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonEnter;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JPanel keyboardPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JButton middleLeftButton;
    private javax.swing.JButton middleRightButton;
    private javax.swing.JButton upperLeftButton;
    private javax.swing.JButton upperRightButton;
    // End of variables declaration//GEN-END:variables
}
