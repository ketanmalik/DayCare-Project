/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ketanmalik
 */
public class DateUtil {

    public static Date getStringToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = sdf.parse(dateString);
            return date;
        } catch (Exception e) {

        }
        return null;
    }

    public static String getDateToString(Date date) {
        return new SimpleDateFormat("MM/dd/yyyy").format(date);
    }
}
