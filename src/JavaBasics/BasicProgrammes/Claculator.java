package JavaBasics.BasicProgrammes;

import java.util.Scanner;

public class Claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers for calculation: ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        System.out.println(" Choose the calculation: \n 1.ADD \n 2.Subtract \n 3.Multiply  \n 4.Divide \n 5.Remainder");
        int calChoose = sc.nextInt();
        switch (calChoose) {
            case 1:
                System.out.println("Add of your numbers is: " + num_1 + num_2);
                break;
            case 2:
                System.out.println("Subtract of your number is: " + (num_1 - num_2));
                break;
            case 3:
                System.out.println("Multiplication of your number is: " + (num_1 * num_2));
                break;
            case 4:
                if (num_1 > 0 && num_2 > 0) {
                    System.out.println("Division of your number is: " + (num_1 / num_2));
                } else {
                    System.out.println("Invalid division");
                }
                break;
            case 5:
                if (num_1 > 0 && num_2 > 0) {
                    System.out.println("Remainder of your number is: " + (num_1 % num_2));
                }else {
                    System.out.println("Not able to find Remainder");
                }
                break;
            default:
                System.out.println("Does not recognise the calculation");
        }
    }
}
