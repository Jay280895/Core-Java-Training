package JavaBasics.StaticMethodsPractice;


public class EvenOddNumberFinder {

    static void oddFinder(int num) {
        for (int i = 2; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i+", ");
            }
        }
        System.out.println();

    }

    void evenFinder(int num) {
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }
}
