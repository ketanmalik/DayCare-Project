/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Alerts;

import Business.Directories.PersonDirectory;
import Business.Entities.Student;
import Business.Entities.Teacher;
import Business.Util.DateUtil;
import UI.MainJFrame.MainJFrame;
import static UI.MainJFrame.MainJFrame.alertsBtn;
import static UI.MainJFrame.MainJFrame.classroomBtn;
import static UI.MainJFrame.MainJFrame.homeBtn;
import static UI.MainJFrame.MainJFrame.immunizationBtn;
import static UI.MainJFrame.MainJFrame.signOutBtn;
import UI.ManageUsers.ManageTeachers;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class AlertsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AlertsJPanel
     */
    private JPanel displayPanel;
    private PersonDirectory personDirectory;

    public AlertsJPanel(JPanel displayPanel) {
        initComponents();
        MainJFrame.page = "alerts";
        this.displayPanel = displayPanel;
        this.personDirectory = PersonDirectory.getObject();
        populateImmunizationTable();
        populateAdministrativeTable();
        modifyButtons();
        showButtons(true);
    }

    private void modifyButtons() {
        homeBtn.setOpaque(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setBorderPainted(false);
        homeBtn.setForeground(Color.white);

        classroomBtn.setOpaque(false);
        classroomBtn.setContentAreaFilled(false);
        classroomBtn.setBorderPainted(false);
        classroomBtn.setForeground(Color.white);

        alertsBtn.setOpaque(false);
        alertsBtn.setContentAreaFilled(false);
        alertsBtn.setBorderPainted(false);
        alertsBtn.setForeground(Color.black);

        immunizationBtn.setOpaque(false);
        immunizationBtn.setContentAreaFilled(false);
        immunizationBtn.setBorderPainted(false);
        immunizationBtn.setForeground(Color.white);

        signOutBtn.setOpaque(false);
        signOutBtn.setContentAreaFilled(false);
        signOutBtn.setBorderPainted(false);
    }

    public void showButtons(boolean bool) {
        homeBtn.setVisible(bool);
        classroomBtn.setVisible(bool);
        alertsBtn.setVisible(bool);
        immunizationBtn.setVisible(bool);
        signOutBtn.setVisible(bool);
    }

    public void populateImmunizationTable() {
        DefaultTableModel dtm = (DefaultTableModel) immunizationTbl.getModel();
        dtm.setRowCount(0);
        List<Student> studentList = personDirectory.getStudentDirectory();
        Map<String, List<Integer>> vaccinationHistory;
        for (Student s : studentList) {
            vaccinationHistory = new HashMap<>();
            vaccinationHistory = s.getVaccinationHistory();
            Set<Map.Entry<String, List<Integer>>> entrySet = vaccinationHistory.entrySet();
            Iterator<Map.Entry<String, List<Integer>>> itr = entrySet.iterator();
            while (itr.hasNext()) {
                Map.Entry<String, List<Integer>> e = (Map.Entry<String, List<Integer>>) itr.next();
                for (Integer i : e.getValue()) {
                    if (i >= s.getAge()) {
                        Object row[] = new Object[4];
                        row[0] = s.getId();
                        row[1] = s;
                        row[2] = e.getKey();
                        row[3] = "Upcoming";

                        dtm.addRow(row);
                        break;
                    }
                }
            }

        }
    }

    public void populateAdministrativeTable() {
        List<Student> studentList = personDirectory.getStudentDirectory();
        List<Teacher> teacherList = personDirectory.getTeacherDirectory();
        DefaultTableModel dtm = (DefaultTableModel) administrativeAlertsTbl.getModel();
        dtm.setRowCount(0);

        for (Teacher t : teacherList) {
            boolean anniversary = DateUtil.checkAnniversary(t.getDateOfJoining());
            Object[] row = new Object[4];
            row[0] = t.getId();
            row[1] = t;
            row[2] = "Employee Review";
            long diff = DateUtil.getDaysDifference(t.getDateOfJoining());
            if (diff < 364) {
                row[3] = "Not Applicable";

            } else {
                if (anniversary) {
                    row[3] = "Due Today";
                } else {
                    boolean isOverdue = DateUtil.isAnniversaryOverdue(t.getDateOfJoining());
                    if (isOverdue) {
                        row[3] = "Overdue";
                    } else {
                        row[3] = "Upcoming";
                    }

                }
            }
            dtm.addRow(row);
        }
        for (Student s : studentList) {
            boolean anniversary = DateUtil.checkAnniversary(s.getDate());
            Object[] row = new Object[4];
            row[0] = s.getId();
            row[1] = s;
            row[2] = "Student Registration";
            long diff = DateUtil.getDaysDifference(s.getDate());
            if (diff < 364) {
                row[3] = "Not Applicable";

            } else {
                if (anniversary) {
                    row[3] = "Due Today";
                } else {
                    boolean isOverdue = DateUtil.isAnniversaryOverdue(s.getDate());
                    if (isOverdue) {
                        row[3] = "Overdue";
                    } else {
                        row[3] = "Upcoming";
                    }

                }
            }
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        administrativeAlertsTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        immunizationTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminAlertsBtn = new javax.swing.JButton();
        immunizationAlertsBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        administrativeAlertsTbl.setAutoCreateRowSorter(true);
        administrativeAlertsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Alert Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(administrativeAlertsTbl);
        if (administrativeAlertsTbl.getColumnModel().getColumnCount() > 0) {
            administrativeAlertsTbl.getColumnModel().getColumn(0).setResizable(false);
            administrativeAlertsTbl.getColumnModel().getColumn(1).setResizable(false);
            administrativeAlertsTbl.getColumnModel().getColumn(2).setResizable(false);
            administrativeAlertsTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        immunizationTbl.setAutoCreateRowSorter(true);
        immunizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student Name", "Immunization Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(immunizationTbl);
        if (immunizationTbl.getColumnModel().getColumnCount() > 0) {
            immunizationTbl.getColumnModel().getColumn(0).setResizable(false);
            immunizationTbl.getColumnModel().getColumn(1).setResizable(false);
            immunizationTbl.getColumnModel().getColumn(2).setResizable(false);
            immunizationTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrative Alerts:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Immunization Alerts:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("View Alerts");

        adminAlertsBtn.setText("Manage Administrative Alerts");

        immunizationAlertsBtn.setText("Manage Immunization Alerts");
        immunizationAlertsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationAlertsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jLabel3)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(adminAlertsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(immunizationAlertsBtn)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAlertsBtn)
                    .addComponent(immunizationAlertsBtn))
                .addContainerGap(348, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void immunizationAlertsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationAlertsBtnActionPerformed
        ManageImmunizationPanel mip = new ManageImmunizationPanel(displayPanel);
        displayPanel.add("mip", mip);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_immunizationAlertsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminAlertsBtn;
    private javax.swing.JTable administrativeAlertsTbl;
    private javax.swing.JButton immunizationAlertsBtn;
    private javax.swing.JTable immunizationTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
