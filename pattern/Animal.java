package pattern;

public abstract class Animal {
    private int age;
    private String color;
    private boolean isReproductive;

    public Animal(int age, String color, boolean isReproductive) {
        this.age = age;
        this.color = color;
        this.isReproductive = isReproductive;
    }

    public Animal() {

    }


    protected void setAge(int age) {
        this.age = age;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setReproductive(boolean isReproductive) {
        this.isReproductive = isReproductive;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean isReproductive() {
        return isReproductive;
    }

    public abstract void voice();
}
