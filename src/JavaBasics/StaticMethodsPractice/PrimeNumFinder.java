package JavaBasics.StaticMethodsPractice;

public class PrimeNumFinder {
    static void primeNumCounter(int num) {
        System.out.println("Prime numbers between 2 to " + num + " are:");
        findPrimeNumbers(num);
    }
    static void findPrimeNumbers(int limit) {
        for (int i = 2; i <= limit; i++) {
            boolean checkPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    checkPrime = false;
                  break;
                }
            }
            if (checkPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

