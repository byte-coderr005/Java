public class car {
    //ATTRIBUTES
    //Instance Variables(Ornek dEgiskenleri)
    //Herbir nesne için ayrı bir deger tasır.
    String color; //Instance Variable (Ornek Degiskeni)
    String model; //Instance Variable (ORnek Degiskeni)
    String engine;
    int year;
    //Sınıf Degiskenleri (Class Variables)
    //STATIC anahtar kelimesi ile işaretlenir.
    //Tum nesneler tarafından paylaşılır, yanı sınıfın tüm örneklerinde aynı degere sahiptir.
    //Bir nesne oluşturulmadan bile doğrudan sınıf adı üzerinden erişilebilir.
    static int numberOfTires = 4;
    
    public void infoCar()
    {
        System.out.println("Car model is " + model +"Car Engine is " + engine + " Car color: " + color);
    }
    public void startEngine()
    {
        System.out.println("Engine started.");
    }
    public void stopEngine(){
        System.out.println("Engine Stopped.");
    }

}
