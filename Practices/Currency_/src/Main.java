import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("TL->E", 1 / 37.0);
        exchangeRates.put("TL->USD", 1 / 33.0);
        exchangeRates.put("USD->E", 1.1);
        exchangeRates.put("E->USD", 0.91);
        exchangeRates.put("E->TL",37.0);
        exchangeRates.put("USD->TL",33.0);
        System.out.println("What currency do you use? (E for Euro, USD for Dollar, TL for Turkish Lira)");
        String crrH = sc.nextLine();


        System.out.println("How much money do you have?");
        double exval = sc.nextDouble();
        sc.nextLine();
        System.out.println("Please enter the currency to convert to (E for Euro, USD for Dollar, TL for Turkish Lira):");
        String currency = sc.nextLine();

        String conversionKey = crrH + "->" + currency;
        if (exchangeRates.containsKey(conversionKey)) {
            double exValue = exval * exchangeRates.get(conversionKey);
            System.out.println("Exchanged Money: " + exValue + " " + currency);
        } else {
            System.out.println("Currency conversion not available for the selected currencies.");
        }
    }
    }