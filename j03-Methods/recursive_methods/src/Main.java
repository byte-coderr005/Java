public class Main {
    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static int factorial(int n) {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //Recursive call:
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
    //Recursive Methods
        //Recursion bir metodun belli bir şart sağlanana kadar kendini sürekli calistirmasina
        //denir.
        int number = 5;
        int result = factorial(number);
        System.out.println(number + "! = " +result);
        int n = 6;
        int re = fibonacci(n); //sdfsdfsf
        System.out.println("fibo(" + n + ") = " + re);
    }

}