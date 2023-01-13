package entities;

import pattern.Animal;
import pattern.AnimalActivity;

import java.time.LocalDate;
import java.time.Period;

public class Horse extends Animal implements AnimalActivity {

    @Override
    public String toString() {
        return "entities.Horse{" +
                "name = " + getName() +
                ", age = " + getDateOfBirth() +
                ", color = " + getColor() +
                ", isReproductive = " + isReproductive() +
                ", ageMappedToHuman = " + getAgeMappedToHuman(getDateOfBirth()) +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("I am Shelby\n");
    }

    @Override
    public int getAgeMappedToHuman(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears() * 10;
    }
}
