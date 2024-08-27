import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //While Loops(döngüsü)
        //Faktoriyel
        System.out.print("Lutfen sayi giriniz");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt(); //nextInt(radix)
        int fak = 1;
        System.out.println(String.format(" %d Sayisinin faktoriyeli",sayi));
        while(sayi > 0){
            fak *= sayi;
            sayi--;
        }
         String a =String.format("%d ",fak);
        System.out.println(a);
        sc.close(); //Bellek yönetimi için gerekli
    }
    }
