package JavaBasics.BasicProgrammes;

public class PrimeNumCheck {
    public static void main(String[] args) {
        int giveNum = 4;
        for (int i = giveNum /2; i >=2;i--) {
            if (giveNum % i == 0) {
                System.out.println("is not prime");
                break;
            } else {
                System.out.println("is prime");
//                break;
            }
        }
    }
}
