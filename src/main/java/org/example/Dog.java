package org.example;

public class Dog extends Cat {
    public Dog(String name, int weight, boolean isAngry) throws IncorrectAnimalWeightException {
        super(name, weight, isAngry);
    }



        /*private String name;
        private int weight;
        private boolean isAngry;



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) throws IncorrectAnimalWeightException{
            if (weight < 0) {
                throw new IncorrectAnimalWeightException("Вес введен некорректно!");
            }
            this.weight = weight;
        }

        public boolean isAngry() {
            return isAngry;
        }

        public void setAngry(boolean angry) {
            isAngry = angry;
        }
        @Override
        public String toString() {
            return getName();
        }*/
}


