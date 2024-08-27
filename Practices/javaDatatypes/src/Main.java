import java.util.Scanner;
public class Main {
    public static void Check()
    {
        Scanner scanner = new Scanner(System.in);
         long n = scanner.nextLong();
        if (n < -9223372036854775808L || n > 9223372036854775807L) { // I checked for ASCII values.
            System.out.println(n + " Hiç bir degere uymuyor.");
        } else {
            System.out.println(n + " Su Degerlere uyuyor;");

            if (n >= -128 && n <= 127) {
                System.out.println("* byte");
            }
            if (n >= -32768 && n <= 32767) {
                System.out.println("* short");
            }
            if (n >= -2147483648 && n <= 2147483647) {
                System.out.println("* int");
            }
            if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                System.out.println("* long");
            }
            scanner.close();
        }
    }
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz.");
        Check();
    }
}