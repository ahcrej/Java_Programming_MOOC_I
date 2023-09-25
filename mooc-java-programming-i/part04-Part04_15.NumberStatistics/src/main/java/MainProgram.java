
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        System.out.println("Enter numbers:");

        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        int value = 0;

        while (true) {
            value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                break;
            } else if (value % 2 == 0) {
                even.addNumber(value);
            } else if (value % 2 != 0) {
                odd.addNumber(value);
            }
            statistics.addNumber(value);
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
