/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageUsers;

import Business.Configuration.ConfigureDayCare;
import Business.Directories.ClassroomDirectory;
import Business.Directories.PersonDirectory;
import Business.Directories.TeacherStudentDirectory;
import Business.Entities.AbstractPerson;
import Business.Entities.Teacher;
import Business.Factory.TeacherFactory;
import Business.Util.DateUtil;
import Business.Util.DbManagement;
import UI.MainJFrame.HomePage;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class ManageTeachers extends javax.swing.JPanel {

    /**
     * Creates new form ManageTeachers
     */
    private JPanel displayPanel;
    private String mode = "";
    private PersonDirectory personDirectory;
    private Teacher teacher;

    public ManageTeachers(JPanel displayPanel, String mode, Teacher teacher) {
        initComponents();
        this.displayPanel = displayPanel;
        this.personDirectory = PersonDirectory.getObject();
        this.mode = mode;
        this.teacher = teacher;
        if (mode.equals("add")) {
            idTxtField.setText(String.valueOf(personDirectory.getTeacherDirectory().size() + 1));
            dateOfJoiningTxtField.setText(DateUtil.getDateToString(new Date()));
        } else if (mode.equals("view")) {
            pageTitle.setText("View Teacher");
            enableFields(false);
            idTxtField.setText(String.valueOf(teacher.getId()));
            updateFields();
        } else if (mode.equals("update")) {
            pageTitle.setText("Update Teacher");
            enableFields(true);
            idTxtField.setText(String.valueOf(teacher.getId()));
            updateFields();
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

        backBtn2 = new javax.swing.JButton();
        pageTitle = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        wageTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        categoryDropdown = new javax.swing.JComboBox<>();
        confirmBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateOfJoiningTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        backBtn2.setText("Back");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        pageTitle.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        pageTitle.setForeground(new java.awt.Color(255, 255, 255));
        pageTitle.setText("Add Teacher");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID:");

        idTxtField.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Wage:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(USD)");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Category:");

        categoryDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6-12", "13-24", "25-35", "36-47", "48-59", "60 above" }));

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Joining:");

        dateOfJoiningTxtField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backBtn2)
                        .addGap(190, 190, 190)
                        .addComponent(pageTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(confirmBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nameTxtField)
                                                .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateOfJoiningTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn2)
                    .addComponent(pageTitle))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(wageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateOfJoiningTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(confirmBtn)
                .addContainerGap(215, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enableFields(boolean bool) {
        confirmBtn.setEnabled(bool);
        nameTxtField.setEnabled(bool);
        ageTxtField.setEnabled(bool);
        wageTxtField.setEnabled(bool);
        categoryDropdown.setEnabled(bool);
        dateOfJoiningTxtField.setEnabled(bool);
    }

    private void updateFields() {
        nameTxtField.setText(teacher.getName());
        ageTxtField.setText(String.valueOf(teacher.getAge()));
        wageTxtField.setText(String.valueOf(teacher.getwage()));
        categoryDropdown.setSelectedItem(teacher.getCategory());
        dateOfJoiningTxtField.setText(DateUtil.getDateToString(teacher.getDateOfJoining()));
    }

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HomePage hp = (HomePage) component;
        hp.populateTeacherTable();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String name = nameTxtField.getText();
        if (name == null || name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter valid name", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(ageTxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid age", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int age = Integer.parseInt(ageTxtField.getText());
        try {
            Double.parseDouble(wageTxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid wage", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double wage = Double.parseDouble(wageTxtField.getText());
        String category = String.valueOf(String.valueOf(categoryDropdown.getSelectedItem()));

        String dateOfJoining = dateOfJoiningTxtField.getText();
        if (dateOfJoining == null || dateOfJoining.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter valid date of joining", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = idTxtField.getText();

        if (mode.equals("add")) {
            if (category.equals("6-12")) {
                long count = personDirectory.getTeacherDirectory().stream().filter(e -> e.getCategory().equals("6-12")).count();
                if (count == 3) {
                    JOptionPane.showMessageDialog(null, "Cannot add more teachers in 6-12 age category", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if (category.equals("13-24")) {
                long count = personDirectory.getTeacherDirectory().stream().filter(e -> e.getCategory().equals("13-24")).count();
                if (count == 3) {
                    JOptionPane.showMessageDialog(null, "Cannot add more teachers in 13-24 age category", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if (category.equals("25-35")) {
                long count = personDirectory.getTeacherDirectory().stream().filter(e -> e.getCategory().equals("25-35")).count();
                if (count == 3) {
                    JOptionPane.showMessageDialog(null, "Cannot add more teachers in 25-35 age category", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if (category.equals("36-47")) {
                long count = personDirectory.getTeacherDirectory().stream().filter(e -> e.getCategory().equals("36-47")).count();
                if (count == 3) {
                    JOptionPane.showMessageDialog(null, "Cannot add more teachers in 36-47 age category", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if (category.equals("48-59")) {
                long count = personDirectory.getTeacherDirectory().stream().filter(e -> e.getCategory().equals("48-59")).count();
                if (count == 2) {
                    JOptionPane.showMessageDialog(null, "Cannot add more teachers in 48-59 age category", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if (category.equals("60 above")) {
                long count = personDirectory.getTeacherDirectory().stream().filter(e -> e.getCategory().equals("60 above")).count();
                if (count == 2) {
                    JOptionPane.showMessageDialog(null, "Cannot add more teachers in 60 above age category", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            TeacherStudentDirectory tsd = TeacherStudentDirectory.getObject();
            tsd.getTeacherStudentGroup().clear();
            ClassroomDirectory cd = ClassroomDirectory.getObject();
            cd.getClassroomDirectory().clear();
            ConfigureDayCare.initializeClassroomGroup();
            ConfigureDayCare.initializeStudentTeacherGroup();
            DbManagement.saveToTeacherDB(id, name, ageTxtField.getText(), wageTxtField.getText(), category, dateOfJoining);
            AbstractPerson teacher = new TeacherFactory().getObjectFromUI(Integer.parseInt(idTxtField.getText()), name, age, wage, category, dateOfJoining);
            personDirectory.getTeacherDirectory().add((Teacher) teacher);

        } else if (mode.equals("update")) {
            DbManagement.updateToTeacherDB(name, ageTxtField.getText(), wageTxtField.getText(), category, dateOfJoining, String.valueOf(teacher.getId()));
            updateTeacherInDirectory(name, age, wage, category, dateOfJoining);
            TeacherStudentDirectory tsd = TeacherStudentDirectory.getObject();
            tsd.getTeacherStudentGroup().clear();
            ClassroomDirectory cd = ClassroomDirectory.getObject();
            cd.getClassroomDirectory().clear();
            ConfigureDayCare.initializeClassroomGroup();
            ConfigureDayCare.initializeStudentTeacherGroup();
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void updateTeacherInDirectory(String name, int age, double wage, String category, String dateOfJoining) {
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setwage(wage);
        teacher.setCategory(category);
        teacher.setDateOfJoining(DateUtil.getStringToDate(dateOfJoining));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton backBtn2;
    private javax.swing.JComboBox<String> categoryDropdown;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField dateOfJoiningTxtField;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JTextField wageTxtField;
    // End of variables declaration//GEN-END:variables
}
