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

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            proccessCommand(command);
        }
    }

    public void proccessCommand(String command) {
        if (command.equals("1")) {
            add();
        } else if (command.equals("2")) {
            draw();
        } else if (command.equals("3")) {
            list();
        }
    }
    
    public void add() {
        System.out.println("Write the joker to be added:");
        String joke = scanner.nextLine();
        manager.addJoke(joke);
    }
    
    public void draw() {
        System.out.println(manager.drawJoke());
        
    }
    
    public void list() {
        System.out.println("Printing the jokes");
        manager.printJokes();
    }

}