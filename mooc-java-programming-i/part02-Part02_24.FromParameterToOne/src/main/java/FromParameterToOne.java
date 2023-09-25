

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number) {
        
        int count = 0;
        
        for (int i = 0; i < number; i++) {
            count = number - i;
            System.out.println(count);
        }
    }
}
