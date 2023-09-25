
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPos = 0;
        int sumPos = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                countPos = countPos + 1;
                sumPos = sumPos + number;
            }
        }
        if (countPos == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (1.0 * sumPos / countPos));
        }
    }
}
