/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Factory;

import Business.Entities.AbstractPerson;
import Business.Entities.Teacher;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ketanmalik
 */
public class TeacherFactory extends AbstractPersonFactory {

    @Override
    public AbstractPerson getObject(ResultSet csvData) {
        try {
            String name = csvData.getString("name");
            int age = csvData.getInt("age");
            double credits = csvData.getDouble("credits");
            AbstractPerson teacher = new Teacher(name, age, credits);
            return teacher;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
