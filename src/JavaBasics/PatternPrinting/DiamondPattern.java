package JavaBasics.PatternPrinting;

public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= j; k--) {
                System.out.print("*");
            }
            for (int k=4;k>=j;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
