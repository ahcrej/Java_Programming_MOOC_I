/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
import java.util.ArrayList;

public class Grade {

    private ArrayList<Integer> grades;

    public Grade() {
        this.grades = new ArrayList<>();
    }

    public void add(int number) {
        this.grades.add(number);
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            sum += this.grades.get(i);
        }
        return sum;
    }

    public void average() {
        if (this.grades.size() == 0) {
            System.out.println("Point average all: -");
        } else {
            System.out.println("Point average (all): "
                    + (1.0 * sum()) / this.grades.size());
        }
    }

    public int passedSum() {
        int passedSum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            if (this.grades.get(i) >= 50) {
                passedSum += this.grades.get(i);
            }
        }
        return passedSum;
    }

    public int passedCount() {
        int passedCount = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            if (this.grades.get(i) >= 50) {
                passedCount++;
            }
        }
        return passedCount;
    }

    public void passing() {
        if (passedCount() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): "
                    + (1.0 * passedSum()) / passedCount());
        }
    }

    public void passingPercentage() {
        if (passedCount() == 0) {
            System.out.println("Pass percentage: -");
        } else {
            System.out.println("Pass percentage: " + (100.0 * passedCount() / this.grades.size()));
        }
    }

    public void distribution() {
        String gradeZero = "";
        String gradeOne = "";
        String gradeTwo = "";
        String gradeThree = "";
        String gradeFour = "";
        String gradeFive = "";

        if (this.grades.isEmpty()) {

        } else {
            for (int i = 0; i < this.grades.size(); i++) {
                if (this.grades.get(i) >= 90) {
                    gradeFive += "*";
                }

                if (this.grades.get(i) >= 80 && this.grades.get(i) < 90) {
                    gradeFour += "*";
                }

                if (this.grades.get(i) >= 70 && this.grades.get(i) < 80) {
                    gradeThree += "*";
                }

                if (this.grades.get(i) >= 60 && this.grades.get(i) < 70) {
                    gradeTwo += "*";
                }

                if (this.grades.get(i) >= 50 && this.grades.get(i) < 60) {
                    gradeOne += "*";
                }

                if (this.grades.get(i) < 50) {
                    gradeZero += "*";
                }
            }
        }

        System.out.println("Grade distribution:");
        System.out.println("5: " + gradeFive);
        System.out.println("4: " + gradeFour);
        System.out.println("3: " + gradeThree);
        System.out.println("2: " + gradeTwo);
        System.out.println("1: " + gradeOne);
        System.out.println("0: " + gradeZero);
    }
}
