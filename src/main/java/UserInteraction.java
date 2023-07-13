import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteraction {

    private String output;
    private Scanner scanner;

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void greetUserIfInputGreaterThanSeven (){
        double userNumber;
        do {
            System.out.println("Please enter a number greater than 7:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error! You entered not a number. Please enter an integer greater than 7:");
                scanner.next();
            }
            userNumber = scanner.nextDouble();
        } while (userNumber <= 7);
        output = "Hello!";
        System.out.println(output);
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
                output = "Hello, " + userName;
                System.out.println(output);
                nameMatched = true;
            } else {
                output = "There is no such name.";
                System.out.println(output);
            }
        }
    }

    public double[] getAnArrayFromUserInput(){
        int arrayLength;
        do {
            System.out.println("Enter the length of array (must be greater than zero):");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! The length of array must be an integer value and greater than zero: ");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        double[] numbers = new double[arrayLength];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arrayLength; i++) {
            while (!scanner.hasNextDouble()) {
                output = "Error! Element of an array must be an integer: ";
                scanner.next();
            }
            numbers[i] = scanner.nextDouble();
        }
        return numbers;
    }

    public void printArrayElementsDivisibleByThree(double[] userNumbers){
        StringBuilder outputBuilder = new StringBuilder();

        List<Double> numbers = new ArrayList<>();
        for (double userNumber : userNumbers) {
            if (userNumber % 3 == 0) {
                numbers.add(userNumber);
            }
        }
        if (!numbers.isEmpty()){
            System.out.println("Here are all elements from the array divisible by three:");
            for (double number : numbers) {
                outputBuilder.append(number).append("\n");
            }
            output = outputBuilder.toString();
            System.out.print(output);
        }

        else {
            output = "There are no elements divisible by three in the array.";
            System.out.println(output);
        }
    }

    public String getOutput(){
        return output;
    }

    public void closeScanner() {
        scanner.close();
    }
}
