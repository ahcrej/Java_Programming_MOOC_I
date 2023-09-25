
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//        }
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            input = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (input.equals("add")) {
                first.add(value);
            }

            if (input.equals("move")) {
                if (value > first.contains()) {
                    value = first.contains();
                }
                first.remove(value);
                second.add(value);
            }

            if (input.equals("remove")) {
                second.remove(value);
            }
        }
    }
}
