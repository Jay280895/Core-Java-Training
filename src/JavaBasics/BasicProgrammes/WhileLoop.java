package JavaBasics.BasicProgrammes;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add marks and 0 to stop adding marks:");
        int input;
        do {
            System.out.println("enter the marks");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? \n 1.yes \n 2.no");
            input = sc.nextInt();
        } while (input == 1);

    }
}
