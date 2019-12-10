/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ketanmalik
 */
public class DbManagement {

    static Connection connect = null;
    ResultSet rst = null;
    static PreparedStatement pst = null;

    public static Connection connDB() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/daycare", "myuser", "myuser");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database not found");
        }
        return conn;
    }

    public static void saveToStudentDB(String id, String name, String age, String fname, String mname, String address, String phone, String grade, String hib, String dtap, String polio, String hepb, String mmr, String varicella, String registedate, String birthdate) {
        connect = connDB();
        try {
            String sql = "insert into studentdata (id,name,age,fname,mname,address,phone,grade,hib,dtap,polio,hepb,mmr,varicella,registerdate,birthdate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = connect.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, age);
            pst.setString(4, fname);
            pst.setString(5, mname);
            pst.setString(6, address);
            pst.setString(7, phone);
            pst.setString(8, grade);
            pst.setString(9, hib);
            pst.setString(10, dtap);
            pst.setString(11, polio);
            pst.setString(12, hepb);
            pst.setString(13, mmr);
            pst.setString(14, varicella);
            pst.setString(15, registedate);
            pst.setString(16, birthdate);

// id_text,user_text,pass_text,age_text,email_text > jtextfields name
            pst.execute();

            JOptionPane.showMessageDialog(null, "Student added to daycare", "Success", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void updateToStudentDB(String name, String age, String fname, String mname, String address, String phone, String hib, String dtap, String polio, String hepb, String mmr, String varicella, String birthdate, String id) {
        connect = connDB();
        try {
            String sql = "UPDATE studentdata SET name=?, age=?,fname=?,mname=?,address=?,phone=?,hib=?,dtap=?,polio=?,hepb=?,mmr=?,varicella=?,birthdate=? where id=" + id;

            pst = connect.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, fname);
            pst.setString(4, mname);
            pst.setString(5, address);
            pst.setString(6, phone);
            pst.setString(7, hib);
            pst.setString(8, dtap);
            pst.setString(9, polio);
            pst.setString(10, hepb);
            pst.setString(11, mmr);
            pst.setString(12, varicella);
            pst.setString(13, birthdate);

// id_text,user_text,pass_text,age_text,email_text > jtextfields name
            pst.execute();

            JOptionPane.showMessageDialog(null, "Student information updated", "Success", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void deleteFromStudentDB(String id) {
        connect = connDB();
        try {
            String sql = "DELETE from studentdata where id=" + id;

            pst = connect.prepareStatement(sql);
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Student deleted from daycare", "Success", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
