package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalKitchenMain<T> implements AnimalKitchen<T>{

    private List<T> animals = new ArrayList<>();

    public ArrayList<T> getAnimals(){
        return (ArrayList<T>) animals;
    }

    @Override
    public void add(T animal) {
        getAnimals().add(animal);
    }

    @Override
    public void feed() {

    }

}
