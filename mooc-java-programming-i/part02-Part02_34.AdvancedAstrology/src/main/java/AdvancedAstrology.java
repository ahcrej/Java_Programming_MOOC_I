
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int count = 0;

        for (int i = 1; i <= size; i++) {
            count = size - i;
            printSpaces(count);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int count = 0;

        for (int i = 1; i <= height; i++) {
            count = height - i;
            printSpaces(count);
            printStars(i * 2 - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(5);
        System.out.println("---");
    }
}
