
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            input = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (input.equals("add")) {

                if (first + value > 100) {
                    first = 100;
                } else if (value < 0) {
                } else {
                    first += value;
                }
            }

            if (input.equals("move")) {

                if (value > first) {
                    second += first;
                    first -= first;
                } else if (value + second > 100) {
                    second = 100;
                    first -= value;
                } else {
                    second += value;
                    first -= value;
                }
            }

            if (input.equals("remove")) {

                if (second - value < 0) {
                    second = 0;
                } else {
                    second -= value;
                }
            }
        }
    }
}
