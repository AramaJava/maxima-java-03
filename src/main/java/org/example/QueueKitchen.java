package org.example;


import java.util.ArrayList;
import java.util.List;


public class QueueKitchen<T> implements AnimalKitchen<T>
{
    private List<T> animals = new ArrayList<>();

    public ArrayList<T> getListOfAnimals(){
        return (ArrayList<T>) animals;
    }

    @Override
    public void add(T animal) {
        getListOfAnimals().add(animal);
    }

    @Override
    public void feed() {
        getListOfAnimals().remove(0);
    }
}
