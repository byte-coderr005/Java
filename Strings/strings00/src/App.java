public class App {
    public static void main(String[] args) throws Exception {
        //Strings: Every string is a char array.
        String greetings = "Hey whats up ";
        // is equal to below
        String str = new String("Hey whats up ");
        String txt = "abc.java";
        System.out.println("The length of the txt string is : " + txt.length());
        //String methods
        String txt1 = "Byte_Coderrr is better with java";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());
        //Finding in character in java
        //indexOf()
        String txt2 = "Turbo_burak";
        System.out.println(txt2.indexOf(txt2));
        //CONCENATION = Birlestirme
        String c = "John";
        String d = "Doe";
        System.out.println(c + " " + d);
        //OR
        System.out.println(c.concat(d));

        //STRINGBUILDER IS A CLASS NOT A TYPE. But does same thing.
        StringBuilder abc = new StringBuilder(); //We created Stringbuilder object.
        abc.append("Burak");  //We appended Burak
        abc.append("Ozturk "); //same thing.
        abc.insert(11, "Learning java.");
        System.out.println(abc);
        //String Reversing

        }
    }
}
