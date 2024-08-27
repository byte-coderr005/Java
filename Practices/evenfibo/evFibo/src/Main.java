public class Main {
    public static void main(String[] args) {
        //Even fibonacci series
        int[] fibo = new int[34];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 34; i++) {
        {
            fibo[i] = fibo[i-1] +  fibo[i-2];
            if(fibo[i] % 2 == 0 ) {
                System.out.println(fibo[i]);
            }
        }
        }
    }
}