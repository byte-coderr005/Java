import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan girdi alınıyor
        System.out.print("a değerini girin: ");
        int a = scanner.nextInt();

        System.out.print("b değerini girin: ");
        int b = scanner.nextInt();

        System.out.print("n değerini girin (serinin kaç terimini görmek istediğinizi girin): ");
        int n = scanner.nextInt();

        int series = a;

        // Seriyi oluşturmak ve ekrana yazdırmak için döngü
        for(int i = 0; i < n; i++) {
            series += (Math.pow(2, i) * b); // Her adımda 'b' değeri 2'nin kuvveti ile çarpılır
            System.out.println("s(^" + i + ") = " + series);
        }

        scanner.close();
    }
}
