//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Project Euler Q1
        //Find the sum of all the multiples of 3 or 5 below 1000.
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }
            System.out.println("Sum of numbers: " + sum);
        }
    }
}