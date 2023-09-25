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
import java.nio.file.Paths;
import java.lang.StringBuilder;

public class UserInterface {

    private Recipe recipes;
    private Scanner scanner;

    public UserInterface(Recipe recipes, Scanner scanner) {
        this.recipes = recipes;
        this.scanner = scanner;
    }

    public void start() {
        read();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("");

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else {
                processCommand(command);
            }
        }
    }

    public void read() {
        System.out.println("File to read:");
        String file = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.trim().isEmpty()) {
                    stringBuilder.append(line).append(",");
                } else {
                    recipes.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            }

            if (stringBuilder.length() != 0) {
                recipes.add(stringBuilder.toString());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void processCommand(String command) {
        if (command.equals("list")) {
            list();
        }
        if (command.equals("find name")) {
            System.out.println("Searched word:");
            String word = scanner.nextLine();
            searchByName(word);
        }
        if (command.equals("find cooking time")) {
            System.out.println("Max cooking time:");
            int minutes = Integer.valueOf(scanner.nextLine());
            searchByMin(minutes);
        }
        if (command.equals("find ingredient")) {
            System.out.println("Ingredient:");
            String ingredient = scanner.nextLine();
            searchByIngredient(ingredient);
        }
    }

    public void list() {
        System.out.println("Recipes:");
        for (int i = 0; i < recipes.getSize(); i++) {
            String[] parts = recipes.getString(i).split(",");
            String name = parts[0];
            int time = Integer.valueOf(parts[1]);
            System.out.println(name + ", cooking time: " + time);
        }
        System.out.println("");
    }

    public void searchByName(String word) {
        for (int i = 0; i < recipes.getSize(); i++) {
            String[] parts = recipes.getString(i).split(",");
            String name = parts[0];
            int time = Integer.valueOf(parts[1]);
            if (recipes.getString(i).contains(word)) {
                System.out.println(name + ", cooking time: " + time);
            }
        }
    }

    public void searchByMin(int minutes) {
        for (int i = 0; i < recipes.getSize(); i++) {
            String[] parts = recipes.getString(i).split(",");
            String name = parts[0];
            int time = Integer.valueOf(parts[1]);
            if (time <= minutes) {
                System.out.println(name + ", cooking time: " + time);
            }
        }
    }

    public void searchByIngredient(String ingredient) {
        for (int i = 0; i < recipes.getSize(); i++) {
            String[] parts = recipes.getString(i).split(",");
            String name = parts[0];
            int time = Integer.valueOf(parts[1]);

            int numberOfParts = recipes.getString(i).split(",").length;

            boolean hasTerm = false;

            for (int j = 0; j < numberOfParts; j++) {
                String element = parts[j];

                if (element.equals(ingredient)) {
                    hasTerm = true;
                }
            }

            if (hasTerm) {
                System.out.println(name + ", cooking time: " + time);
            }
        }
    }
}
