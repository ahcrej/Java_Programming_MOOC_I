
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");

            for (String piece : pieces) {
                if (text.equals("")) {
                    run = false;
                }
            }
            System.out.println(pieces[0]);
        }
    }
}
