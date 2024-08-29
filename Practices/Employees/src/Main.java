import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); //SET Benzersiz eleman tutar. Yani bir elemanı bir kere
        //ekleyebiliriz.
        set.add("John Doe, age 30 department: IT, salary 50000");
        set.add("Alice Smith age: 28, departmant H&R, salary 45000");
        set.add("Bob Johnson age: 35, department: Finance, salary 60000");
        System.out.println("Set : " + set);
    }
}