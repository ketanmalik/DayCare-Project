/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

import Business.Util.DateUtil;
import java.util.Date;

/**
 *
 * @author ketanmalik
 */
public class Teacher extends AbstractPerson {

    private double wage;
    private String category;
    private Date dateOfJoining;

    public Teacher(int id, String name, int age, double wage, String category, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.category = category;
        this.dateOfJoining = DateUtil.getStringToDate(dateOfJoining);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getwage() {
        return wage;
    }

    public void setwage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return this.name;
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
    public int getId() {
        return this.id;
    }

    @Override
    public void setId() {
        this.id = id;
    }
}
