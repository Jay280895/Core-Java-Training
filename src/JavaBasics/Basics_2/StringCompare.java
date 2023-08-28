package JavaBasics.Basics_2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringCompare {
    public static void main(String[] args) {
        String name1 = new String("Tony");
        String name2 = "Tony";
//        System.out.println(name1==name2);
//        System.out.println(name1.equals(name2));

/*        String sb= new String("jay");
        sb =sb.concat("Prakash");
        System.out.println(sb);

 */
       int[]  name = {20,40,50,15,56,2,23,232};
        System.out.println(name);

        for (int i =0; i<name.length;i++){
            System.out.println(name[i]);
        }
        ArrayList<Integer> names = new ArrayList();
        names.add(34);
        names.add(786);
        System.out.println(names);







        StringBuffer jp = new StringBuffer("My name is");
        StringBuffer jp2 = new StringBuffer("My name is");
//        jp.append(name1);
//        System.out.println(jp.compareTo(jp2));
//        System.out.println(jp==jp2);

//        if(name1.compareTo(name2)==0) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
        }

/*        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }*/


        //DO NOT USE == to check for string equality
        //Gives correct answer here
/*        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }*/


        //Gives incorrect answer here
/*        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }*/

    }
