/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3_visual_programming;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author DeLL
 */
public class NewJFrame extends javax.swing.JFrame {

    int x, y, l, w;
    Graphics g;
    String selected = "Circle";
    int sizeDraw = 4;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        g = pnl.getGraphics();
        comWidth.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        togFreeDraw = new javax.swing.JToggleButton();
        togLine = new javax.swing.JToggleButton();
        toggleRectangle = new javax.swing.JToggleButton();
        togRed = new javax.swing.JToggleButton();
        togCircle = new javax.swing.JToggleButton();
        topGreen = new javax.swing.JToggleButton();
        togBlue = new javax.swing.JToggleButton();
        pnl = new javax.swing.JPanel();
        togYellow = new javax.swing.JToggleButton();
        comWidth = new javax.swing.JComboBox<>();
        togEraser = new javax.swing.JToggleButton();
        topBlack = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        togFreeDraw.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\pen-hand-draw-tool-with-text-lines.png")); // NOI18N
        togFreeDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togFreeDrawActionPerformed(evt);
            }
        });

        togLine.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\line (1).png")); // NOI18N
        togLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togLineActionPerformed(evt);
            }
        });

        toggleRectangle.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\rectangular-geometrical-shape-outline.png")); // NOI18N
        toggleRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleRectangleActionPerformed(evt);
            }
        });

        togRed.setBackground(new java.awt.Color(255, 51, 51));
        togRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togRedActionPerformed(evt);
            }
        });

        togCircle.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\rec.png")); // NOI18N
        togCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togCircleActionPerformed(evt);
            }
        });

        topGreen.setBackground(new java.awt.Color(102, 255, 102));
        topGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topGreenActionPerformed(evt);
            }
        });

        togBlue.setBackground(new java.awt.Color(51, 204, 255));
        togBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togBlueActionPerformed(evt);
            }
        });

        pnl.setBackground(new java.awt.Color(255, 255, 255));
        pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl.setFocusCycleRoot(true);
        pnl.setFocusTraversalPolicyProvider(true);
        pnl.setInheritsPopupMenu(true);
        pnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlMouseDragged(evt);
            }
        });
        pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlMouseReleased(evt);
            }
        });
        pnl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnlKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        togYellow.setBackground(new java.awt.Color(255, 255, 102));
        togYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togYellowActionPerformed(evt);
            }
        });

        comWidth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "6", "8", "10", "12" }));

        togEraser.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\eraser.png")); // NOI18N
        togEraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togEraserActionPerformed(evt);
            }
        });

        topBlack.setBackground(new java.awt.Color(0, 0, 0));
        topBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topBlackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(togCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toggleRectangle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(togLine, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(togFreeDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(comWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(togBlue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(togRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(togEraser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(togYellow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topBlack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(togRed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(topGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(togCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(toggleRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(togLine, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(togFreeDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(togBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(togYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addComponent(topBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(togEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(comWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void togCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togCircleActionPerformed
        // TODO add your handling code here:
        selected = "Circle";

    }//GEN-LAST:event_togCircleActionPerformed

    private void pnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnlMousePressed

    private void pnlMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMouseDragged
        // TODO add your handling code here:

        l = evt.getX() - x;
        w = evt.getY() - y;

        switch (selected) {

            case "Circle":
                g.drawOval(x, y, l, w);
                repaint();

                break;

            case "Rectangle":
                g.drawRect(x, y, l, w);
                repaint();

                break;

            case "Line":
                g.drawLine(x, y, l, w);
                repaint();

                break;

            case "FreeDrawing":
                x = evt.getX();
                y = evt.getY();

                g.fillOval(x, y, Integer.parseInt(comWidth.getSelectedItem().toString()), 3);
                break;

        }


    }//GEN-LAST:event_pnlMouseDragged

    private void toggleRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleRectangleActionPerformed
        // TODO add your handling code here:
        selected = "Rectangle";

    }//GEN-LAST:event_toggleRectangleActionPerformed

    private void togLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togLineActionPerformed
        // TODO add your handling code here:
        selected = "Line";

    }//GEN-LAST:event_togLineActionPerformed

    private void togFreeDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togFreeDrawActionPerformed
        // TODO add your handling code here:

        comWidth.setVisible(true);

        selected = "FreeDrawing";
    }//GEN-LAST:event_togFreeDrawActionPerformed

    private void pnlMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMouseReleased
        // TODO add your handling code here:

        l = evt.getX() - x;
        w = evt.getY() - y;

        switch (selected) {

            case "Circle":
                g.drawOval(x, y, l, w);
                break;

            case "Rectangle":
                g.drawRect(x, y, l, w);
                break;

            case "Line":
                g.drawLine(x, y, l, w);
                break;

            case "FreeDrawing":
                x = evt.getX();
                y = evt.getY();

                g.fillOval(x, y, Integer.parseInt(comWidth.getSelectedItem().toString()), 3);
                break;
        }


    }//GEN-LAST:event_pnlMouseReleased

    private void togRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togRedActionPerformed
        // TODO add your handling code here:

        g.setColor(Color.red);

    }//GEN-LAST:event_togRedActionPerformed

    private void topGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topGreenActionPerformed
        // TODO add your handling code here:
        g.setColor(Color.green);

    }//GEN-LAST:event_topGreenActionPerformed

    private void togBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togBlueActionPerformed
        // TODO add your handling code here:
        g.setColor(Color.blue);

    }//GEN-LAST:event_togBlueActionPerformed

    private void togYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togYellowActionPerformed
        // TODO add your handling code here:
        g.setColor(Color.yellow);

    }//GEN-LAST:event_togYellowActionPerformed

    private void togEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togEraserActionPerformed
        // TODO add your handling code here:
        repaint();
    }//GEN-LAST:event_togEraserActionPerformed

    private void topBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topBlackActionPerformed
        // TODO add your handling code here:
        g.setColor(Color.black);

    }//GEN-LAST:event_topBlackActionPerformed

    private void pnlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlKeyPressed
        // TODO add your handling code here:

        repaint();
    }//GEN-LAST:event_pnlKeyPressed

    private void pnlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlKeyReleased
        // TODO add your handling code here:

        switch (evt.getKeyCode()) {

            case KeyEvent.VK_UP:
                y = y - 10;
                break;

            case KeyEvent.VK_DOWN:
                y = y + 10;
                break;

            case KeyEvent.VK_LEFT:
                x = x - 10;
                break;

            case KeyEvent.VK_RIGHT:
                x = x + 10;
                break;

        }

        switch (selected) {

            case "Circle":
                g.drawOval(x, y, l, w);
                break;

            case "Rectangle":
                g.drawRect(x, y, l, w);
                break;

            case "Line":
                g.drawLine(x, y, l, w);
                break;

        }

    }//GEN-LAST:event_pnlKeyReleased

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comWidth;
    private javax.swing.JPanel pnl;
    private javax.swing.JToggleButton togBlue;
    private javax.swing.JToggleButton togCircle;
    private javax.swing.JToggleButton togEraser;
    private javax.swing.JToggleButton togFreeDraw;
    private javax.swing.JToggleButton togLine;
    private javax.swing.JToggleButton togRed;
    private javax.swing.JToggleButton togYellow;
    private javax.swing.JToggleButton toggleRectangle;
    private javax.swing.JToggleButton topBlack;
    private javax.swing.JToggleButton topGreen;
    // End of variables declaration//GEN-END:variables
}
