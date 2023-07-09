
public class Main {

    public static void main(String[] args) {

        UserInteraction userInteraction = new UserInteraction();

        System.out.println("Welcome!");

        userInteraction.greetUserIfInputGreaterThanSeven();
        userInteraction.getGreetingAndUsernameIfNamesMatch();
        int[] numbers = userInteraction.getAnArrayFromUserInput();
        userInteraction.printArrayElementsDivisibleByThree(numbers);

        System.out.println("Bye!");
    }
}