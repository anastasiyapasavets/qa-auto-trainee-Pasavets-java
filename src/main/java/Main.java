import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInteraction userInteraction = new UserInteraction();
        userInteraction.setScanner(scanner);
        System.out.println("Welcome!");

        userInteraction.greetUserIfInputGreaterThanSeven();
        userInteraction.getGreetingAndUsernameIfNamesMatch();
        double[] numbers = userInteraction.getAnArrayFromUserInput();
        userInteraction.printArrayElementsDivisibleByThree(numbers);

        userInteraction.closeScanner();
        System.out.println("Bye!");
    }
}