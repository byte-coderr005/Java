public class Main {
    public static void main(String[] args) {
        //Array tanimla
        String[] cars = {"bmw","mercedes","audi","vw"};
        int[] sayi = new int[cars.length];
        //Yanlis Array tanimi
        //int values[5];
        int[] values = new int[5];
        //2D arrays
        int[][] matrix1 = new int[3][3]; //3 e 3 luk bir matris tnımladık.
        //Array e deger ata.
        cars[0] = "nissan";
        sayi[0] = 1;

        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[0][2] = 3;
        matrix1[1][0] = 4;
        matrix1[1][1] = 5;
        matrix1[1][2] = 6;
        matrix1[2][0] = 7;
        matrix1[2][1] = 8;
        matrix1[2][2] = 9;
        for (int i = 0; i<matrix1.length; i++)
        {
            for (int j = 0; j<matrix1[0].length; j++)
            {
                System.out.print(matrix1[i][j] + " "); //ekrana yazdırdık.
            }
            System.out.println(); // yeni satıra geçmesi için
        }
    }
}
