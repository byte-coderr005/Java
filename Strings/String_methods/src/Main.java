public class Main {
    public static void main(String[] args) {
        System.out.println("STRING METHODS");

        String s = "Burak";
        System.out.println("dizenin uzunlugu "+ s.length());
        System.out.println ("belirtilen dize iceriyor m " +s.contains("u"));
        System.out.println("belirtilen dize bosmu   " +  s.isEmpty());
        System.out.println("butun harfleri buyuk yap "+s.toUpperCase());
        System.out.println("butun harfleri kucuk yap "+s.toLowerCase());
        System.out.println("//Karakter dizisine cevirir. "+s.toCharArray());
        System.out.println("s.replace (Belirtilen harfin yerine yeni harf) :" + s.replace('r','c'));
        //KArakter dizisine cevirir. Belirli islemnler yapmak icin güzel.
        System.out.println("TRIM ASCII deki standart boslukları kaldırır(bas,son) " + s.trim());
        System.out.println(" Belirtilen yeri kes ve print." + s.substring(0,3));
        System.out.println("Bastaki ve sondaki bosluk kaldır. UNICODE icin " + s.strip());
        String s1 = "byte";
        System.out.println("Belirtilen string ilk dizeyle aynı mı " +s1.equals(s));
        System.out.println(("Belirtilen string ilk dizeyle aynı mı nocaseControl " + s1.equalsIgnoreCase(s)));



    }
}