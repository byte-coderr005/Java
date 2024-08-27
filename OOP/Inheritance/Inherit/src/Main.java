public class Main {
    public static void main(String[] args) {
//INHERITANCE
//Kalıtım
//Kalıtım, bir sınıfın başka bir sınıfın özelliklerini ve davranışlarını (fields & methods) miras almasına olanak
//tanır, bu da kodun yeniden kullanılmasını teşvik eder ve sınıflar arsında doğal bir hiyerarşi oluşturur.
//Kalıtımın Temel Kavramları
//1-Ust Sınıf(Parent Class) ve Alt Sınıf (Child Class)
//1.a-Özellikleri ve metotları miras alınan sınıfa üst Sınıf veya Ana sınıf Denir.
//2.a-ust sınıftan miras alan sınıfa Alt sınıf veya Çocuk Sınıf denir.

        Dog dog = new Dog();
        dog.name = "KArabas";
        dog.bark();
        dog.play();
    }
}