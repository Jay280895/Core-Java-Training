package JavaBasics.PatternPrinting;

public class FloydPattern {
    public static void main(String[] args) {
        int num = 1;
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {

                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
