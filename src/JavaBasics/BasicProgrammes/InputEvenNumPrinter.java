package JavaBasics.BasicProgrammes;

import java.util.Scanner;

public class InputEvenNumPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find all even till range: ");
        int inputNum= sc.nextInt();
        for (int i=2; i<=inputNum; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
