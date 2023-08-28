package JavaBasics.PatternPrinting;

public class PalindromicNumberPattern {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int k=i;k<=5;k++){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k);
            }
            for (int l=2; l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
