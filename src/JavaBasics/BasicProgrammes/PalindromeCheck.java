package JavaBasics.BasicProgrammes;

import java.util.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {
        String givenString = "radar2";
        String reverseString = "";

        for (int j = givenString.length() - 1; j >= 0; j--) {
            reverseString = reverseString + givenString.charAt(j);
        }
        if (reverseString.equals(givenString)) {
            System.out.println("is palindrome");
        } else {
            System.out.println(" is not palindrome");
        }

    }
}
