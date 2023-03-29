import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Speedle!");
        System.out.println("This is a game where you guess the guess the top speed of an animal or guess which animal has the top speed");
        Scanner userInput = new Scanner(System.in);

        selection(userInput);

        int taskOfTheDay = (int) ((Math.random() * (34 - 1)) + 1);
        ArrayList<Animals> animalChoice = getAnimalList();
        System.out.println("Today's puzzle is "+taskOfTheDay);
        String todayPuzzle = getAnimalByPuzzleId(animalChoice, taskOfTheDay);
        System.out.println("Guess the speed of: "+todayPuzzle);

    }
    public static ArrayList<Animals> getAnimalList() {
        ArrayList<Animals> animalChoice = new ArrayList<>();
        animalChoice.add(new Animals(1, "Peregrine Falcon", 389.0, 242.0));
        animalChoice.add(new Animals(2, "Frigatebird", 153.0, 95.0));
        animalChoice.add(new Animals(3, "Rock dove", 148.9, 92.5));
        animalChoice.add(new Animals(4, "Cheetah", 120.7, 75.0));
        animalChoice.add(new Animals(5, "Sailfish", 109.19, 67.85));
        animalChoice.add(new Animals(6, "Swordfish", 97.0, 60.0));
        animalChoice.add(new Animals(7, "Ostrich", 90.0, 56.0));
        animalChoice.add(new Animals(8, "Pronghorn", 88.5, 55.0));
        animalChoice.add(new Animals(9, "Horsefly", 145.0, 90.0));
        animalChoice.add(new Animals(10, "Tiger beetle", 6.8, 4.2));
        animalChoice.add(new Animals(11, "Black Marlin", 132.0, 82.0));
        animalChoice.add(new Animals(12, "Yellowfin tuna", 76.0, 47.0));
        animalChoice.add(new Animals(13, "Perentie", 40.23, 25.0));
        animalChoice.add(new Animals(14, "Green Iguana", 35.41, 22.0));
        animalChoice.add(new Animals(15, "Black Mamba", 22.53, 14.0));
        animalChoice.add(new Animals(16, "Komodo Dragon", 20.92, 13.0));
        animalChoice.add(new Animals(17, "Emu", 48.0, 30.0));
        animalChoice.add(new Animals(18, "Roadrunner", 43.0, 27.0));
        animalChoice.add(new Animals(19, "Domestic Horse", 88.5, 54.99));
        animalChoice.add(new Animals(20, "Blackbuck", 80.0, 50.0));
        animalChoice.add(new Animals(21, "Impala", 80.0, 50.0));
        animalChoice.add(new Animals(22, "Lion", 80.0, 50.0));
        animalChoice.add(new Animals(23, "Hare", 80.0, 50.0));
        animalChoice.add(new Animals(24, "Jackrabbit", 72.0, 45.0));
        animalChoice.add(new Animals(25, "Kangaroo", 71.0, 44.0));
        animalChoice.add(new Animals(26, "Greyhound", 70.0, 43.0));
        animalChoice.add(new Animals(27, "Zebra", 70.0, 43.0));
        animalChoice.add(new Animals(28, "Coyote", 65.0, 40.0));
        animalChoice.add(new Animals(29, "Tiger", 64.0, 40.0));
        animalChoice.add(new Animals(30, "Hyena", 60.0, 37.0));
        animalChoice.add(new Animals(31, "Giraffe", 60.0, 37.0));
        animalChoice.add(new Animals(32, "Grizzly Bear", 48.0, 35.0));
        animalChoice.add(new Animals(33, "Warthog", 55.0, 34.0));
        animalChoice.add(new Animals(34, "Human", 47.56, 29.55));
        return animalChoice;
    }
    public static String getAnimalByPuzzleId(ArrayList<Animals> animalChoice, int taskOfTheDay) {
        for (Animals specific : animalChoice) {
            if (specific.getPuzzleId() == taskOfTheDay) {
                return specific.getAnimal();
            }
        }
        return null;
    }

    private static void selection(Scanner userInput){
        System.out.println("Selections");
        System.out.println("Animal(a) or speed(s)?");
        String openingChoice = userInput.nextLine();
        if (openingChoice.equalsIgnoreCase("a")) {
            System.out.println("Animal selected");
        }
        else {
            System.out.println("Speed selected!");
            String speedMetric;
            while (true) {
                System.out.println("Do you want km/h(k) or mph(m)?");
                speedMetric = userInput.nextLine();
                if (speedMetric.equalsIgnoreCase("m")) {
                    System.out.println("Miles per hour selected");
                    break;
                } else if (speedMetric.equalsIgnoreCase("k")) {
                    System.out.println("Kilometres per hour selected");
                    break;
                } else {
                    System.out.println("Wrong input. Try again");
                }
            }
        }
    }
}