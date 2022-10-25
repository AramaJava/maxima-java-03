package org.example;

import java.util.*;

public class StackKitchen<T> implements AnimalKitchen<T> {

    public List<T> animals = new ArrayList<>();

    public ArrayList<T> getListOfAnimals(){
     return (ArrayList<T>) animals;
    }

    @Override
    public void add(T animal) {
        getListOfAnimals().add(animal);
    }

    @Override
    public void feed() {
        getListOfAnimals().remove(getListOfAnimals().size()-1);

    }
}
