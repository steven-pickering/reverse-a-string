import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        reverseInputtedString();
    }

    // takes a string input from user, reverses the input and prints it back out
    private static void reverseInputtedString() {
        System.out.println("Enter a string > ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);


    }
}
