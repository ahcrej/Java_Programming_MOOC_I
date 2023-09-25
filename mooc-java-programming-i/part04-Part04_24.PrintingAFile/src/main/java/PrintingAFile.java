
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        // create scanner for reading the file
        
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            
            // read the file until all lines are read
            
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
