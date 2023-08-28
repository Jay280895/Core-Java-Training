package JavaBasics.StaticMethodsPractice;

import java.util.Scanner;
/*Two numbers are entered by the user, x and n.
 Write a function to find the value of one number raised to the power of another i.e. xn.*/
public class PowerCalculator {
    static Scanner sc = new Scanner(System.in);
    static int newOutput = 1;

    static void powerCal(int num, int val) {
        for (int i = 1; i <= val; i++) {
            newOutput = newOutput * num;
            System.out.println(newOutput);
        }
    }
}
