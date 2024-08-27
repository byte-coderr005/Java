import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String vehicles = "Vehicle namess : ";
        String b = "bmw";
        Pattern pattern = Pattern.compile(vehicles);
        Matcher matcher = pattern.matcher(b);
//        if (matcher.find()) {
//            System.out.println("Desen bulundu!");
//        } else {
//            System.out.println("Ddesen bulunamadı");
//        }
        //1."matches();"
        //Regex nedir ?
        //Bir string ifade içinde belirli bir kalıbı eşleştirmek için tanımlanan bir modeldir.
        String t = "1234";
        boolean isMatch = t.matches("\\d+"); //True, Tümüyle rakamlardan olusuyor.
        //2."split();"
        String t2 = "Java,C#,C";
        String[] prog_lang = t2.split(",");
        //belli bir desene göre stringi böler ve dizi döner.
        //3."repleceAll();"
        String t3 = "java_coffee";
        String replacet =t3.replaceFirst("java","Java");
        //baska bir stringle degistirir.
        String email = "ex@honda.com";
        boolean isValid = email.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,6}$");
        System.out.println("email gecerli mi ? " +isValid);
        //^[\\w.-]+": ^[\\w.-]+: Dizge, bir veya daha fazla harf,rakam,ve sembolik ifadeler ile başlar.
        // Bu, e-posta adresinin kullanıcı adı kısmını temsil eder.

        //@[a-zA-Z\\d.-]+':'  @ sembolünden sonra bir veya daha fazla harf, rakam, nokta veya tire karakteri gelir.
        // Bu, alan adının başlangıç kısmını temsil eder.
        //\\.[a-zA-Z]{2,6}$: Alan adı sonrasında bir nokta (.) ve ardından 2 ila 6 karakter
        // uzunluğunda bir uzantı gelir (örneğin .com, .net).
    }
}