package JavaBasics.BasicProgrammes;

import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to get natural number sum :");
        int inputNum = sc.nextInt();
        int i = 0;
        for (int j = 1; j <= inputNum; j++) {
            i = i + j;
        }
        System.out.println("natural number sum: " + i);
    }
}
