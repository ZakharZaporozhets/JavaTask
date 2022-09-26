package entities;

import pattern.Animal;

public class Dog extends Animal {
    private String breed;
    public Dog(int age, String color, boolean isReproductive, String breed) {
        super(age, color, isReproductive);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "entities.Dog{" +
                "breed = '" + breed + '\'' +
                ", age = " + getAge() +
                ", color = '" + getColor() + '\'' +
                ", isReproductive = " + isReproductive() +
                 "}";
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }
}
