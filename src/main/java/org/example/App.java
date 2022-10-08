package org.example;

import static org.example.Birthday.*;

public class App {

    public static void main(String[] args) {
        System.out.printf("\nВозраст в днях: %d", getAge(1896, 10, 20));
        System.out.printf("\nСлед. днюха через %s дней будет: %s",returnRound(getAge(1896, 10, 20),1000), nextBirthday(1896,10,20));
    }
}
