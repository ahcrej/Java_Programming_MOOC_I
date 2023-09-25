
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");

            for (String piece : pieces) {
                if (text.equals("")) {
                    run = false;
                } else if (piece.contains("av")){
                    System.out.println(piece);
                }
            }
        }
    }
}
