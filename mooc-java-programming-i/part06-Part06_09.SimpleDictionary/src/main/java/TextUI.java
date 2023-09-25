/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {

    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            if (!command.equals("add") && !command.equals("search")) {
                System.out.println("Unknown command");
            }

            if (command.equals("add")) {

                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            }

            if (command.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                if (simpleDictionary.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(word));
                }
            }
        }
        System.out.println("Bye bye!");
    }
}
