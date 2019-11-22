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

    private static Student student;

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
            String hib = csvData.getString("Hib");
            String dTaP = csvData.getString("DTaP");
            String polio = csvData.getString("Polio");
            String hepatitisB = csvData.getString("HepatitisB");
            String mmr = csvData.getString("MMR");
            String varicella = csvData.getString("Varicella");
            student = new Student(name, age, fName, mName, address, phone, grade);
            student.getVaccinationRecord().put("Hib", hib);
            student.getVaccinationRecord().put("DTaP", dTaP);
            student.getVaccinationRecord().put("Polio", polio);
            student.getVaccinationRecord().put("HepatitisB", hepatitisB);
            student.getVaccinationRecord().put("MMR", mmr);
            student.getVaccinationRecord().put("Varicella", varicella);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return student;
    }

}
