/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directories;

import Business.Entities.Classroom;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ketanmalik
 */
public class ClassroomDirectory {

    private List<Classroom> classroomDirectory;
    private static ClassroomDirectory classroomDirectoryObj = null;

    private ClassroomDirectory() {
        classroomDirectory = new ArrayList<>();
    }

    public static ClassroomDirectory getObject() {
        if (classroomDirectoryObj == null) {
            classroomDirectoryObj = new ClassroomDirectory();
        }
        return classroomDirectoryObj;
    }

    public List<Classroom> getClassroomDirectory() {
        return classroomDirectory;
    }

    public void setClassroomDirectory(List<Classroom> classroomDirectory) {
        this.classroomDirectory = classroomDirectory;
    }
}
