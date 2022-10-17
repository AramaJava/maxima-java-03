package org.example;

//import static org.example.Birthday.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class App {

    public static <collection> void main(String[] args) throws FileNotFoundException, IncorrectCatWeightException {
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


/*
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
        }*/

       /* int[] ticketNumbers = new int[1000];
        int[] winTickets = new int[10];
        for (int i = 0; i < ticketNumbers.length; i++) {
            int value = 1000000 + (int) Math.round(1000000 * Math.random());
            ticketNumbers[i] = value;
            if (i % 100 == 0) {
                winTickets[i / 100] = value;
            }
        }
        for (int winTicketsNumber : winTickets) {
            System.out.println(winTicketsNumber);

        }*/

      /*  String text ="Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }*/
   /*     ArrayList<String> todoList = new ArrayList<>(){{
            add("Первое дело");
            add("Второе дело");
        }};
        todoList.add("Третье дело");
        todoList.remove(0);
        for (String item : todoList) {
            System.out.println(item);
        }


        HashSet<String> words =  new HashSet<>();
        words.add("Первое слово");
        words.add("Второе слово");
        words.add("Первое слово");

        for (String word : words){
            System.out.println(word);
        }

        System.out.println(words.contains("Второе слово"));*/

/*

        List<String> listA = new ArrayList<>();
        listA.add("element 0");
        listA.add("element 1");
        listA.add("element 2");
        int size = listA.size();

        String element0= listA.get(0);
        String element1= listA.get(1);
        String element2= listA.get(2);


        for (String s : listA) {
            System.out.println(s);
        }

        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(300, 200, 100));
        listB.sort((o1, o2) -> o2.compareTo(o1));
        Collections.sort(listB);

        //remove all numbers more than 200
        listB.removeIf(i -> i>200);
        listB.stream().filter(i -> i<=200);


        for (int s : listB) {
            System.out.println(s);
        }
*/

      /*  List<Integer> listZ = new ArrayList<>();
        listZ.add(5);
        listZ.add(7);
        listZ.add(45);
        listZ.add(null); // можно добавлять нул в коллекцию
        listZ.add(50);
        listZ.add(77);
        System.out.println(listZ);
        listZ.add(5,87); // добавить в позицию 5 номер 87
        System.out.println(listZ);
        listZ.remove(2);
        System.out.println(listZ);*/

    /*    ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Fortress");
        String res = list.get(0);
        System.out.println(list);*/

     /*   ArrayList<Double> c = new ArrayList<Double>(7);
        for (int i = 0; i < 10; i++) {
            double z = new Random().nextGaussian();
            c.add(z);
        }

        for (double d: c) {
            System.out.printf("%.2f ", d);
        }

        int positiveNum = 0;
        int size = c.size();

        Iterator<Double> it = c.iterator();
        while(it.hasNext()) {
            if (it.next()>0) positiveNum++;
            else it.remove();

            }
        System.out.printf("%nКоличество положительных: %d ", positiveNum);
        System.out.printf("\nКоличество НеПоложительных: %d ", size - positiveNum);
        System.out.println("\nПоложительная коллекция");
        for (Double d : c) {
            System.out.printf("%.2f ", d);
        }
*/

        ArrayList<Character> a = new ArrayList<Character>(5);
        System.out.println("коллекция пуста " + a.isEmpty());
        for(char c = 'a'; c< 'h'; c++){
            a.add(c);
        }
        char ch = 'a';
        a.add(6,ch);
        System.out.println(a);




  /*      Dog sharik = new Dog("Шарик",4,true);
        System.out.println(sharik.isAngry());
*/


    }
}