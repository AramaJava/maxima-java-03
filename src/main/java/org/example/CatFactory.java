package org.example;

public class CatFactory {
    public static Cat createCat(String name, int weight) throws IncorrectCatWeightException {
        try {
            return new Cat(name, weight);
        } catch (IncorrectCatWeightException e) {
            Cat cat = new Cat(name, 5);
            System.out.println(e.getMessage());
            cat.setAngry(true);
            return cat;
        }

    }
}
