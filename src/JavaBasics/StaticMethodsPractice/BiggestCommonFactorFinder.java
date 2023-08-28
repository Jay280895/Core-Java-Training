package JavaBasics.StaticMethodsPractice;

public class BiggestCommonFactorFinder {
    static void hcfFinder(int num, int num2) {
        int temp = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && num2 % i == 0) {
                temp = i;

            }
        }
        System.out.println("HCF of your number: " + temp);
    }
}
