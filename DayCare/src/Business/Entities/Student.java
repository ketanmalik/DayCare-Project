/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

import Business.Util.DateUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private Map<String, List<Integer>> vaccinationHistory;
    private Date date;
    private Date birthDate;

    public Student(int id, String name, int age, String fathersName, String mothersName, String address, String phone, double grade, String date, String birthDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.address = address;
        this.phone = phone;
        this.grade = grade;
        this.date = DateUtil.getStringToDate(date);
        this.birthDate = DateUtil.getStringToDate(birthDate);
        vaccinationHistory = new HashMap<>();
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

    public Map<String, List<Integer>> getVaccinationHistory() {
        return vaccinationHistory;
    }

    public void setVaccinationHistory(Map<String, List<Integer>> vaccinationHistory) {
        this.vaccinationHistory = vaccinationHistory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId() {
        this.id = id;
    }
}
