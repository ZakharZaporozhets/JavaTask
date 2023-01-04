package entities;

import pattern.Animal;
import pattern.AnimalActivity;
import pattern.Color;

public class Dog extends Animal implements AnimalActivity {

    public Dog(String name, int age, Color color, boolean isReproductive) {
        super(name, age, color, isReproductive);
    }

    @Override
    public String toString() {
        return "entities.Dog{" +
                "name = " + getName() +
                ", age = " + getAge() +
                ", color = " + getColor() +
                ", isReproductive = " + isReproductive() +
                "}";
    }

    @Override
    public void voice() {
        System.out.println("Woof\n");
    }
}
