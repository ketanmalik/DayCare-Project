/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author ketanmalik
 */
public class DateUtil {

    public static Date getStringToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = sdf.parse(dateString);
            Date d = new Date();
            return date;
        } catch (Exception e) {

        }
        return null;
    }

    public static String getDateToString(Date date) {
        return new SimpleDateFormat("MM/dd/yyyy").format(date);
    }

    public static long getDaysDifference(Date d) {
        Date today = new Date();
        long diff = (today.getTime() - d.getTime()) / (24 * 60 * 60 * 1000);
        return diff;
//        long diff = 0;
//        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        int year = ld.getYear();
//
//        LocalDate today = LocalDate.now();
//        int todayYear = today.getYear();
//
//        if (todayYear == year) {
//            diff = 0;
//        } else {
//            diff = 400;
//        }
//        return diff;
    }

    public static void plusYear(Date d) {
        LocalDateTime localDateTime = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().plusYears(1);
    }

    public static boolean checkAnniversary(Date d) {
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        MonthDay anniv = MonthDay.of(ld.getMonth(), ld.getDayOfMonth());
        MonthDay today = MonthDay.now();
        return today.equals(anniv);
    }

    public static boolean isAnniversaryOverdue(Date d) {
        boolean overdue = false;
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();

        LocalDate today = LocalDate.now();
        int todaysMonth = today.getMonthValue();
        int todaysDay = today.getDayOfMonth();

        if (todaysMonth == month) {
            if (todaysDay > day) {
                overdue = true;
            } else {
                overdue = false;
            }
        } else {
            if (todaysMonth > month) {
                if (todaysMonth - month > 6) {
                    overdue = false;
                } else {
                    overdue = true;
                }
            } else {
                overdue = false;
            }
        }
        return overdue;
    }

    public static int getStuDueDate(Date d, int months) {
//        int diff = 999;
//        LocalDate dueDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusMonths(1);
//        int month = dueDate.getMonthValue();
//        int day = dueDate.getDayOfMonth();
//
//        LocalDate today = LocalDate.now();
//        int todaysMonth = today.getMonthValue();
//        int todaysDay = today.getDayOfMonth();
//
//        if (todaysMonth == month) {
//            diff = day - todaysDay;
//        } else {
//            if (todaysMonth > month) {
//                if (todaysMonth - month > 6) {
//                    diff = 1;
//                } else {
//                    diff = -999;
//                }
//            } else {
//                diff = 1;
//            }
//        }
//
//        return diff;

        int years = months / 12;
        int remainingMonths = months % 12;
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusMonths(remainingMonths).plusYears(years);

        LocalDate today = LocalDate.now();
        Period period = Period.between(today, ld);
        int diff = period.getDays();
        return diff;
    }

    public static Date plusStuDays(Date d, int i, String mode) {
        LocalDate dueDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusMonths(i);
        if (mode.equals("addYear")) {
            int year = dueDate.getYear();

            LocalDate today = LocalDate.now();
            int todayYear = today.getYear();
            long l = todayYear - year;
            LocalDate dateToReturn = dueDate.plusYears(l);
            return java.sql.Date.valueOf(dateToReturn);
        }
        return java.sql.Date.valueOf(dueDate);
    }

    public static int getDueDate(Date d, int i) {
        int diff = 0;
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();

        LocalDate today = LocalDate.now();
        int todaysMonth = today.getMonthValue();
        int todaysDay = today.getDayOfMonth();

        if (todaysMonth == month) {
            if (todaysDay > day) {
                diff = todaysDay - day;
            } else {
                diff = day - todaysDay;
            }
        } else {
            diff = -999;
        }
//        else {
//            diff = todaysMonth - month;
//            System.out.println(diff);
//            diff += todaysDay - day;
//            System.out.println(diff);
//        }
        return diff;
    }

    public static Date plusDays(Date d, int i) {
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusDays(i);
        return java.sql.Date.valueOf(ld);
    }

    public static Date plusMonths(Date d) {
        int addMonth = 0;
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = ld.getMonthValue();
        int year = ld.getYear();

        LocalDate today = LocalDate.now();
        int todaysMonth = today.getMonthValue();
        int todayYear = today.getYear();
        if (todaysMonth > month) {
            addMonth = 12 - (todaysMonth - month);
        } else if (todaysMonth < month) {
            addMonth = month - todaysMonth;
        }
        long l = todayYear - year + 1;
//        ld.plusMonths(addMonth);
        LocalDate dateToReturn = ld.plusYears(l);
        return java.sql.Date.valueOf(dateToReturn);
    }

    public static Date plusYears(Date d) {
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = ld.getYear();

        LocalDate today = LocalDate.now();
        int todayYear = today.getYear();
        long l = todayYear - year;
        LocalDate dateToReturn = ld.plusYears(l);
        return java.sql.Date.valueOf(dateToReturn);
    }

    public static Date futureStuDueDates(Date d, int months) {
        int years = months / 12;
        int remainingMonths = months % 12;
        LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusMonths(remainingMonths).plusYears(years);
        return java.sql.Date.valueOf(ld);
    }
}
