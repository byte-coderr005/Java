import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // User input is if number, word, or character.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character;");
        String input = sc.nextLine();
        if (input.length() == 1) {
            char c = input.charAt(0);
            System.out.println("sc is character : " + c);
        } else if (Character.isDigit(input.charAt(0))) {

            System.out.println("i is number : " + input);
        } else if (Character.isLetter(input.charAt(0))) {
            System.out.println("i is letter : " + input);
        }

    }
}
