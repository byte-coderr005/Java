public class Main {
    public static void main(String[] args) {
        //ABSTRACT
        //Abstract bir metot, bir implementasyon içermez. Normalde metodun gövdsesini oluşturan
        //scopelar, yerine tek bir noktalı virgül ile bırakır. Abstract bir metot içeren bir sınıfın
        //kendisi de abstract olarak tanımlanmalıdır. Bu tür bir sınıf örneklenemez.(new keyworduyle kullanım)
        //FINAL (metotlarda)
        //Final  keywordu kullanan bir metot, override edilemez ya da alt sınıf tarafından gizlenemez.
        // Tüm private metotlar dolaylı olarak finaldır, aynı şekilde final olarak tanımlanan bir sınıfın tüm
        //metotları da final'dır.
        //Native metotlar
        //public,private,protected
        //SYNCHRONIZED
        //Synchronized keyword u bir metodu thread-safe hale getirir. Bir thread, synchronized bir metodu
        //çağırmadan önce, metot statikse sınıf üzerinde static diye belirtilmeldir
        //Bu 2 thread ın aynı anda metodu çalıştırmasını engeller.
        Dog d1 = new Dog();
        d1.sound();
        d1.sleep();
        /*
        Bir abstract sınıf, hem abstract metotlara (uygulama olmadan) hem de somut metotlara
        (uygulama ile) sahip olabilir.
        Bir abstract sınıfın alt sınıfları, tüm abstract metotları uygulamalıdır, aksi takdirde kendileri de
        abstract olarak tanımlanmalıdır.
        Abstract sınıflar doğrudan örneklenemez.
        Abstract sınıflar, constructor'lara, alanlara ve metotlara (hem abstract hem de somut) sahip olabilir.
         */
    }
}