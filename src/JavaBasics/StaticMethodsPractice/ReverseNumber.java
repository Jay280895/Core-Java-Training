package JavaBasics.StaticMethodsPractice;

import java.util.Arrays;

public class ReverseNumber {
  static void reverseNum(int num){
      String num2 = String.valueOf(num);
      System.out.println(num2.charAt(2)+""+num2.charAt(1)+""+num2.charAt(0));
  }
}
