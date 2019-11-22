/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author ketanmalik
 */
public class Student extends AbstractPerson {

    private String fathersName;
    private String mothersName;
    private String address;
    private String phone;
    private double grade;
    private Map<String, String> vaccinationRecord;

    public Student(String name, int age, String fathersName, String mothersName, String address, String phone, double grade) {
        this.name = name;
        this.age = age;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.address = address;
        this.phone = phone;
        this.grade = grade;
        vaccinationRecord = new HashMap<>();
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Map<String, String> getVaccinationRecord() {
        return vaccinationRecord;
    }

    public void setVaccinationRecord(Map<String, String> vaccinationRecord) {
        this.vaccinationRecord = vaccinationRecord;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
