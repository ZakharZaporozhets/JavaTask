package entities;

import pattern.Animal;
import pattern.AnimalActivity;
import pattern.Color;

import java.time.LocalDate;
import java.time.Period;

public class Cat extends Animal implements AnimalActivity {

    public Cat(String name, LocalDate dateOfBirth, Color color, boolean isReproductive) {
        super(name, dateOfBirth, color, isReproductive);
    }

    @Override
    public int getAgeMappedToHuman(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears() * 8;
    }

    @Override
    public String toString() {
        return "entities.Cat{" +
                "name = " + getName() +
                ", dateOfBirth = " + getDateOfBirth() +
                ", color = " + getColor() +
                ", isReproductive = " + isReproductive() +
                ", ageMappedToHuman = " + getAgeMappedToHuman(getDateOfBirth()) +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Meow\n");
    }
}
