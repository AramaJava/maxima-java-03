package org.example;

public class CatFactory {

    public static Cat createCat(String name, int weight) throws IncorrectCatWeightException {
        try {
            Cat cat = new Cat (name, weight);
            cat.setAngry(false);
            return cat;
        }
        catch(IncorrectCatWeightException e) {
            Cat cat = new Cat (name, 5);
            cat.setAngry(true);
            return cat;
        }

    }
}
