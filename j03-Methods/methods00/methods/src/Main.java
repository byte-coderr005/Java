public class Main {
    static void islem(int dizi[])
    {
        for(int i=0;i<dizi.length;i++){
            dizi[i] = i *i;
        }
    }
    public static void main(String[] args) {
        int dizi[] = new int[] {2,4,6};
        islem(dizi);
        for(int i:dizi){
            System.out.println(i);
        }
    }
}
