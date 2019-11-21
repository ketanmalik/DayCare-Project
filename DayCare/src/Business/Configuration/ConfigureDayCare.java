/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;

import Business.Directories.PersonDirectory;
import Business.Entities.AbstractPerson;
import Business.Factory.AbstractPersonFactory;
import Business.Factory.StudentFactory;
import Business.Factory.TeacherFactory;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ketanmalik
 */
public class ConfigureDayCare {

    private static PersonDirectory personDirectory;
    private static ResultSet teacherResultSet;
    private static ResultSet studentResultSet;

    public ConfigureDayCare() {
        personDirectory = PersonDirectory.getObject();
        runConfiguration();
        System.out.println("Business.Configuration.ConfigureDayCare.<init>()");
    }

    public final void runConfiguration() {
        initializeDatabase();
    }

    public final void initializeDatabase() {
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/DayCare?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "myuser", "user"); // For MySQL only
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement statement = connection.createStatement();) {
            // Step 3: Execute a SQL SELECT query. The query result is returned in a 'ResultSet' object.
            String studentData = "select * from StudentData";
            studentResultSet = statement.executeQuery(studentData);
            createStudentObjects(studentResultSet);

            String teacherData = "select * from TeacherData";
            teacherResultSet = statement.executeQuery(teacherData);
            createTeacherObjects(teacherResultSet);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to load data");
        }
    }

    public final void createStudentObjects(ResultSet studentResultSet) {
        try {
            while (studentResultSet.next()) {
                AbstractPersonFactory studentFactory = new StudentFactory();
                AbstractPerson studentObj = studentFactory.getObject(studentResultSet);
                personDirectory.getStudentDirectory().add(studentObj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to load Student data");
        }
    }

    public final void createTeacherObjects(ResultSet teacherResultSet) {
        try {
            while (teacherResultSet.next()) {
                AbstractPersonFactory teacherFactory = new TeacherFactory();
                AbstractPerson teacherObj = teacherFactory.getObject(teacherResultSet);
                personDirectory.getTeacherDirectory().add(teacherObj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to load Teacher data");
        }
    }
}
