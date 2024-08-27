
public class Main {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[4];
        //first element
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
//        String[] soz = new String[10];
//        soz[0] = "LS-5";
//        int[] yaslar = new int[] { 1, 3, 5, 7 };
//        char[] ch = new char[10];
        String[][] names = {{"Mr. ","Mrs. ", "Ms." },
        {"Johnson","Smith"}};
        System.out.println(names[0][2] + names[1][1]);
        System.out.println(arr.length);
        //Dizi Listeleme
        int arr3[] = {1,2,3,4,5};
        for(int i : arr3)
        {
            System.out.print(i + " ");
        }


    }
    }