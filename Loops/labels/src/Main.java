public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        loop1: for (int i = 0; i < 10; i++) {
            System.out.println("counter : " +i);
            loop2: for (int j = 0; j < 10; j++) {
                System.out.println("counter : " +j);
                if(j < 3) {
                    System.out.println("Continue loop2");
                    continue loop2;
                }else{
                    System.out.println("break loop1");
                    break loop1;
                    //Labelllar: DOnguleri belirli yerlerde sonlandırmak ve devam ettirmek için kullanılır.

                }
            }
        }
    }
}