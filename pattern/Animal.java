package pattern;

public abstract class Animal {
    private int age;
    private Color color;
    private boolean isReproductive;

    public Animal(int age, Color color, boolean isReproductive) {
        this.age = age;
        this.color = color;
        this.isReproductive = isReproductive;
    }

    public Animal() {

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
