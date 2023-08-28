package JavaBasics.PatternPrinting;

public class PatternReverseRtTringle {
    public static void main(String[] args) {
        String str = "*";
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        //By reverting outer loop
        for (int i=9;i>=1;i--){
            for (int k=1;k<=i;k++){
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
