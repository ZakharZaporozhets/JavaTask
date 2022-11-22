package entities;

import pattern.Animal;
import pattern.AnimalActivity;
import pattern.Color;

public class Horse extends Animal implements AnimalActivity {

    @Override
    public String toString() {
        return "entities.Horse{" +
                "name = " + getName() +
                ", age = " + getAge() +
                ", color = " + getColor() +
                ", isReproductive = " + isReproductive() +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("I am Shelby\n");
    }
}
