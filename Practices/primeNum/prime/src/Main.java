import java.util.Scanner;
import java.util.Random;

public  class RandomWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        Random rand = new Random();
        String[] choices = {str,str2};
        int randnum = rand.nextInt(2);
        System.out.println(rand.nextInt(choices[0].length()));




        }
    }
