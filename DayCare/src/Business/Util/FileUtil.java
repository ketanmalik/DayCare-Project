/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ketanmalik
 */
public class FileUtil {

    private static String directory = System.getProperty("user.dir") + File.separator;
    private static String path;
    private static List<String> result;

    public static List<String> readFromFile(String fileName) {
        path = directory + fileName;
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            result = new ArrayList<>();
            while (line != null) {
                result.add(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File not found");
        }
        return result;
    }

    public static String[] writeToFile(String fileName) {
        path = directory + fileName;
        return null;
    }

}
