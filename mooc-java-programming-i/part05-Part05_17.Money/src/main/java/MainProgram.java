
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        
        Money firstMoneyObject = new Money(3, 20);
        Money secondMoneyObject = new Money(2, 50);
        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
        firstMinusSecond.cents();
        System.out.println(firstMinusSecond);
        
//        Money firstMoneyObject = new Money(10, 0);
//        Money secondMoneyObject = new Money(2, 0);
//        Money tennerMinusTwoEuros = firstMoneyObject.minus(secondMoneyObject); 
//        System.out.println(tennerMinusTwoEuros);
        
        
    }
}
