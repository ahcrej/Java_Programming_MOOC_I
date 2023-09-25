
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String name = "name";
        String longestName = "x";

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            
            name = parts[0];
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Age average: " + (1.0 * sum / count));
    }
}
