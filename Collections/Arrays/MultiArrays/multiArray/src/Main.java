//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matris = new int[3][3];
        matris[0][0] = 1;

        int[][] matris2 = {{1,3,5},{7,9,11},{2,4,6}};
        //How to write 2-dimensional Array
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}