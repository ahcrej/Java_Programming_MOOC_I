
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recipe recipes = new Recipe();
        
        UserInterface ui = new UserInterface(recipes, scanner);
        ui.start();

    }

}
