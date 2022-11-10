import entities.Cat;
import entities.Dog;
import entities.Horse;
import pattern.Color;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Helper {

    static void enterData() throws InvalidAnimalName {
        Color color;
        int age;
        boolean isReproductive;
        boolean repeat = true;
        List<Object> animals = new ArrayList<>();


        Scanner mainScanner = new Scanner(System.in);
        Scanner inheritScanner = new Scanner(System.in);

        System.out.println("Greetings!");
        while (repeat) {
            System.out.println("""
                    Menu:\s
                    1 - Add an object
                    2 - Display all objects
                    3 - Exit the program""");

            int menuOption = mainScanner.nextInt();
            switch (menuOption) {
                case 1 -> {
                    System.out.println("""
                            Please enter number of instance to create:\s
                            1 - Dog
                            2 - Cat
                            3 - Horse
                            4 - Exit""");


                    int number = inheritScanner.nextInt();
                    switch (number) {
                        case 1 -> {
                            System.out.println("You have selected dog instance!");
                            String name = getValidStringFromScanner();

                            age = getValidIntFromScanner();

                            String colorString = getValidColorFromScanner();
                            color = Color.stringToColor(colorString);

                            isReproductive = getValidBooleanFromScanner();

                            Dog dog = new Dog(name, age, color, isReproductive);
                            animals.add(dog);
                        }
                        case 2 -> {
                            System.out.println("You have selected cat instance!");
                            String name = getValidStringFromScanner();

                            age = getValidIntFromScanner();

                            String colorString = getValidColorFromScanner();
                            color = Color.stringToColor(colorString);

                            isReproductive = getValidBooleanFromScanner();

                            Cat cat = new Cat(name, age, color, isReproductive);
                            animals.add(cat);
                        }
                        case 3 -> {
                            Horse horse = new Horse();
                            System.out.println("You have selected horse instance!");
                            String name = getValidStringFromScanner();
                            horse.setName(name);

                            age = getValidIntFromScanner();
                            horse.setAge(age);

                            String colorString = getValidColorFromScanner();
                            color = Color.stringToColor(colorString);
                            horse.setColor(color);

                            isReproductive = getValidBooleanFromScanner();
                            horse.setReproductive(isReproductive);
                            animals.add(horse);
                        }
                        case 4 -> repeat = false;
                        default -> System.out.println("Non-existent menu option\n");

                    }
                }
                case 2 -> {
                    for (Object c : animals) {
                        System.out.println(c);
                    }
                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("Non-existent menu option\n");
            }
        }
    }

    static String getValidStringFromScanner() throws InvalidAnimalName {
        String textFromScanner = null;
        boolean isCorrect = false;
        Scanner scanner;
        while (!isCorrect) {
            scanner = new Scanner(System.in);
            System.out.println("Please enter animal name:");
            textFromScanner = scanner.next();
            final String s = textFromScanner;
            isCorrect = Pattern.matches(Constant.ONLY_LETTERS_REGEX, textFromScanner);
            if (Constant.BAD_WORDS.stream().anyMatch(i -> i.equals(s))) {
                throw new InvalidAnimalName();
            }
            if (!isCorrect) {
                System.out.println("Animal name is not correct!");
            }
        }
        return textFromScanner;
    }

    private static void isCorrectAge(int age) throws InputMismatchException {
        if (age <= 0 || age > 20) {
            throw new InputMismatchException();
        }
    }

    static int getValidIntFromScanner() {
        int intFromScanner = 0;
        boolean isCorrect = false;
        Scanner scanner;
        while (!isCorrect) {
            scanner = new Scanner(System.in);
            System.out.println("Please enter animal age (0 - 20):");
            try {
                intFromScanner = scanner.nextInt();
                isCorrectAge(intFromScanner);
                isCorrect = true;
            } catch (InputMismatchException inputMismatch) {
                System.out.println("You entered incorrect age!");
            }
        }
        return intFromScanner;
    }

    static String getValidColorFromScanner() {
        String textFromScanner = null;
        boolean isCorrect = false;
        Scanner scanner;
        while (!isCorrect) {
            scanner = new Scanner(System.in);
            System.out.println("Please enter animal color (brown, white, black):");
            textFromScanner = scanner.next();
            final String s = textFromScanner;
            if (Constant.COLORS.stream().noneMatch(i -> i.equals(s))) {
                System.out.println("You entered incorrect color!");
            } else {
                isCorrect = true;
            }
        }
        return textFromScanner;
    }

    static boolean getValidBooleanFromScanner() {
        boolean booleanFromScanner = false;
        boolean isCorrect = false;
        Scanner scanner;
        while (!isCorrect) {
            scanner = new Scanner(System.in);
            System.out.println("Is an animal reproductive? (true/false)");
            try {
                booleanFromScanner = scanner.nextBoolean();
                isCorrect = true;
            } catch (InputMismatchException inputMismatch) {
                System.out.println("You entered incorrect value!");
            }
        }
        return booleanFromScanner;
    }
}
