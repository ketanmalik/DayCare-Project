/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MainJFrame;

import Business.Configuration.ConfigureDayCare;
import UI.Alerts.AlertsJPanel;
import UI.Classroom.ClassroomJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.Timer;

/**
 *
 * @author ketanmalik
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public static String page;

    public MainJFrame() {
        initComponents();
        showButtons(false);
        initializeSignInPanel();
        new ConfigureDayCare();
    }

    public void showButtons(boolean bool) {
        homeBtn.setVisible(bool);
        classroomBtn.setVisible(bool);
        alertsBtn.setVisible(bool);
        signOutBtn.setVisible(bool);
    }

    public void initializeSignInPanel() {
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signInPanel();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public void signInPanel() {
        SignInPanel signInPanel = new SignInPanel(displayPanel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("signInPanel", signInPanel);
        layout.next(displayPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        signOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        classroomBtn = new javax.swing.JButton();
        alertsBtn = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanel.setBackground(new java.awt.Color(0, 176, 226));

        signOutBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        signOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        signOutBtn.setText("Sign Out");
        signOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signOutBtnMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signOutBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signOutBtnMouseEntered(evt);
            }
        });
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Boston Day Care");

        homeBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBtnMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
        });
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        classroomBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        classroomBtn.setForeground(new java.awt.Color(255, 255, 255));
        classroomBtn.setText("Classrooms");
        classroomBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                classroomBtnMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classroomBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classroomBtnMouseEntered(evt);
            }
        });
        classroomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomBtnActionPerformed(evt);
            }
        });

        alertsBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        alertsBtn.setForeground(new java.awt.Color(255, 255, 255));
        alertsBtn.setText("Alerts");
        alertsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alertsBtnMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alertsBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alertsBtnMouseEntered(evt);
            }
        });
        alertsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(475, 475, 475)
                .addComponent(homeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classroomBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signOutBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(signOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classroomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alertsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        splitPane.setTopComponent(controlPanel);

        displayPanel.setBackground(new java.awt.Color(0, 153, 153));
        displayPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(displayPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        displayPanel.removeAll();
        showButtons(false);
        signInPanel();
    }//GEN-LAST:event_signOutBtnActionPerformed

    private void signOutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutBtnMouseEntered
        signOutBtn.setForeground(Color.black);
    }//GEN-LAST:event_signOutBtnMouseEntered

    private void signOutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_signOutBtnMousePressed

    private void signOutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutBtnMouseExited
        signOutBtn.setForeground(Color.white);
    }//GEN-LAST:event_signOutBtnMouseExited

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnMousePressed

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        if (!(page.equals("home"))) {
            homeBtn.setForeground(Color.white);
        }
    }//GEN-LAST:event_homeBtnMouseExited

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setForeground(Color.black);
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomePage homePage = new HomePage(displayPanel);
        displayPanel.add("homePage", homePage);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void classroomBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_classroomBtnMousePressed

    private void classroomBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomBtnMouseExited
        if (!(page.equals("classroom"))) {
            classroomBtn.setForeground(Color.white);
        }
    }//GEN-LAST:event_classroomBtnMouseExited

    private void classroomBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomBtnMouseEntered
        classroomBtn.setForeground(Color.black);
    }//GEN-LAST:event_classroomBtnMouseEntered

    private void classroomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomBtnActionPerformed
        ClassroomJPanel classroom = new ClassroomJPanel(displayPanel);
        displayPanel.add("classroom", classroom);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_classroomBtnActionPerformed

    private void alertsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertsBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_alertsBtnMousePressed

    private void alertsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertsBtnMouseExited
        if (!(page.equals("alerts"))) {
            alertsBtn.setForeground(Color.white);
        }
    }//GEN-LAST:event_alertsBtnMouseExited

    private void alertsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertsBtnMouseEntered
        alertsBtn.setForeground(Color.black);
    }//GEN-LAST:event_alertsBtnMouseEntered

    private void alertsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertsBtnActionPerformed
        AlertsJPanel alerts = new AlertsJPanel(displayPanel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("alerts", alerts);
        layout.next(displayPanel);
    }//GEN-LAST:event_alertsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton alertsBtn;
    public static javax.swing.JButton classroomBtn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel displayPanel;
    public static javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JButton signOutBtn;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
