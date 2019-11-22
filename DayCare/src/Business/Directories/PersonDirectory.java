/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directories;

import Business.Entities.Student;
import Business.Entities.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class PersonDirectory {

    private List<Student> studentDirectory;
    private List<Teacher> teacherDirectory;
    private static PersonDirectory personDirectoryObject = null; 

    private PersonDirectory() {
        studentDirectory = new ArrayList<>();
        teacherDirectory = new ArrayList<>();
    }

    public static PersonDirectory getObject() {
        if (personDirectoryObject == null) {
            personDirectoryObject = new PersonDirectory();
        }
        return personDirectoryObject;
    }

    public List<Student> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(List<Student> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public List<Teacher> getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(List<Teacher> teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }

}
