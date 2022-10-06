package org.example;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.BlockingDeque;

public class Birthday {

    public static LocalDate nextBirthday (int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        return date;
    }
    public static int getAge(int year, int month, int date) {
        LocalDate date1 = LocalDate.of(year, month, date);
        LocalDate date2 = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
/*

    public static int getAge(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year,month,date);
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(birthDay, today);
    }

    public static LocalDate nextBirthday(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year,month,date);
        LocalDate today = LocalDate.now();
        long between = ChronoUnit.DAYS.between(birthDay, today);
        long round = between - between % 1000 + (between % 1000 == 0 ? 0 : 1000);
        long toAdd = round - between;
        return today.plusDays(toAdd);
    }
    */
