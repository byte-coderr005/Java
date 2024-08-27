public class Main {
    public static void myStaticMethod(){
        System.out.print("Bu bir static metottur.");
    }
    public static void main(String[] args) {
        //STATIC METHODS
        //2 amaci vardir
        //2.1a-Her nesne için ayni isi yapan static bir metod tanımlanır ve bütün nesneler
        //içim ayri ayri olusturulmaz. Böylece bellekten kazanc sağlanir.
        //2.2-Nesne olusturmadan sınıf icerisindeki metodlara erişmektir.
        //1-Nesne oluşturmaya Gerek yoktur. Sınıfın ismi ile doğrudan çağrılabilir.
        //Örneğin 'math' sınıfındaki 'math.sqrt()' metodu bir static metottur ve 'math sınıfının
        //bir nesnesini oluşturmadan çağrılabilir.
        //2-Static Değişkenlere ve Diğer Static Metotlara Erişebilir.
        //Ancak, static olmayan(instance) değişkenlere veya metotlara doğrudan erişemezler.
        //THIS VEYA SUPER keywordlerini kullanamazlar.
        Main.myStaticMethod(); //STATIC METHOD CAGİRMA.
        //Static  method
        int toplam = Calculator.topla(5,10);
        System.out.println("Toplam " +toplam);
        //Static olmayan method
        Calculator c1 = new Calculator();
        int carpim = c1.carp(5,7);
        System.out.println("Carpim " + carpim);

    }
}