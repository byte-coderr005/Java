public class Main {
    public static void main(String[] args) {
    //do {
        //1-ilk olarak do blogu icindeki kodlar calistirilir. bu Blok, dogru yada yanlıs kontrol
        //etmeden bir kez calisir.

    //}while (true);
    //2-do blogundaki kodlar calistiktan sonra 'while' icindeki kosul kontrol edilir.
        //Eger bu kosul 'true' ise dongu tekrar basa doner ve do blogu icindeki kodlar
        //yeniden calistirilir. false ise dongu sonlanır.
      int a = 150, y = 30, i = 0;
        do {
            i++;
            a = a - 20;
            y = y + 50;

      }while(a > y);
        System.out.println("Dongu 2 kere calisti " + i);
    }
}