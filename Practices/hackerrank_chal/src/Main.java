import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Stdin Stdout II
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();


        System.out.println("String: " +myString);
        System.out.println("Double: " +myDouble);
        System.out.println("Int: " +myInt);


    }
}
