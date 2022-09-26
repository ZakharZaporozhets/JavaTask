package entities;

import pattern.Animal;

public class Horse extends Animal {
    private boolean isContestant;

    public void setContestant(boolean contestant) {
        isContestant = contestant;
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    public void setIsReproductive(boolean isReproductive) {
        super.setReproductive(isReproductive);
    }

    @Override
    public String toString() {
        return "entities.Horse{" +
                "isContestant = " + isContestant +
                ", age = " + getAge() +
                ", color = '" + getColor() + '\'' +
                ", isReproductive = " + isReproductive() +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("I am Tommy");
    }
}
