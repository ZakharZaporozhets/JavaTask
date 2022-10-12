package entities;

import pattern.Animal;
import pattern.AnimalActivity;
import pattern.Color;

public class Cat extends Animal implements AnimalActivity {

    private String name;


    public Cat(String name, int age, Color color, boolean isReproductive) {
        super(age, color, isReproductive);
        this.name = name;
    }

    @Override
    public String toString() {
        return "entities.Cat{" +
                "name = " + name +
                ", age = " + getAge() +
                ", color = '" + getColor() + '\'' +
                ", isReproductive = " + isReproductive() +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Meow\n");
    }
}
