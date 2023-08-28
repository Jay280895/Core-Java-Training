package JavaBasics.PatternPrinting;

public class SolidRhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 6; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
