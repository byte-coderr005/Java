public class Main {
    public static void main(String[] args) {
        int num; //Her seferinde tekrar tanımlamasın diye
        for(int i = 1; i <= 10; i++){ //satir için
         for(int j = 1; j <= 10; j++){//sütun için
             num = i * j; //çarpim degeri
             System.out.print(num + "\t");
         }
         System.out.println(); // Her satırın sonunda yeni satıra geç.
     }
    }
}