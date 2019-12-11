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

    private static AbstractPerson teacher = null;

    public AbstractPerson getObjectFromUI(int id, String name, int age, double wage, String category, String dateOfJoining) {
        AbstractPerson teacher = new Teacher(id, name, age, wage, category, dateOfJoining);
        return teacher;
    }

    @Override
    public AbstractPerson getObjectFromDB(ResultSet csvData) {
        try {
            int id = csvData.getInt("id");
            String name = csvData.getString("name");
            int age = csvData.getInt("age");
            double wage = csvData.getDouble("wage");
            String category = csvData.getString("category");
            String dateOfJoining = csvData.getString("dateofjoining");
            teacher = new Teacher(id, name, age, wage, category, dateOfJoining);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return teacher;
    }
}
