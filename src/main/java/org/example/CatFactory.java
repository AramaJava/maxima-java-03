package org.example;

public class CatFactory {
    public static Cat createCat(String name, int weight) throws IncorrectAnimalWeightException {
        try {
            return new Cat(name, weight, false);
        } catch (IncorrectAnimalWeightException e) {
            return new Cat(name, 5, true);
        }

    }
}
