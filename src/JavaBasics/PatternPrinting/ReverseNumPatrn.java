package JavaBasics.PatternPrinting;

public class ReverseNumPatrn {
    public static void main(String[] args) {
        int k=9;
        for (int i=0;i<=k;i++){
            for (int j= 1; j<=k-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
