package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class CatStatistics {

/*
    Задача 3.6
    Описать класс CatStatistics со статическими методами:
*/

    // возвращает список котов, отсортировав по имени по возрастанию.
    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        return cats.stream()
                .sorted(Comparator.comparing(Cat::getName)) //ссылка на метод
                .collect(Collectors.toCollection(ArrayList::new)); // собираем коллекцию
    }

    // возвращает список котов, отсортировав по убыванию веса.
    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        return cats.stream()
                .sorted(Comparator.comparing(Cat::getWeight).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // возвращает список котов кроме первого и последнего.
    public static ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats) {
        return cats.stream()
                .skip(1).
                limit(cats.size() - 2).
                collect(Collectors.toCollection(ArrayList::new));
    }

    // возвращает первого не-сердитого кота в списке.
    public static Cat findFirstNonAngryCat(ArrayList<Cat> cats) {
        return cats.stream().filter(e -> !e.isAngry()).findFirst().orElse(null);
    }

    // возвращает суммарный вес всех котов (если параметр onlyAngry равен true, то только сердитых котов).
    static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        if (!onlyAngry) return getAllWeight(cats);
        return cats.stream()
                .filter(Cat::isAngry)
                .map(Cat::getWeight)
                .reduce(Integer::sum)
                .orElse(0);
    }

    static int getAllWeight(ArrayList<Cat> cats) {
        return cats.stream()
                .map(Cat::getWeight)
                .reduce(Integer::sum)
                .orElse(0);
    }


    // возвращает список котов сгруппировав их по первой букве имени и отсортировав группировку по возрастанию.

    static Map<String, List<Cat>> groupCatsByFirstLetter(ArrayList<Cat> cats) {
        return cats
                .stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.groupingBy(s -> s.getName().substring(0,1)));
    }
}
