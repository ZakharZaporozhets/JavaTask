import entities.Cat;
import entities.Dog;
import entities.Horse;

public class Main {

    public static void main(String[] args) {
        Dog jack = new Dog(5, "green", true, "Labrador Retriever");
        jack.voice();
        Cat muniania = new Cat(1, "grey", true, true);
        muniania.voice();
        Horse shelby = new Horse();
        shelby.voice();

        shelby.setAge(3);
        shelby.setColor("brown");
        shelby.setIsReproductive(false);
        shelby.setContestant(true);

        System.out.println(jack);
        System.out.println(muniania);
        System.out.println(shelby);
    }
}
