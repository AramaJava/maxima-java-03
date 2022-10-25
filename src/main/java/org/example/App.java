package org.example;





public class App {

    public static void main(String[] args) throws IncorrectAnimalWeightException {

/*
        Задача:
        Описать класс Dog с методами аналогичными классу Cat, но не имеющего с ним общих предков.

        Описать интерфейс AnimalKitchen — описывает кормление группы любых животных. Методы:
        void add ( экземпляр животного) — добавить животное в очередь на кормление.
        void feed() - покормить очередное животное (исключить его из очереди на кормление).

        Описать два класса QueueKitchen и StackKitchen,
        реализующие кормление животных по принципам FIFO и LIFO соответственно.
        QueueKitchen - по FIFO
        StackKitchen - по LIFO
        Алгоритм манипулирования данными:
        FIFO - это - First In - First Out
        LIFO - это - Last In - First Out


        Подсказка: В каждом классе должно быть определено свойство animals типа ArrayList
*/
        /*


*/
        Dog sharik = new Dog("Шарик",4,true);
        Cat murzik = new Cat("Мурзик", 4, true);
        Cat barsik = new Cat("Барсик", 3, false);
        Cat murka = new Cat("Мурка", 5, true);

        System.out.println("fifo");

        QueueKitchen<Cat> queueKitchen = new QueueKitchen<Cat>();
        queueKitchen.add(sharik);
        queueKitchen.add(murzik);
        queueKitchen.add(barsik);
        queueKitchen.add(murka);

        queueKitchen.feed();
        queueKitchen.feed();

        for (Object animals : queueKitchen.getListOfAnimals()){
            System.out.println(animals);
        }


        System.out.println("lifo");

        StackKitchen<Cat> stackKitchen = new StackKitchen<Cat>();
        stackKitchen.add(sharik);
        stackKitchen.add(murzik);
        stackKitchen.add(barsik);
        stackKitchen.add(murka);

        stackKitchen.feed();
        stackKitchen.feed();

        for (Object animals : stackKitchen.getListOfAnimals()) {
            System.out.println(animals);
        }
    }
}