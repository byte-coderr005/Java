//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

try
{
    int bolum = 10 / 0;
}
catch(ArithmeticException e)
{
    System.out.printf("There is a error: " + e.getMessage());
}
try{
    int[] dizi = {1,2,3};
    System.out.println(dizi[3]);
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.printf("There is a error: " + e.getMessage());
}
catch(ArithmeticException e)
{
    System.out.printf("There is a arithmetic error:  " + e.getMessage());
}
finally
        {
            System.out.println("This scope always run");
        }
    }
}