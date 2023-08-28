package JavaBasics.StaticMethodsPractice;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the
// end it should display the count of positive, negative and zeros entered.
public class NumCounting {
    static Scanner sc = new Scanner(System.in);
    static int input;
    static int countve = 0;
    static int count_ve = 0;
    static int count0 = 0;

    static void counting() {
        do {
            System.out.println("Enter the number:");
            int inputNumber = sc.nextInt();
            if (inputNumber > 0) {
                System.out.println("input is positive: " + inputNumber);
                countve++;
                System.out.println("Positive number count is: " + countve + "\n");
            } else if (inputNumber < 0) {
                System.out.println("input is negative: " + inputNumber);
                count_ve++;
                System.out.println("Negative number count is: " + count_ve + "\n");
            } else {
                System.out.println("input is zero: " + inputNumber);
                count0++;
                System.out.println("Zero count is: " + count0 + "\n");
            }

            System.out.println("To Enter number again type 1");
            input = sc.nextInt();

        } while (input == 1);
    }
}
