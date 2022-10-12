package entities;

import pattern.Animal;
import pattern.AnimalActivity;
import pattern.Color;

public class Horse extends Animal implements AnimalActivity {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "entities.Horse{" +
                "name = " + name +
                ", age = " + getAge() +
                ", color = '" + getColor() + '\'' +
                ", isReproductive = " + isReproductive() +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("I am Shelby\n");
    }
}
