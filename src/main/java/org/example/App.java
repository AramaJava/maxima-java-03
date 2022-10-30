package org.example;


import java.util.ArrayList;

import static org.example.CatStatistics.*;


public class App {

    public static void main(String[] args) throws IncorrectAnimalWeightException {

        Cat marusya = new Cat("Маруся", 4, true);
        Cat murzik = new Cat("Мурзик", 4, true);
        Cat marsel = new Cat("Марсель", 2, false);
        Cat murka = new Cat("Мурка", 5, true);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(marusya);
        cats.add(murzik);
        cats.add(marsel);
        cats.add(murka);

        System.out.println(sortByNameAscending(cats));
        System.out.println(sortByWeightDescending(cats));
        System.out.println(removeFirstAndLast(cats));
        System.out.println(findFirstNonAngryCat(cats));
        System.out.println(getAllWeight(cats));
        System.out.println(getCommonWeight(cats,true));
        System.out.println(getCommonWeight(cats,false));
        System.out.println(groupCatsByFirstLetter(cats));

    }
}