public final class Main {
    public static void main(String[] args) {
        //1-Automatic Type Casting (Widening Conversion)
        //Lower-capacity data types can be converted to higher-capacity data types.
        //This conversion is done automatically, so no additional code is required.
        int s = 100;
        long s_long = s;
        double s_double = s;
        System.out.println("Long tipinde sayi" + s_long);
        System.out.println("Double tipinde sayi" + s_double);
        //2-Explicit Type Casting (Narrowing Conversion)
        //Used to convert higher-capacity data types to lower-capacity data types.
        //Since there is a risk of data loss, it is performed manually.
        //The conversion must be explicitly specified within parentheses.

        double sayi_double = 9.78;
        int sayi = (int) sayi_double;
        System.out.println("Ondalikli sayi " + sayi_double);
        System.out.println("Tam sayi : " + sayi);

        //Converting a string to an int.
        String d = "6";
        int y = Integer.valueOf(d);//parseInt e göre daha yavastır.

        int y1 = Integer.parseInt(d);
        //parseInt returns a value of type int, whereas valueOf returns an Integer object.
        //Converting an int value to a string.
        int k = 29;
        //1- valueOf()
        String str = String.valueOf(k);
        //2-toString()
        String str1 = Integer.toString(k);

    }
}