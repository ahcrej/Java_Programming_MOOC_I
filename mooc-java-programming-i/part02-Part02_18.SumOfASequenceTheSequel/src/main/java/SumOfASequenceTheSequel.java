
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int result = 0;

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        // for ( introducing variable, condition, increasing counter);
        for (int i = first; i <= last; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
