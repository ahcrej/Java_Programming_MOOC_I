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

    private Grade grades;
    private Scanner scanner;

    public UserInterface(Grade grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                this.grades.average();
                this.grades.passing();
                this.grades.passingPercentage();
                this.grades.distribution();
                break;
            } else {
                processCommand(input);
            }
        }
    }

    public void processCommand(int command) {
        if (command >= 0 && command <= 100) {
            grades.add(command);
        } else {

        }
    }
}
