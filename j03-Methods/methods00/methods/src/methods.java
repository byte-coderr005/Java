import java.util.Scanner;

public class methods {
    char a = 'A';
    //Methods
    //Access modifiers: public, private,protected
    /*Access Modifier*/
    public void Yaz(/*PARAMETER*/) {
        /*
           CODE
        */
        //If Method have return type like int,String,char etc. Then we have to write return
        //and method's  variable type.
    }
    //PASS-By-Value
    //In Reference type like String,Array,Object, Java take this parameter outside of method.

    public String pressurePerSurface() {
        int F, P, A;

        Scanner sc = new Scanner(System.in);
        P = sc.nextInt();
        A = sc.nextInt();
        F = P / A;
        return String.valueOf(F);
    }
    //Method OverLoad
    //!!!!!!At least one of the following options must be provided!!!!!!!
    //1-Parameters can be different from each other.
    //2-Parameters type can be different from each other.
    //3-Parameters can be different order.
    public String pressurePerSurface(char a) {
         return String.valueOf(a);//Don't worry too much about this method it was just
        //written casually.
        //dfgdfg
    }
}


