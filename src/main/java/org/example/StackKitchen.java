package org.example;


public class StackKitchen<T> extends AnimalKitchenMain<T> {



    @Override
    public void feed() {
        getAnimals().remove(getAnimals().size()-1);
    }
}
