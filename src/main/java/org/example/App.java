package org.example;

//import static org.example.Birthday.*;

public class App {

    public static void main(String[] args) throws IncorrectCatWeightException {
        //System.out.printf("\nВозраст в днях: %d", getAge(1896, 10, 20));
        //System.out.printf("\nСлед. днюха через %s дней будет: %s",returnRound(getAge(1896, 10, 20),1000), nextBirthday(1896,10,20));
        // Barsik.setWeight(-10);

        Cat murzik = CatFactory.createCat("Murzik", 10);
        Cat barsik = CatFactory.createCat("Barsik", -3);

        System.out.printf("\nКот %s - %s", murzik.getName(), (murzik.isAngry() ? "злой" : "добрый"));
        System.out.printf("\nКот %s - %s", barsik.getName(), (barsik.isAngry() ? "злой" : "добрый"));
    }
}
