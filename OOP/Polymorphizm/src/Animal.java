public class Animal {
    void sound() {
        System.out.println("Hayvan bir ses çıkarıyor");
    }
}

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Köpek havlıyor");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Kedi miyavlıyor");
        }
    }
