package JavaBasics.PatternPrinting;

public class PatrnRotatedTrianlge {
    // pattern rotated 180
    public static void main(String[] args) {
        int p = 8;
        for (int i = 1; i <= 8; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //other way to do it

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= p - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
