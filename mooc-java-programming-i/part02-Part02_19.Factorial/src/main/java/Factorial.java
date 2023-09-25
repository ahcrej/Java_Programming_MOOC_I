
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int result = 1;

        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        // for ( introducing variable, condition, increasing counter);
        for (int i = 1; i <= last; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}