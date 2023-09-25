
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userOne = "alex";
        String passOne = "sunshine";

        String userTwo = "emma";
        String passTwo = "haskell";

        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();

        if ((user.equals(userOne) && pass.equals(passOne)) || (user.equals(userTwo) && pass.equals(passTwo))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
