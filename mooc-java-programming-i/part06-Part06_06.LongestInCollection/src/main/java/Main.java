
public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Longest: " + c.longest());
        
        c.add("magneto");
        c.add("mystique");
        c.add("12345678");
        c.add("phoenix");
        
        System.out.println("Longest: " + c.longest());

        
    }
}
