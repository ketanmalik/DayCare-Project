/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Classroom;

import Business.Directories.ClassroomDirectory;
import Business.Directories.TeacherStudentDirectory;
import Business.Entities.Classroom;
import Business.Entities.Student;
import Business.Entities.Teacher;
import UI.MainJFrame.MainJFrame;
import static UI.MainJFrame.MainJFrame.alertsBtn;
import static UI.MainJFrame.MainJFrame.classroomBtn;
import static UI.MainJFrame.MainJFrame.homeBtn;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ClassroomJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClassroomJPanel
     */
    private JPanel displayPanel;
    private TeacherStudentDirectory tsd;
    private ClassroomDirectory cd;

    public ClassroomJPanel(JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
        this.tsd = TeacherStudentDirectory.getObject();
        this.cd = ClassroomDirectory.getObject();
        modifyButtons();
        showButtons(true);
        MainJFrame.page = "classroom";
        populateTable();
    }

    private void modifyButtons() {
        homeBtn.setOpaque(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setBorderPainted(false);
        homeBtn.setForeground(Color.white);

        classroomBtn.setOpaque(false);
        classroomBtn.setContentAreaFilled(false);
        classroomBtn.setBorderPainted(false);
        classroomBtn.setForeground(Color.black);

        alertsBtn.setOpaque(false);
        alertsBtn.setContentAreaFilled(false);
        alertsBtn.setBorderPainted(false);
        alertsBtn.setForeground(Color.white);
    }

    public void showButtons(boolean bool) {
        homeBtn.setVisible(bool);
        classroomBtn.setVisible(bool);
        alertsBtn.setVisible(bool);
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
        classroomTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roomIdTxtField = new javax.swing.JTextField();
        groupIdTxtField = new javax.swing.JTextField();
        assignedTeacherTxtField = new javax.swing.JTextField();
        categoryTxtField = new javax.swing.JTextField();
        totalStudentsTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        studentListScrollPanel = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        classroomTbl.setAutoCreateRowSorter(true);
        classroomTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Group ID", "Teacher", "Age Group"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classroomTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classroomTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(classroomTbl);
        if (classroomTbl.getColumnModel().getColumnCount() > 0) {
            classroomTbl.getColumnModel().getColumn(0).setResizable(false);
            classroomTbl.getColumnModel().getColumn(1).setResizable(false);
            classroomTbl.getColumnModel().getColumn(2).setResizable(false);
            classroomTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Classroom ID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Group ID:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Assigned Teacher:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age Group:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Students:");

        roomIdTxtField.setEnabled(false);

        groupIdTxtField.setEnabled(false);

        assignedTeacherTxtField.setEnabled(false);

        categoryTxtField.setEnabled(false);

        totalStudentsTxtField.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("List of Students:");

        studentListScrollPanel.setViewportView(studentList);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("View Classrooms");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalStudentsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roomIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(groupIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignedTeacherTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(studentListScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel7)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(roomIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(groupIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(assignedTeacherTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(categoryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(totalStudentsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(studentListScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void classroomTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomTblMouseClicked
        int selectedRow = classroomTbl.getSelectedRow();
        populateDetails((Classroom) classroomTbl.getValueAt(selectedRow, 0));
    }//GEN-LAST:event_classroomTblMouseClicked

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) classroomTbl.getModel();
        dtm.setRowCount(0);

        for (Classroom c : cd.getClassroomDirectory()) {
            Map<String, Map<Teacher, List<Student>>> clsGrp = new HashMap<>();
            clsGrp = c.getClassGroup();
            Set<Map.Entry<String, Map<Teacher, List<Student>>>> clsGrpEntry = clsGrp.entrySet();
            Iterator itr = clsGrpEntry.iterator();
            while (itr.hasNext()) {
                Map.Entry<String, Map<Teacher, List<Student>>> e = (Map.Entry<String, Map<Teacher, List<Student>>>) itr.next();
                Map<Teacher, List<Student>> teacherStudent = new HashMap<>();
                teacherStudent = e.getValue();
                Set<Map.Entry<Teacher, List<Student>>> teacherStudentEntry = teacherStudent.entrySet();
                Iterator itr2 = teacherStudentEntry.iterator();
                while (itr2.hasNext()) {
                    Map.Entry<Teacher, List<Student>> e2 = (Map.Entry<Teacher, List<Student>>) itr2.next();
                    Object[] row = new Object[4];
                    row[0] = c;
                    row[1] = e.getKey();
                    row[2] = e2.getKey();
                    row[3] = e2.getKey().getCategory();

                    dtm.addRow(row);
                }
            }
        }

    }

    public void populateList(List<Student> list) {
        DefaultListModel<String> studentList = new DefaultListModel<>();
        for (Student s : list) {
            studentList.addElement(s.getName());
        }

        this.studentList.removeAll();
        this.studentList.setModel(studentList);
        studentListScrollPanel.setVisible(true);
        studentListScrollPanel.getParent().validate();
        this.studentList.setVisible(true);
        this.studentList.getParent().validate();
    }

    public void populateDetails(Classroom c) {
        Map<String, Map<Teacher, List<Student>>> clsGrp = new HashMap<>();
        clsGrp = c.getClassGroup();
        Set<Map.Entry<String, Map<Teacher, List<Student>>>> clsGrpEntry = clsGrp.entrySet();
        Iterator itr = clsGrpEntry.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Map<Teacher, List<Student>>> e = (Map.Entry<String, Map<Teacher, List<Student>>>) itr.next();
            Map<Teacher, List<Student>> teacherStudent = new HashMap<>();
            teacherStudent = e.getValue();
            Set<Map.Entry<Teacher, List<Student>>> teacherStudentEntry = teacherStudent.entrySet();
            Iterator itr2 = teacherStudentEntry.iterator();
            while (itr2.hasNext()) {
                Map.Entry<Teacher, List<Student>> e2 = (Map.Entry<Teacher, List<Student>>) itr2.next();
                roomIdTxtField.setText(c.getId());
                groupIdTxtField.setText(e.getKey());
                assignedTeacherTxtField.setText(e2.getKey().getName());
                categoryTxtField.setText(e2.getKey().getCategory());
                totalStudentsTxtField.setText(String.valueOf(e2.getValue().size()));
                populateList(e2.getValue());

            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assignedTeacherTxtField;
    private javax.swing.JTextField categoryTxtField;
    private javax.swing.JTable classroomTbl;
    private javax.swing.JTextField groupIdTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField roomIdTxtField;
    private javax.swing.JList<String> studentList;
    private javax.swing.JScrollPane studentListScrollPanel;
    private javax.swing.JTextField totalStudentsTxtField;
    // End of variables declaration//GEN-END:variables
}
