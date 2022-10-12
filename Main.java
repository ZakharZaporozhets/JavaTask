import entities.Cat;
import entities.Dog;
import entities.Horse;
import pattern.Animal;
import pattern.Color;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        enterData();
    }

    static void enterData() {
        Color color;
        int age;
        boolean isReproductive;
        boolean repeat = true;

        Scanner scanner = new Scanner(System.in);
        while (repeat) {
            System.out.println("""
                    Greetings!
                    Please enter number of instance to create:\s
                    1 - Dog
                    2 - Cat
                    3 - Horse
                    4 - Exit""");

            int number = scanner.nextInt();
            switch (number) {
                case 1 -> {
                    System.out.println("You have selected a Dog instance!\nPlease enter name of the dog: ");
                    String name = scanner.next();
                    System.out.println("Please enter the age of the dog: ");
                    age = scanner.nextInt();
                    System.out.println("Please enter color of the dog (brown, white, black): ");
                    String colorString = scanner.next();
                    color = Color.stringToColor(colorString);
                    System.out.println("Is the dog reproductive? (true/false)");
                    isReproductive = scanner.nextBoolean();
                    System.out.println();
                    Dog dog = new Dog(name, age, color, isReproductive);
                    System.out.println(dog);
                    dog.voice();
                }
                case 2 -> {
                    System.out.println("You have selected a Cat instance!\nPlease enter name of the cat: ");
                    String name = scanner.next();
                    System.out.println("Please enter the age of the cat: ");
                    age = scanner.nextInt();
                    System.out.println("Please enter color of the cat (brown, white, black): ");
                    String colorString = scanner.next();
                    color = Color.stringToColor(colorString);
                    System.out.println("Is the cat reproductive? (true/false)");
                    isReproductive = scanner.nextBoolean();
                    System.out.println();
                    Cat cat = new Cat(name, age, color, isReproductive);
                    System.out.println(cat);
                    cat.voice();
                }
                case 3 -> {
                    Horse horse = new Horse();
                    System.out.println("You have selected a Horse instance!\nPlease enter name of the horse: ");
                    String name = scanner.next();
                    horse.setName(name);
                    System.out.println("Please enter the age of the horse: ");
                    age = scanner.nextInt();
                    horse.setAge(age);
                    System.out.println("Please enter color of the horse (brown, white, black): ");
                    String colorString = scanner.next();
                    color = Color.stringToColor(colorString);
                    horse.setColor(color);
                    System.out.println("Is the horse reproductive? (true/false)");
                    isReproductive = scanner.nextBoolean();
                    horse.setReproductive(isReproductive);
                    System.out.println();
                    System.out.println(horse);
                    horse.voice();
                }
                case 4 -> {
                    repeat = false;
                }
            }

        }
    }
}
