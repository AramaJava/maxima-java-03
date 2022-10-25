package org.example;

public class QueueKitchen<T> extends AnimalKitchenMain<T>
{
     @Override
    public void feed() {
        getAnimals().remove(0);
    }
}
