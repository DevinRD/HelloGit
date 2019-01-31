import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println("Hello World!");
        System.out.print("Enter something: ");
        userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
    }

}
