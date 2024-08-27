import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Var Keyword
        //Automatically infers the type of a variable.
        //Can only be used with local variables, not with class or instance variables.
        //1-Initial assignment is mandatory.

        var x = 10;
        //2-Variables defined with var cannot be assigned a null value.
        //var c = null; // This is not allowed.
        //3-Variables defined with var cannot be assigned values of different types.

        var isimler = new ArrayList<String>(); //
        //Final Keyword
        //Used for values that cannot be changed (similar to const in C#).

        final double P = 3.14;



    }
}