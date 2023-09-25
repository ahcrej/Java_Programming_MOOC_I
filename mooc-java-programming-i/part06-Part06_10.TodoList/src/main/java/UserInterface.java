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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            processCommand(input);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        } else {

        }
    }
    
    public void add() {
        System.out.println("To add: ");
        String task = scanner.nextLine();
        list.add(task);
    }
    
    public void list() {
        list.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int remove = Integer.valueOf(scanner.nextLine());
        list.remove(remove);
    }
}
