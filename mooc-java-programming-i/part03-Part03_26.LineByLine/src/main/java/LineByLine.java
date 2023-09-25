
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");

            for (String piece : pieces) {
                if (text.equals("")) {
                    run = false;
                } else {
                    System.out.println(piece);
                }
            }
        }
    }
}
