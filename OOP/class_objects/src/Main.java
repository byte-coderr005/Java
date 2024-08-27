
public class Main {
//Java' Sınıf Özellikleri: Bir sınıfın durumunu belirleyen verileri tutar. Bu alanlar(fields) veya (instance variables)
//olarak adlanadırılır.Sınıf özellikleri, belirli bir nesnenin (object) veya tum sınıfın (class) verilerini 
//depolamak için kullanılır.
//JAVA'da Sınıf özellikleri 2 türe ayrılır.

    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "Red";
        c1.engine = "M60B40";
        c1.model = "E34";
        c1.infoCar();
        c1.startEngine();
        c1.stopEngine();
    }
}
