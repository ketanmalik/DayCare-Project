/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directories;

import Business.Entities.Teacher;
import Business.Entities.Student;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class TeacherStudentDirectory {

    private List<Map<Teacher, List<Student>>> teacherStudentGroup;
    private static TeacherStudentDirectory teacherStudentObj = null;

    private TeacherStudentDirectory() {
        teacherStudentGroup = new ArrayList<>();
    }

    public static TeacherStudentDirectory getObject() {

        if (teacherStudentObj == null) {
            teacherStudentObj = new TeacherStudentDirectory();
        }
        return teacherStudentObj;
    }

    public List<Map<Teacher, List<Student>>> getTeacherStudentGroup() {
        return teacherStudentGroup;
    }

    public void setTeacherStudentGroup(List<Map<Teacher, List<Student>>> teacherStudentGroup) {
        this.teacherStudentGroup = teacherStudentGroup;
    }
}
