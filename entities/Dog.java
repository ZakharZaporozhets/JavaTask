package entities;

import pattern.Animal;
import pattern.AnimalActivity;
import pattern.Color;

public class Dog extends Animal implements AnimalActivity {
    private String name;

    public Dog(String name, int age, Color color, boolean isReproductive) {
        super(age, color, isReproductive);
        this.name = name;
    }

    @Override
    public String toString() {
        return "entities.Dog{" +
                "name = '" + name + '\'' +
                ", age = " + getAge() +
                ", color = '" + getColor() + '\'' +
                ", isReproductive = " + isReproductive() +
                "}";
    }

    @Override
    public void voice() {
        System.out.println("Woof\n");
    }
}
