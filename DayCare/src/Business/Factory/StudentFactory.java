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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class StudentFactory extends AbstractPersonFactory {

    private static Student student = null;
    private String[] fields = new String[5];

    public AbstractPerson getObjectFromUI(int id, String name, int age, String fName, String mName, String address, String phoneNo, double grade, String date, String bday, String hib, String dtap, String polio, String hepb, String mmr, String varicella) {
        student = new Student(id, name, age, fName, mName, address, phoneNo, grade, date, bday);
        String fields[] = hib.split(",");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < fields.length; i++) {
            list.add(Integer.parseInt(fields[i]));
        }
        student.getVaccinationHistory().put("Hib", list);
        fields = null;
        list = new ArrayList<>();

        fields = dtap.split(",");
        for (int i = 0; i < fields.length; i++) {
            list.add(Integer.parseInt(fields[i]));
        }
        student.getVaccinationHistory().put("Dtap", list);
        fields = null;
        list = new ArrayList<>();

        fields = polio.split(",");
        for (int i = 0; i < fields.length; i++) {
            list.add(Integer.parseInt(fields[i]));
        }
        student.getVaccinationHistory().put("Polio", list);
        fields = null;
        list = new ArrayList<>();

        fields = hepb.split(",");
        for (int i = 0; i < fields.length; i++) {
            list.add(Integer.parseInt(fields[i]));
        }
        student.getVaccinationHistory().put("HepatitisB", list);
        fields = null;
        list = new ArrayList<>();

        fields = mmr.split(",");
        for (int i = 0; i < fields.length; i++) {
            list.add(Integer.parseInt(fields[i]));
        }
        student.getVaccinationHistory().put("MMR", list);
        fields = null;
        list = new ArrayList<>();

        fields = varicella.split(",");
        for (int i = 0; i < fields.length; i++) {
            list.add(Integer.parseInt(fields[i]));
        }
        student.getVaccinationHistory().put("Varicella", list);
        fields = null;
        list = new ArrayList<>();

        return student;
    }

    @Override
    public AbstractPerson getObjectFromDB(ResultSet csvData) {

        try {
            int id = csvData.getInt("id");
            String name = csvData.getString("name");
            int age = csvData.getInt("age");
            String fName = csvData.getString("fName");
            String mName = csvData.getString("mName");
            String address = csvData.getString("address");
            String phone = csvData.getString("phone");
            double grade = csvData.getDouble("grade");
            String hib1 = csvData.getString("hib");
            String dTaP1 = csvData.getString("dtap");
            String polio1 = csvData.getString("polio");
            String hepatitisB1 = csvData.getString("hepb");
            String mmr1 = csvData.getString("mmr");
            String varicella1 = csvData.getString("varicella");
            String date = csvData.getString("registerdate");
            String birthDate = csvData.getString("birthdate");
            student = new Student(id, name, age, fName, mName, address, phone, grade, date, birthDate);
            String fields[] = hib1.split(",");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < fields.length; i++) {
                list.add(Integer.parseInt(fields[i]));
            }
            student.getVaccinationHistory().put("Hib", list);
            fields = null;
            list = new ArrayList<>();

            fields = dTaP1.split(",");
            for (int i = 0; i < fields.length; i++) {
                list.add(Integer.parseInt(fields[i]));
            }
            student.getVaccinationHistory().put("Dtap", list);
            fields = null;
            list = new ArrayList<>();

            fields = polio1.split(",");
            for (int i = 0; i < fields.length; i++) {
                list.add(Integer.parseInt(fields[i]));
            }
            student.getVaccinationHistory().put("Polio", list);
            fields = null;
            list = new ArrayList<>();

            fields = hepatitisB1.split(",");
            for (int i = 0; i < fields.length; i++) {
                list.add(Integer.parseInt(fields[i]));
            }
            student.getVaccinationHistory().put("HepatitisB", list);
            fields = null;
            list = new ArrayList<>();

            fields = mmr1.split(",");
            for (int i = 0; i < fields.length; i++) {
                list.add(Integer.parseInt(fields[i]));
            }
            student.getVaccinationHistory().put("MMR", list);
            fields = null;
            list = new ArrayList<>();

            fields = varicella1.split(",");
            for (int i = 0; i < fields.length; i++) {
                list.add(Integer.parseInt(fields[i]));
            }
            student.getVaccinationHistory().put("Varicella", list);
            fields = null;
            list = new ArrayList<>();

//            Vaccinations hib = new Vaccinations("Hib");
//            fields = hib1.split(",");
//            for (int i = 1; i <= fields.length; i++) {
//                hib.getDoseMap().put(i, fields[i - 1]);
//            }
//            student.getVaccinations().add(hib);
//
//            fields = null;
//            Vaccinations dTaP = new Vaccinations("DTaP");
//            fields = dTaP1.split(",");
//            for (int i = 1; i <= fields.length; i++) {
//                dTaP.getDoseMap().put(i, fields[i - 1]);
//            }
//            student.getVaccinations().add(dTaP);
//
//            fields = null;
//            Vaccinations polio = new Vaccinations("Polio");
//            fields = polio1.split(",");
//            for (int i = 1; i <= fields.length; i++) {
//                polio.getDoseMap().put(i, fields[i - 1]);
//            }
//            student.getVaccinations().add(polio);
//
//            fields = null;
//            Vaccinations hepatitisB = new Vaccinations("HepatitisB");
//            fields = hepatitisB1.split(",");
//            for (int i = 1; i <= fields.length; i++) {
//                hepatitisB.getDoseMap().put(i, fields[i - 1]);
//            }
//            student.getVaccinations().add(hepatitisB);
//
//            fields = null;
//            Vaccinations mmr = new Vaccinations("MMR");
//            fields = mmr1.split(",");
//            for (int i = 1; i <= fields.length; i++) {
//                mmr.getDoseMap().put(i, fields[i - 1]);
//            }
//            student.getVaccinations().add(mmr);
//
//            fields = null;
//            Vaccinations varicella = new Vaccinations("Varicella");
//            fields = varicella1.split(",");
//            for (int i = 1; i <= fields.length; i++) {
//                hib.getDoseMap().put(i, fields[i - 1]);
//            }
//            student.getVaccinations().add(varicella);
//            student.getVaccinationRecord().put("Hib", hib);
//            student.getVaccinationRecord().put("DTaP", dTaP);
//            student.getVaccinationRecord().put("Polio", polio);
//            student.getVaccinationRecord().put("HepatitisB", hepatitisB);
//            student.getVaccinationRecord().put("MMR", mmr);
//            student.getVaccinationRecord().put("Varicella", varicella);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return student;
    }

}
