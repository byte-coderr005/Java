import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please, enter any integer: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i = 0; i <= a.length() - 1; i++)
        {
            System.out.println(i + 1);
        }
    }
    }
