/**
 * Created by tmcbride on 4/20/2015.
 */

import java.util.Random;

public class ExerciseTwo {
    //variables for Exercise 4
    private int time = 30;
    private int distance = 20;

    // Exercise 4 page 90 of PDF
    public double calculateVelocity() {
        return (double) time / distance;
    }

    public void showIncrementers() {
        int i = 0;

        while (i < 10) {
            System.out.println("I: " + i++);
        }
    }

    // Code for Exercise 7 on Page 94 of PDF
    public String flipCoin() {
        Random rand = new Random();
        boolean coin = rand.nextBoolean();

        if (coin == true) {
            return "Heads";
        } else {
            return "Tails";
        }

    }

    public void binaryOperations() {
        int f = 0x55;
        int h = 0xAA;
        int c = 0xAA;

        System.out.println("F: " + Integer.toBinaryString(f));
        System.out.println("H: " + Integer.toBinaryString(h));
        System.out.println("C: " + Integer.toBinaryString(c));

        System.out.println("F & H: " + Integer.toBinaryString(f & h));
        System.out.println("F | H: " + Integer.toBinaryString(f | h));
        System.out.println("F ^ H: " + Integer.toBinaryString(f ^ h));
        System.out.println("~F " + Integer.toBinaryString(~f));
        System.out.println("~H " + Integer.toBinaryString(~h));
        System.out.println("C ^ H: " + Integer.toBinaryString(c ^ h));
    }


}
