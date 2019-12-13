/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;

import Business.Directories.ClassroomDirectory;
import Business.Directories.PersonDirectory;
import Business.Directories.TeacherStudentDirectory;
import Business.Entities.AbstractPerson;
import Business.Entities.Classroom;
import Business.Entities.Student;
import Business.Entities.Teacher;
import Business.Factory.ClassroomFactory;
import Business.Factory.StudentFactory;
import Business.Factory.TeacherFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author ketanmalik
 */
public class ConfigureDayCare {

    private static PersonDirectory personDirectory;
    private static TeacherStudentDirectory teacherStudentGroup;
    private static ResultSet teacherResultSet;
    private static ResultSet studentResultSet;
    private static ClassroomDirectory classroomDirectoryObj;
    private static Classroom c1;
    private static Classroom c2;
    private static Classroom c3;
    private static Classroom c4;
    private static Classroom c5;
    private static Classroom c6;

    public ConfigureDayCare() {
        personDirectory = PersonDirectory.getObject();
        teacherStudentGroup = TeacherStudentDirectory.getObject();
        runConfiguration();
    }

    public final void runConfiguration() {
        initializeDatabase();
        initializeClassroomGroup();
        initializeStudentTeacherGroup();
//        initializeClassroomGroup();
    }

    public final void initializeDatabase() {
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/DayCare?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "myuser", "myuser"); // For MySQL only
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement statement = connection.createStatement();) {
            // Step 3: Execute a SQL SELECT query. The query result is returned in a 'ResultSet' object.
            String studentData = "select * from studentdata";
            studentResultSet = statement.executeQuery(studentData);
            createStudentObjects(studentResultSet);
            String teacherData = "select * from teacherdata";
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
                StudentFactory studentFactory = new StudentFactory();
                AbstractPerson studentObj = studentFactory.getObjectFromDB(studentResultSet);
                personDirectory.getStudentDirectory().add((Student) studentObj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to load Student data");
        }
    }

    public final void createTeacherObjects(ResultSet teacherResultSet) {
        try {
            while (teacherResultSet.next()) {
                TeacherFactory teacherFactory = new TeacherFactory();
                AbstractPerson teacherObj = teacherFactory.getObjectFromDB(teacherResultSet);
                personDirectory.getTeacherDirectory().add((Teacher) teacherObj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to load Teacher data");
        }
    }

    public static final void initializeStudentTeacherGroup() {
        List<Student> tempList = new ArrayList<>();
        int size = 0;
        int i = 0;
        String name = "";

        tempList = personDirectory.getStudentDirectory().stream()
                .filter(e -> e.getAge() >= 6 && e.getAge() <= 12)
                .collect(Collectors.toList());

        size = tempList.size();
        if (tempList.size() <= 4) {
            for (Teacher t : personDirectory.getTeacherDirectory()) {
                if (t.getCategory().equalsIgnoreCase("6-12")) {
                    Map<Teacher, List<Student>> tempMap = new HashMap<>();
                    tempMap.put(t, tempList);
                    teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                    break;
                }
            }
            c1.getClassGroup().put("1A", teacherStudentGroup.getTeacherStudentGroup().get(i++));
        } else if (size >= 5 && size <= 8) {
            List<Student> t1 = new ArrayList<>();
            List<Student> t2 = new ArrayList<>();

            for (int j = 0; j < 4; j++) {
                t1.add(tempList.get(j));
            }
            for (Teacher t : personDirectory.getTeacherDirectory()) {
                if (t.getCategory().equalsIgnoreCase("6-12")) {
                    Map<Teacher, List<Student>> tempMap = new HashMap<>();
                    tempMap.put(t, t1);
                    name = t.getName();
//                    t1.forEach(System.out::print);
                    tempMap.get(0);
                    teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                    break;
                }
            }
            c1.getClassGroup().put("1A", teacherStudentGroup.getTeacherStudentGroup().get(i++));

            for (int j = 4; j < size; j++) {
                t2.add(tempList.get(j));
            }
            for (Teacher t : personDirectory.getTeacherDirectory()) {
                if (t.getCategory().equalsIgnoreCase("6-12")) {
                    if (t.getName().equals(name)) {
                        continue;
                    }
                    Map<Teacher, List<Student>> tempMap = new HashMap<>();
                    tempMap.put(t, t2);
                    name = t.getName();
//                    System.out.println();
//                    t2.forEach(System.out::print);
                    teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                    break;
                }
            }
//            System.out.println(i);
//            System.out.println(teacherStudentGroup.getTeacherStudentGroup().get(0));
//            System.out.println(teacherStudentGroup.getTeacherStudentGroup().get(1));
            c1.getClassGroup().put("1B", teacherStudentGroup.getTeacherStudentGroup().get(i++));

        }

        tempList = personDirectory.getStudentDirectory().stream()
                .filter(e -> e.getAge() >= 13 && e.getAge() <= 24)
                .collect(Collectors.toList());

        for (Teacher t : personDirectory.getTeacherDirectory()) {
            if (t.getCategory().equalsIgnoreCase("13-24")) {
                Map<Teacher, List<Student>> tempMap = new HashMap<>();
                tempMap.put(t, tempList);
                teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                break;
            }
        }

        tempList = personDirectory.getStudentDirectory().stream()
                .filter(e -> e.getAge() >= 25 && e.getAge() <= 35)
                .collect(Collectors.toList());

        for (Teacher t : personDirectory.getTeacherDirectory()) {
            if (t.getCategory().equalsIgnoreCase("25-35")) {
                Map<Teacher, List<Student>> tempMap = new HashMap<>();
                tempMap.put(t, tempList);
                teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                break;
            }
        }

        tempList = personDirectory.getStudentDirectory().stream()
                .filter(e -> e.getAge() >= 36 && e.getAge() <= 47)
                .collect(Collectors.toList());

        for (Teacher t : personDirectory.getTeacherDirectory()) {
            if (t.getCategory().equalsIgnoreCase("36-47")) {
                Map<Teacher, List<Student>> tempMap = new HashMap<>();
                tempMap.put(t, tempList);
                teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                break;
            }
        }

        tempList = personDirectory.getStudentDirectory().stream()
                .filter(e -> e.getAge() >= 48 && e.getAge() <= 59)
                .collect(Collectors.toList());

        for (Teacher t : personDirectory.getTeacherDirectory()) {
            if (t.getCategory().equalsIgnoreCase("48-59")) {
                Map<Teacher, List<Student>> tempMap = new HashMap<>();
                tempMap.put(t, tempList);
                teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                break;
            }
        }

        tempList = personDirectory.getStudentDirectory().stream()
                .filter(e -> e.getAge() >= 60)
                .collect(Collectors.toList());

        for (Teacher t : personDirectory.getTeacherDirectory()) {
            if (t.getCategory().equalsIgnoreCase("60 above")) {
                Map<Teacher, List<Student>> tempMap = new HashMap<>();
                tempMap.put(t, tempList);
                teacherStudentGroup.getTeacherStudentGroup().add(tempMap);
                break;
            }
        }
    }

    public static final void initializeClassroomGroup() {
        ClassroomFactory classroomFactory = new ClassroomFactory();
        c1 = classroomFactory.getObj("1", 12);
        c2 = classroomFactory.getObj("2", 15);
        c3 = classroomFactory.getObj("3", 18);
        c4 = classroomFactory.getObj("4", 24);
        c5 = classroomFactory.getObj("5", 24);
        c6 = classroomFactory.getObj("6", 30);

//        c1.getClassGroup().put("1A", teacherStudentGroup.getTeacherStudentGroup().get(0));
//        c2.getClassGroup().put("2A", teacherStudentGroup.getTeacherStudentGroup().get(1));
//        c3.getClassGroup().put("3A", teacherStudentGroup.getTeacherStudentGroup().get(2));
//        c4.getClassGroup().put("4A", teacherStudentGroup.getTeacherStudentGroup().get(3));
//        c5.getClassGroup().put("5A", teacherStudentGroup.getTeacherStudentGroup().get(4));
//        c6.getClassGroup().put("6A", teacherStudentGroup.getTeacherStudentGroup().get(5));
        classroomDirectoryObj = ClassroomDirectory.getObject();
        classroomDirectoryObj.getClassroomDirectory().add(c1);
        classroomDirectoryObj.getClassroomDirectory().add(c2);
        classroomDirectoryObj.getClassroomDirectory().add(c3);
        classroomDirectoryObj.getClassroomDirectory().add(c4);
        classroomDirectoryObj.getClassroomDirectory().add(c5);
        classroomDirectoryObj.getClassroomDirectory().add(c6);
    }
}
