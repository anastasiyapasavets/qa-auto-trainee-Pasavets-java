import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteraction {
    Scanner scanner = new Scanner(System.in);
    public void greetUserIfInputGreaterThanSeven (){
        int userNumber;
        do {
            System.out.println("Please enter a number greater than 7:");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! You entered not a number. Please enter an integer greater than 7:");
                scanner.next();
            }
            userNumber = scanner.nextInt();
        } while (userNumber <= 7);
        System.out.println("Hello!");
    }

    public void getGreetingAndUsernameIfNamesMatch (){
        boolean nameMatched = false;
        String userName;
        while (!nameMatched) {
            System.out.print("Enter the name (or enter 'q' to exit): ");
            userName = scanner.next().trim();

            if (userName.equalsIgnoreCase("q")) {
                System.out.println("You refused to enter a name.");
                break;
            }
            if (userName.equalsIgnoreCase("Vyacheslav")) {
                System.out.println("Hello, " + userName);
                nameMatched = true;
            } else {
                System.out.println("There is no such name.");
            }
        }
    }
    public  int [] getAnArrayFromUserInput(){
        int arrayLength;
        do {
            System.out.println("Enter the length of array (must be greater than zero):");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! The length of array must be an integer value and greater than zero: ");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] numbers = new int[arrayLength];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arrayLength; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Element of an array must be an integer: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public void printArrayElementsDivisibleByThree(int[] userNumbers){

        List<Integer> numbers = new ArrayList<>();
        for (int userNumber : userNumbers) {
            if (userNumber % 3 == 0) {
                numbers.add(userNumber);
            }
        }
        if (!numbers.isEmpty()){
            System.out.println("Here are all elements from the array divisible by three:");
            for (int number :numbers) {
                System.out.println(number);
            }
        }
        else System.out.println("There are no elements divisible by three in the array.");
        scanner.close();
    }
}
