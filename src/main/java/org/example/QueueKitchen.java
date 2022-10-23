package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueKitchen<T> implements AnimalKitchen<T>
{
    Queue<T> animals = new ArrayDeque<>();

    @Override
    public void add(T animal) {
        animals.add(animal);
    }

    @Override
    public void feed() {
         animals.poll();
    }
}
