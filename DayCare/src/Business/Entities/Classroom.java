/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

import Business.Factory.ClassroomFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ketanmalik
 */
public class Classroom extends ClassroomFactory {

    private String id;
    private int capacity;
    private Map<String, Map<Teacher, List<Student>>> classGroup;

    public Classroom(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        classGroup = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Map<String, Map<Teacher, List<Student>>> getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(Map<String, Map<Teacher, List<Student>>> classGroup) {
        this.classGroup = classGroup;
    }

    @Override
    public String toString() {
        return this.id;
    }

}
