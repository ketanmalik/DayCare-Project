/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directories;

import Business.Entities.AbstractPerson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class PersonDirectory {

    private List<AbstractPerson> studentDirectory;
    private List<AbstractPerson> teacherDirectory;
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

    public List<AbstractPerson> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(List<AbstractPerson> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public List<AbstractPerson> getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(List<AbstractPerson> teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }

}
