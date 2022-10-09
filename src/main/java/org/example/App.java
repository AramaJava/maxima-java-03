package org.example;

//import static org.example.Birthday.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        //System.out.printf("\nВозраст в днях: %d", getAge(1896, 10, 20));
        //System.out.printf("\nСлед. днюха через %s дней будет: %s",returnRound(getAge(1896, 10, 20),1000), nextBirthday(1896,10,20));
        // Barsik.setWeight(-10);

   /*     try {
            Cat murzik = CatFactory.createCat("Murzik", 10);
            Cat barsik = CatFactory.createCat("Barsik", -3);
            System.out.printf("\nКот %s - %s", murzik.getName(), (murzik.isAngry() ? "злой" : "добрый"));
            System.out.printf("\nКот %s - %s", barsik.getName(), (barsik.isAngry() ? "злой" : "добрый"));

        } catch (IncorrectCatWeightException e) {
            throw new IncorrectCatWeightException("Неправильно введен вес!");
        }*/



       TextTransformer textTransformer = new TextTransformer();
        try {
            textTransformer.transform("input.csv","out.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }


        StreamTransformer streamTransformer = new StreamTransformer();
        try {
            streamTransformer.transform("input.csv","out.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }

    }
}
