/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class PaymentCard {

    private double balance;

    //keyword final means value of the variable cannot be modified
    //after it has been set for the first time
    private final double affordable;
    private final double hearty;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.6;
        this.hearty = 4.6;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
//        if ((this.balance - 2.60) < 0) {
//            this.balance = this.balance;
//        } else {
//            this.balance -= 2.60;
//        }
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }
    }

    public void eatHeartily() {
//        if ((this.balance - 4.60) < 0) {
//            this.balance = this.balance;
//        } else {
//            this.balance -= 4.60;
//        }
        if (this.balance >= hearty) {
            this.balance -= hearty;
        }
    }

    public void addMoney(double amount) {
//        if (amount < 0) {
//
//        } else {
//            if ((this.balance + amount) >= 150) {
//                this.balance = 150;
//            } else {
//                this.balance += amount;
//            }
//        }
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}
