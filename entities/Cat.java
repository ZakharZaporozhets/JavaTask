package entities;

import pattern.Animal;

public class Cat extends Animal {

    private boolean isFluffy;


    public Cat(int age, String color, boolean isReproductive, boolean isFluffy) {
        super(age, color, isReproductive);
        this.isFluffy = isFluffy;
    }

    @Override
    public String toString() {
        return "entities.Cat{" +
                "isFluffy = " + isFluffy +
                ", age = " + getAge() +
                ", color = '" + getColor() + '\'' +
                ", isReproductive = " + isReproductive() +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
