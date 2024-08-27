
import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate spesificDate = LocalDate.of(2024, 05,14);
        System.out.println("Spesific Date "+ spesificDate);
    }
}
