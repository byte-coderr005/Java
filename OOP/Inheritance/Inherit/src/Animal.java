public class Animal {
    String name;
    void eat() {
        System.out.println("eat");
    }
}
//Child Class
//Extends: Java' da bir alt sınıf 'extends' anahtar kelimesi kullanılarak oluşturulur.
//Example:
class Dog extends Animal {
    void bark(){
        System.out.println("bark");
    }
    void play(){
        System.out.println("play");
    }//@OVerride ile işaretlendi.
    @Override    
    void eat()
    {
        System.out.println("Dog eats bone.");
    }
}
//Method Overriding:
//Bir alt sınıf, üst sınıftan miras aldığı bir metodun davranışını değiştirebilir veya genişletebilir
//buna method overriding denir.
