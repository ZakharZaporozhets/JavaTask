package pattern;

public abstract class Animal implements AnimalActivity {
    private String name;
    private int age;
    private Color color;
    private boolean isReproductive;

    public Animal(String name, int age, Color color, boolean isReproductive) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isReproductive = isReproductive;
    }

    public Animal() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color.color;
    }

    public boolean isReproductive() {
        return isReproductive;
    }

}
