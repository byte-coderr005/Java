 class sprJava {
    //Super: 'super' anahtar kelimesi, bir alt sınıfın kendi üst sınıfına başvurması için kullanılır.
    //USt sınıfın metotlarını veya (constructor) çağırmak için kullanılır.
    sprJava()
    {
        System.out.println("Running version of JDK 22 is installed.");
    }
   void  Coffee()
    {
        System.out.println("Kahveler içildi.");
    }
    class OOP extends sprJava{
        OOP(){
            super(); //sprJava sınıfının yapıcısını çağırdı.
        }
        @Override
        void Coffee(){
            super.Coffee(); //sprJava sınıfındaki Coffee metodunu çağırır.
        }
    }
//KAlıtım Turleri
//Tekli Kalıtım: Bır alt sınıf,bir üst sınıftan miras alır.
//Çok katmanlı Kalıtım: (Multilevel Inheritance):Bır sınıf başka bir sınıftan türetilmiş bir sınıftan türetilir.
class mercedes extends sprJava{
    // ...
}

class nissan extends sprJava {
    // ...
}
}
//Java, sınıflarla çoklu kalıtımı desteklemez.(yani bir sınıf doğrudan birden fazla sınıftan miras alamaz). 
//Bu, belirsizlikleri (Elmas Problemi) önlemek içindir.Java arayüzlerle (interfaces) çoklu kalıtıma izin verir.
