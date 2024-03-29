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
import Business.Util.SMS;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ManageAdminAlertsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAdminAlertsJPanel
     */
    private JPanel displayPanel;
    private PersonDirectory personDirectory;

    public ManageAdminAlertsJPanel(JPanel displayPanel) {
        personDirectory = PersonDirectory.getObject();
        initComponents();
        populateTable("er");
        this.displayPanel = displayPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        alertsLabel = new javax.swing.JLabel();
        alertsDropdown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        filterTbl = new javax.swing.JTable();
        pastDueCheckBox = new javax.swing.JCheckBox();
        tableLabel = new javax.swing.JLabel();
        reminderBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Administrative Alerts");

        backBtn2.setText("Back");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        alertsLabel.setForeground(new java.awt.Color(255, 255, 255));
        alertsLabel.setText("Alert Type:");

        alertsDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Review", "Student Registration" }));
        alertsDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertsDropdownActionPerformed(evt);
            }
        });

        filterTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(filterTbl);
        if (filterTbl.getColumnModel().getColumnCount() > 0) {
            filterTbl.getColumnModel().getColumn(0).setResizable(false);
            filterTbl.getColumnModel().getColumn(1).setResizable(false);
            filterTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        pastDueCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        pastDueCheckBox.setText("Past Due");
        pastDueCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastDueCheckBoxActionPerformed(evt);
            }
        });

        tableLabel.setText("jLabel1");

        reminderBtn.setText("Send Reminder");
        reminderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn2)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alertsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(alertsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(pastDueCheckBox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(reminderBtn))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(tableLabel)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn2)
                    .addComponent(jLabel3))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alertsLabel)
                    .addComponent(alertsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pastDueCheckBox))
                .addGap(50, 50, 50)
                .addComponent(tableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(reminderBtn)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable(String mode) {
        DefaultTableModel dtm = (DefaultTableModel) filterTbl.getModel();
        dtm.setRowCount(0);

        if (mode.equals("er")) {
            List<Teacher> teacherList = personDirectory.getTeacherDirectory();
            for (Teacher t : teacherList) {
                boolean anniversary = DateUtil.checkAnniversary(t.getDateOfJoining());
                long diff = DateUtil.getDaysDifference(t.getDateOfJoining());
                boolean isOverdue = DateUtil.isAnniversaryOverdue(t.getDateOfJoining());
                if (pastDueCheckBox.isSelected()) {
                    tableLabel.setText("Past Due Alerts:");
                    tableLabel.setForeground(Color.red);
//                    alertsDropdown.setEnabled(false);
                    if (diff >= 364) {
                        if (isOverdue) {
                            Object[] row = new Object[3];
                            row[0] = t.getId();
                            row[1] = t;
                            row[2] = DateUtil.getDateToString(DateUtil.plusYears(t.getDateOfJoining()));

                            dtm.addRow(row);
                        }
                    }

                } else {
                    tableLabel.setText("Upcoming Alerts:");
                    tableLabel.setForeground(Color.white);
//                    alertsDropdown.setEnabled(true);
                    if (diff >= 364) {
                        if (anniversary) {
                            Object[] row = new Object[3];
                            row[0] = t.getId();
                            row[1] = t;
                            row[2] = DateUtil.getDateToString(new Date());
                            dtm.addRow(row);
                        } else {
                            if (!isOverdue) {
                                Object[] row = new Object[3];
                                row[0] = t.getId();
                                row[1] = t;
                                int dueIn = DateUtil.getDueDate(t.getDateOfJoining(), 0);
                                if (dueIn == -999) {
                                    row[2] = DateUtil.getDateToString(DateUtil.plusMonths(t.getDateOfJoining()));
                                } else {
                                    row[2] = DateUtil.getDateToString(DateUtil.plusDays(new Date(), dueIn));
                                }
                                dtm.addRow(row);
                            }
                        }
                    }
                }
            }
        } else {
            List<Student> studentList = personDirectory.getStudentDirectory();
            for (Student t : studentList) {
                boolean anniversary = DateUtil.checkAnniversary(t.getDate());
                long diff = DateUtil.getDaysDifference(t.getDate());
                boolean isOverdue = DateUtil.isAnniversaryOverdue(t.getDate());
                if (pastDueCheckBox.isSelected()) {
                    tableLabel.setText("Past Due Alerts:");
                    tableLabel.setForeground(Color.red);
//                    alertsDropdown.setEnabled(false);
                    if (diff >= 364) {
                        if (isOverdue) {
                            Object[] row = new Object[3];
                            row[0] = t.getId();
                            row[1] = t;
                            row[2] = DateUtil.getDateToString(DateUtil.plusYears(t.getDate()));

                            dtm.addRow(row);
                        }
                    }
                } else {
                    tableLabel.setText("Upcoming Alerts:");
                    tableLabel.setForeground(Color.white);
//                    alertsDropdown.setEnabled(true);
                    if (diff >= 364) {
                        if (anniversary) {
                            Object[] row = new Object[3];
                            row[0] = t.getId();
                            row[1] = t;
                            row[2] = DateUtil.getDateToString(new Date());
                            dtm.addRow(row);
                        } else {
                            if (!isOverdue) {
                                Object[] row = new Object[3];
                                row[0] = t.getId();
                                row[1] = t;
                                int dueIn = DateUtil.getDueDate(t.getDate(), 0);
                                if (dueIn == -999) {
                                    row[2] = DateUtil.getDateToString(DateUtil.plusMonths(t.getDate()));
                                } else {
                                    row[2] = DateUtil.getDateToString(DateUtil.plusDays(new Date(), dueIn));
                                }
                                dtm.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }
    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AlertsJPanel ap = (AlertsJPanel) component;
        ap.populateAdministrativeTable();
        ap.populateImmunizationTable();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void pastDueCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastDueCheckBoxActionPerformed
        applyFilter();
    }//GEN-LAST:event_pastDueCheckBoxActionPerformed

    private void alertsDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertsDropdownActionPerformed
        applyFilter();
    }//GEN-LAST:event_alertsDropdownActionPerformed

    private void reminderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderBtnActionPerformed
        int selectedRow = filterTbl.getSelectedRow();
        if (selectedRow >= 0) {
            String type = (String) alertsDropdown.getSelectedItem();
            int id = (Integer) filterTbl.getValueAt(selectedRow, 0);

            String date = (String) filterTbl.getValueAt(selectedRow, 2);
            String msg = "";
            if (type.equalsIgnoreCase("employee review")) {
                Teacher t = (Teacher) filterTbl.getValueAt(selectedRow, 1);
                String name = t.getName();
                if (pastDueCheckBox.isSelected()) {
                    msg = "Employee Review for employee " + name + " with ID - " + id + " was due on " + date;
                } else {
                    msg = "Employee Review for employee " + name + " with ID - " + id + " is due on " + date;
                }
            } else {
                Student t = (Student) filterTbl.getValueAt(selectedRow, 1);
                String name = t.getName();
                if (pastDueCheckBox.isSelected()) {
                    msg = "Student Registration for " + name + " with ID - " + id + " was due on " + date;
                } else {
                    msg = "Student Registration for " + name + " with ID - " + id + " is due on " + date;
                }
            }
            SMS.sendSMS(msg);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to send reminder", "No Selection Found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_reminderBtnActionPerformed

    private void applyFilter() {
        String selection = (String) alertsDropdown.getSelectedItem();
        String filter = "";
        if (selection != null) {
            if (selection.equalsIgnoreCase("employee review")) {
                filter = "er";
            } else {
                filter = "sr";
            }
            populateTable(filter);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alertsDropdown;
    private javax.swing.JLabel alertsLabel;
    private javax.swing.JButton backBtn2;
    private javax.swing.JTable filterTbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox pastDueCheckBox;
    private javax.swing.JButton reminderBtn;
    private javax.swing.JLabel tableLabel;
    // End of variables declaration//GEN-END:variables
}
