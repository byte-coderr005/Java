import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDate);

        LocalDateTime parsedDate = LocalDateTime.parse("2024-08-04 14:30:00", formatter);
        System.out.println("Parsed date and time: " + parsedDate);
    }
}
