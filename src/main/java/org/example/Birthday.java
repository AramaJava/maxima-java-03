package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Birthday {
    public static LocalDate nextBirthday(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year, month, date);
        return birthDay.plusDays(returnRound(getAge(year, month, date), 1000));
    }

    public static int getAge(int year, int month, int date) {
        // дата рождения
        LocalDate birthDay = LocalDate.of(year, month, date);
        // текущая дата
        LocalDate toDay = LocalDate.now();
        // возвращаем количество дней между этими датами
        return (int) ChronoUnit.DAYS.between(birthDay, toDay);
    }

    public static int returnRound(int period, int digit) {
        if (period % digit == 0) return period; else {
            return period - period % digit + digit;
        }
    }
}
