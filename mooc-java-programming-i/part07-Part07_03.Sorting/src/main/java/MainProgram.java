
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // indices:      0  1  2  3  4
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int lowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (lowest > array[i]) {
                lowest = array[i];
            }
        }
        return lowest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int lowest = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (lowest > table[i]) {
                lowest = table[i];
            }
        }

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == lowest) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int hold = 0;
        hold = array[index1];
        array[index1] = array[index2];
        array[index2] = hold;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
