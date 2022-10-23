package org.example;

import java.util.*;

public class StackKitchen<T> implements AnimalKitchen<T> {

    Deque<T> animals = new ArrayDeque<>();

    @Override
    public void add(T animal) {
        animals.push(animal);
    }

    @Override
    public void feed() {
            animals.pop();

    }
}
