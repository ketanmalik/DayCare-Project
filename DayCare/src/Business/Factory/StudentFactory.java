/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Factory;

import Business.Entities.AbstractPerson;
import Business.Entities.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ketanmalik
 */
public class StudentFactory extends AbstractPersonFactory {

    @Override
    public AbstractPerson getObject(ResultSet csvData) {

        try {
                String name = csvData.getString("name");
                int age = csvData.getInt("age");
                String fName = csvData.getString("fName");
                String mName = csvData.getString("mName");
                String address = csvData.getString("address");
                String phone = csvData.getString("phone");
                double grade = csvData.getDouble("grade");
                AbstractPerson student = new Student(name, age, fName, mName, address, phone, grade);
                return student;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
