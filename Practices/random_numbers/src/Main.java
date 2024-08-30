import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100) + 1 ); //Bundada bulduğu sonuca 1 ekleyip getiriyor.
        System.out.println(r.nextInt(10) ); //sadece değeri giriyoruz o seçip getiriyor. rastgele number
    }
}