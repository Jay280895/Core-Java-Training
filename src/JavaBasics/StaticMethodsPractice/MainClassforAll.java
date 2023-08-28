package JavaBasics.StaticMethodsPractice;

import java.util.Scanner;

public class MainClassforAll {
    public static void main(String[] args) {
        // Calling non-static methods
        Scanner sc = new Scanner(System.in);
/*        EvenOddNumberFinder evenfind = new EvenOddNumberFinder();
        System.out.println("Enter number to find even/odd in range");
        int num = sc.nextInt();
        evenfind.evenFinder(num);*/

       // Calling Static method
   /*     EvenOddNumberFinder.oddFinder(num);*/

/*        System.out.println(" Enter the number for prime check");
        int numBer= sc.nextInt();
        PrimeNumFinder.primeNumCounter(numBer);*/

/*        System.out.println(" Enter the number of 3 digit to reverse:");
        int num= sc.nextInt();
        ReverseNumber.reverseNum(num);*/

/*        System.out.println("Enter the radius to find circumference of a circle:");
        int radius= sc.nextInt();
        CircleCircuferenceFinder.circleCircumference(radius);
        System.out.println(CircleCircuferenceFinder.circumference);*/

//        InfiniteLoopIndoWhile.doWhileLoop();

//        NumCounting.counting();

/*        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("enter the power value: ");
        int val= sc.nextInt();
        PowerCalculator.powerCal(num,val);*/

  /*      System.out.println("Enter first number");
        int num= sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        BiggestCommonFactorFinder.hcfFinder(num,num2)*/;

        System.out.println(" Enter number: ");
        int num = sc.nextInt();
        FibonaacciSeries.fibonaciSeries(num);
    }



}
