package JavaBasics.StaticMethodsPractice;

public class FibonaacciSeries {
    static void fibonaciSeries(int num) {
        int firstNum = 0, secondNum = 1;
        System.out.println("Fibonacci Series UpTo " + num + ": ");
        for (int i = 1; i <= num; i++) {
            System.out.print(firstNum + " ");
            int nextTerm = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextTerm;
        }
    }
}
