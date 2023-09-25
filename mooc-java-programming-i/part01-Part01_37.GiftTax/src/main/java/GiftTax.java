
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());
        if (valueOfGift < 5000) {
            System.out.println("No Tax!");

        } else if (valueOfGift >= 5000 && valueOfGift < 25000) {
            // Tax at the lower limit 100 euros, tax rate 8
            double tax = 100 + (valueOfGift - 5000) * 0.08;
            System.out.println("Tax: " + tax);

        } else if (valueOfGift >= 25000 && valueOfGift < 55000) {
            // Tax at the lower limit 1700 euros, tax rate 10
            double tax = 1700 + (valueOfGift - 25000) * 0.10;
            System.out.println("Tax: " + tax);

        } else if (valueOfGift >= 55000 && valueOfGift < 200000) {
            // Tax at the lower limit 4700 euros, tax rate 12
            double tax = 4700 + (valueOfGift - 55000) * 0.12;
            System.out.println("Tax: " + tax);

        } else if (valueOfGift >= 200000 && valueOfGift < 1000000) {
            // Tax at the lower limit 22100 euros, tax rate 15
            double tax = 22100 + (valueOfGift - 200000) * 0.15;
            System.out.println("Tax: " + tax);

        } else {
            // Tax at the lower limit142100 euros, tax rate 17
            double tax = 142100 + (valueOfGift - 1000000) * 0.17;
            System.out.println("Tax: " + tax);

        }
    }
}

/*
        System.out.println("Value of gift?");
        int gift = Integer.valueOf(scan.nextLine());
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 25000) {
            System.out.println("Tax: " + (100 + (gift - 5000)*0.08));
        } else if (gift < 55000) {
            System.out.println("Tax: " + (1700 + (gift - 25000)*0.1));
        } else if (gift < 200000) {
            System.out.println("Tax: " + (4700 + (gift - 55000)*0.12));
        } else if (gift < 1000000) {
            System.out.println("Tax: " + (22100 + (gift - 200000)*0.15));
        } else if (gift >= 1000000) {
            System.out.println("Tax: " + (142100 + (gift - 1000000)*0.17));
        }
    }
}
 */
