
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> Strings) {
        if (Strings.size() == 0) {
            return;
        }
        // strings.size()-1 = index of last value in the list, as
        // list index starts at 0 i.e index of the first vlaue is 0
        Strings.remove(Strings.size()-1);
    }
}
