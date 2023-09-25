
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Sandbox {

    public static void main(String[] args) {
        String string = "tro";

        if (string.matches("tro(lo)*")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
    }
}
