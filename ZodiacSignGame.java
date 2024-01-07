import java.util.Scanner;

public class ZodiacSignGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] zodiacSigns = {
                "Capricorn", "Aquarius", "Pisces", "Aries",
                "Taurus", "Gemini", "Cancer", "Leo",
                "Virgo", "Libra", "Scorpio", "Sagittarius"
        };

        System.out.print("Enter your birthdate (MM/DD): ");
        String birthdate = scanner.nextLine();

        int month = Integer.parseInt(birthdate.substring(0, 2));
        int day = Integer.parseInt(birthdate.substring(3, 5));

        String zodiacSign = zodiacSigns[(month - 1) % 12 + (day >= (month == 3 ? 21 : 20) ? 1 : 0)];

        System.out.println("Your Zodiac sign is: " + zodiacSign);

        scanner.close();
    }
}
