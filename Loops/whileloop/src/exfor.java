
import java.util.Scanner;

public class exfor {
    public static void main(String[] args) {
    //#Example1
        //For döngüsü kullanarak 1'den 10'a kadar olan sayıları ekrana yazdıran bir program yazın.
        //for(int i = 0; i <= 10; i++)
        //{
        //    System.out.println(i);
        //}
        //#endregion
    //#Example 2
        //While döngüsü kullanarak 0'dan 20'ye kadar olan çift sayıları ekrana yazdıran bir program yazın.
        //int num = 0;
        //while(num < 20)
        //{
        //    if(num % 2 == 0 ){
        //    System.out.println(num);
        //    }
        //    num++;
        //}
    //#endregion
    //#Example3 
    System.out.println("Please enter a number for descendate to 0:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    while(num >= 0)
    {
        System.out.println(num);
        num--;
    }
    //#endregion
    //#region

    }


}
