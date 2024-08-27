abstract class Animal {
    //Abstract method (body'si yok)
    abstract void sound();
    //Normal method
    public void sleep(){
        System.out.println("Sleep");
    }
}
class Dog extends Animal {
    public void sound(){
        System.out.println("Bark");
    }
    //abstract void eat(); //abstract olmayan sınıflarda abstract method kullanılamaz.
}
