package entities;

import pattern.Animal;
import pattern.AnimalActivity;
import pattern.Color;

public class Cat extends Animal implements AnimalActivity {

    public Cat(String name, int age, Color color, boolean isReproductive) {
        super(name, age, color, isReproductive);
    }

    @Override
    public String toString() {
        return "entities.Cat{" +
                "name = " + getName() +
                ", age = " + getAge() +
                ", color = " + getColor() +
                ", isReproductive = " + isReproductive() +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Meow\n");
    }
}
