import com.itech.CountryFinder;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CountryFinder countryFinder = new CountryFinder();
        System.out.println("Enter CountryCode");
        String countryCode = scanner.next();
        System.out.println(countryFinder.findCountry(countryCode));
    }
}
