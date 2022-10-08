package org.example;

public class Cat {
    private String name;
    private int weight;
    private boolean isAngry;

    public Cat(String name, int weight) throws IncorrectCatWeightException {
        this.name = name;
        setWeight(weight);
        System.out.printf("\nСоздан кот с именем %s и весом %d", this.name, this.weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws IncorrectCatWeightException{
        if (weight < 0) {
            throw new IncorrectCatWeightException(" <-- Вес кота введен некорректно!");
        }
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }


}

