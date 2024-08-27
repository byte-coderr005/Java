public class Main {
    public static void main(String[] args) {
        //FOR LOOPS
        //For dongusu, belirli bir baslangic noktasindan baslar, belirli bir kosula bagli olarak
        //calisir ve her adimda belirli bir degiskenin degerini guncelleyerek ilerler.


        int[] arr = new int[11];
        int[] arr1 = new int[12];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

        System.out.println();  // Satırları ayırmak için

        // Nested (iç içe) for döngüsü
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = j;
                System.out.print(arr1[j] + " ");
            }
            System.out.println();  // Her i döngüsünden sonra yeni bir satıra geç
        }

    }
}