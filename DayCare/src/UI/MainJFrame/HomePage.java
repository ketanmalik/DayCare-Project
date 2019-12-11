/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MainJFrame;

import Business.Directories.PersonDirectory;
import Business.Directories.TeacherStudentDirectory;
import Business.Entities.Student;
import Business.Entities.Teacher;
import Business.Util.DbManagement;
import UI.ManageUsers.ManageStudents;
import UI.ManageUsers.ManageTeachers;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class HomePage extends javax.swing.JPanel {

    /**
     * Creates new form HomePage
     */
    private JPanel displayPanel;
    private PersonDirectory personDirectory;

    public HomePage(JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
        this.personDirectory = PersonDirectory.getObject();
        populateStudentTable();
        populateTeacherTable();
        modifyButtons();
        showButtons(true);
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
        tchrTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        stuTbl = new javax.swing.JTable();
        stuAdd = new javax.swing.JButton();
        stuView = new javax.swing.JButton();
        stuUpdate = new javax.swing.JButton();
        stuDelete = new javax.swing.JButton();
        tchrAdd = new javax.swing.JButton();
        tchrView = new javax.swing.JButton();
        tchrUpdate = new javax.swing.JButton();
        tchrDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tchrTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tchrTbl);
        if (tchrTbl.getColumnModel().getColumnCount() > 0) {
            tchrTbl.getColumnModel().getColumn(0).setResizable(false);
            tchrTbl.getColumnModel().getColumn(1).setResizable(false);
            tchrTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        stuTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age (months)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(stuTbl);
        if (stuTbl.getColumnModel().getColumnCount() > 0) {
            stuTbl.getColumnModel().getColumn(0).setResizable(false);
            stuTbl.getColumnModel().getColumn(1).setResizable(false);
            stuTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        stuAdd.setText("Add");
        stuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuAddActionPerformed(evt);
            }
        });

        stuView.setText("View");
        stuView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuViewActionPerformed(evt);
            }
        });

        stuUpdate.setText("Update");
        stuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuUpdateActionPerformed(evt);
            }
        });

        stuDelete.setText("Delete");
        stuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuDeleteActionPerformed(evt);
            }
        });

        tchrAdd.setText("Add");
        tchrAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tchrAddActionPerformed(evt);
            }
        });

        tchrView.setText("View");
        tchrView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tchrViewActionPerformed(evt);
            }
        });

        tchrUpdate.setText("Update");
        tchrUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tchrUpdateActionPerformed(evt);
            }
        });

        tchrDelete.setText("Delete");
        tchrDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tchrDeleteActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Faculty List:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Children List:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tchrAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tchrView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tchrUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tchrDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(stuAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stuView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stuUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(stuAdd)
                        .addGap(18, 18, 18)
                        .addComponent(stuView)
                        .addGap(18, 18, 18)
                        .addComponent(stuUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(stuDelete)
                        .addGap(180, 180, 180)
                        .addComponent(tchrAdd)
                        .addGap(18, 18, 18)
                        .addComponent(tchrView)
                        .addGap(18, 18, 18)
                        .addComponent(tchrUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(tchrDelete)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuAddActionPerformed
        ManageStudents addStudent = new ManageStudents(displayPanel, "add", null);
        displayPanel.add("addStudent", addStudent);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_stuAddActionPerformed

    private void stuViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuViewActionPerformed
        int selectedRow = stuTbl.getSelectedRow();
        if (selectedRow >= 0) {
            Student student = (Student) stuTbl.getValueAt(selectedRow, 1);
            ManageStudents viewStudent = new ManageStudents(displayPanel, "view", student);
            displayPanel.add("viewStudent", viewStudent);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to view", "No selection zfound", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_stuViewActionPerformed

    private void stuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuUpdateActionPerformed
        int selectedRow = stuTbl.getSelectedRow();
        if (selectedRow >= 0) {
            Student student = (Student) stuTbl.getValueAt(selectedRow, 1);
            ManageStudents updateStudent = new ManageStudents(displayPanel, "update", student);
            displayPanel.add("updateStudent", updateStudent);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to update", "No selection found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_stuUpdateActionPerformed

    private void stuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuDeleteActionPerformed
        int selectedRow = stuTbl.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (Integer) stuTbl.getValueAt(selectedRow, 0);
            DbManagement.deleteFromStudentDB(String.valueOf(id));
            if (personDirectory.getStudentDirectory().contains(stuTbl.getValueAt(selectedRow, 1))) {
                personDirectory.getStudentDirectory().remove(stuTbl.getValueAt(selectedRow, 1));
            }
            populateStudentTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete", "No selection found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_stuDeleteActionPerformed

    private void tchrAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tchrAddActionPerformed
        ManageTeachers addTeacher = new ManageTeachers(displayPanel, "add", null);
        displayPanel.add("addTeacher", addTeacher);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_tchrAddActionPerformed

    private void tchrViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tchrViewActionPerformed
        int selectedRow = tchrTbl.getSelectedRow();
        if (selectedRow >= 0) {
            Teacher teacher = (Teacher) tchrTbl.getValueAt(selectedRow, 1);
            ManageTeachers viewTeacher = new ManageTeachers(displayPanel, "view", teacher);
            displayPanel.add("viewTeacher", viewTeacher);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to view", "No selection found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tchrViewActionPerformed

    private void tchrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tchrUpdateActionPerformed
        int selectedRow = tchrTbl.getSelectedRow();
        if (selectedRow >= 0) {
            Teacher teacher = (Teacher) tchrTbl.getValueAt(selectedRow, 1);
            ManageTeachers updateTeacher = new ManageTeachers(displayPanel, "update", teacher);
            displayPanel.add("updateTeacher", updateTeacher);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to update", "No selection found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tchrUpdateActionPerformed

    private void tchrDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tchrDeleteActionPerformed
        int selectedRow = tchrTbl.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (Integer) tchrTbl.getValueAt(selectedRow, 0);
            DbManagement.deleteFromTeacherDB(String.valueOf(id));
            if (personDirectory.getTeacherDirectory().contains(tchrTbl.getValueAt(selectedRow, 1))) {
                personDirectory.getTeacherDirectory().remove(tchrTbl.getValueAt(selectedRow, 1));
            }
            populateTeacherTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete", "No selection found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tchrDeleteActionPerformed

    public void populateStudentTable() {
        DefaultTableModel dtm = (DefaultTableModel) stuTbl.getModel();

        dtm.setRowCount(0);
        for (Student s : personDirectory.getStudentDirectory()) {
            Object[] row = new Object[3];
            row[0] = s.getId();
            row[1] = s;
            row[2] = s.getAge();

            dtm.addRow(row);
        }
    }

    public void populateTeacherTable() {
        DefaultTableModel dtm = (DefaultTableModel) tchrTbl.getModel();

        dtm.setRowCount(0);
        for (Teacher t : personDirectory.getTeacherDirectory()) {
            Object[] row = new Object[3];
            row[0] = t.getId();
            row[1] = t;
            row[2] = t.getAge();

            dtm.addRow(row);
        }
    }

    private void modifyButtons() {
//        MainJFrame.manageNetworkBtn.setText("Manage Network");
//        MainJFrame.manageNetworkBtn.setOpaque(false);
//        MainJFrame.manageNetworkBtn.setContentAreaFilled(false);
//        MainJFrame.manageNetworkBtn.setBorderPainted(false);
//        MainJFrame.manageNetworkBtn.setForeground(Color.black);
//
//        MainJFrame.manageEnterpriseBtn.setText("Manage Enterprise");
//        MainJFrame.manageEnterpriseBtn.setOpaque(false);
//        MainJFrame.manageEnterpriseBtn.setContentAreaFilled(false);
//        MainJFrame.manageEnterpriseBtn.setBorderPainted(false);
//        MainJFrame.manageEnterpriseBtn.setForeground(Color.white);
//
//        MainJFrame.manageAdminBtn.setText("Manage Enterprise Admin");
//        MainJFrame.manageAdminBtn.setOpaque(false);
//        MainJFrame.manageAdminBtn.setContentAreaFilled(false);
//        MainJFrame.manageAdminBtn.setBorderPainted(false);
//        MainJFrame.manageAdminBtn.setForeground(Color.white);

        MainJFrame.signOutBtn.setOpaque(false);
        MainJFrame.signOutBtn.setContentAreaFilled(false);
        MainJFrame.signOutBtn.setBorderPainted(false);
    }

    public void showButtons(boolean bool) {
        MainJFrame.signOutBtn.setVisible(bool);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton stuAdd;
    private javax.swing.JButton stuDelete;
    private javax.swing.JTable stuTbl;
    private javax.swing.JButton stuUpdate;
    private javax.swing.JButton stuView;
    private javax.swing.JButton tchrAdd;
    private javax.swing.JButton tchrDelete;
    private javax.swing.JTable tchrTbl;
    private javax.swing.JButton tchrUpdate;
    private javax.swing.JButton tchrView;
    // End of variables declaration//GEN-END:variables
}
