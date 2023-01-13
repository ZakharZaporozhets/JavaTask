package pattern;

import java.time.LocalDate;

public abstract class Animal implements AnimalActivity {
    private String name;
    private LocalDate dateOfBirth;
    private Color color;
    private boolean isReproductive;

    public Animal(String name, LocalDate dateOfBirth, Color color, boolean isReproductive) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
        this.isReproductive = isReproductive;
    }

    public Animal() {

    }

    public abstract int getAgeMappedToHuman(LocalDate dateOfBirth);

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setReproductive(boolean isReproductive) {
        this.isReproductive = isReproductive;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getColor() {
        return color.color;
    }

    public boolean isReproductive() {
        return isReproductive;
    }

}