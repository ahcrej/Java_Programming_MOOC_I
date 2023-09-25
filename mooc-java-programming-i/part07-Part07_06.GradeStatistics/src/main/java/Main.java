

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
//        String test = "";
//        for (int i = 0; i < 5; i++) {
//            test+="*";
//        }
//        System.out.println(test);

        Scanner scanner = new Scanner(System.in);
        Grade grades = new Grade();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UserInterface ui = new UserInterface(grades, scanner);
        ui.start();
    }
}
