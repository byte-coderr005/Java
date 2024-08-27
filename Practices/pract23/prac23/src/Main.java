import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter A side of a triangle: ");
        String a = sc.nextLine();
        int A = Integer.parseInt(a);
        System.out.print("Please, enter B side of a triangle: ");
        String b = sc.nextLine();
        int B = Integer.parseInt(b);
        System.out.print("Please, enter C side of a triangle: ");
        String c = sc.nextLine();
        int C = Integer.parseInt(c);
        if (A + B > C && A + C > B && B + C > A) {
            int area = (A + B + C) / 2;

            int sum_multp = area * (area - A) * (area - B) * (area - C);
            double triangleArea = Math.sqrt(sum_multp);
            System.out.println("Triangle area is: " + triangleArea);
        }
        else{
            System.out.println("Not a triangle");
        }
    }
}