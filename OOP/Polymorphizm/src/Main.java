public class Main {
    public static void main(String[] args) {
        ////Method overriding occurs when a method in a subclass is defined with the same name, return type, and parameters
        // as a method in its superclass. In Java, method overriding happens at runtime,
        // means the method that gets called is determined during runtime.
        Animal myAnimal = new Animal(); // Animal instance.
        Animal myDog = new Dog();       // Dog instance from Animal.
        Animal myCat = new Cat();       // Cat instance from Animal.

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}