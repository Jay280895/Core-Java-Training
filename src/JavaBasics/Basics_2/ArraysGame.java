package JavaBasics.Basics_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class MonksDigital {
    String name;
    int idNo;
    String address;
}

public class ArraysGame {
    public static void main(String[] args) {

        MonksDigital emp1 = new MonksDigital();
        emp1.name = "jay Prakash";
        emp1.idNo = 345;
        emp1.address = "Ghaziabad";

        MonksDigital emp2 = new MonksDigital();
        emp2.name = "Prakash";
        emp2.idNo = 3453;
        emp2.address = "Ghaziabad-001";

        MonksDigital emp3 = new MonksDigital();
        emp3.name = "Niraj";
        emp3.idNo = 33345;
        emp3.address = "Ghaziabad-002";

        MonksDigital emp4 = new MonksDigital();
        emp4.name = "Oxy home";
        emp4.idNo = 345456;
        emp4.address = "Ghaziabad-004";

        MonksDigital[] empDetails = new MonksDigital[4];
        empDetails[0] = emp1;
        empDetails[1] = emp2;
        empDetails[2] = emp3;
        empDetails[3] = emp4;
        for (int i = 0; i < empDetails.length; i++) {
            System.out.println(empDetails[i].name + "\n" + empDetails[i].address + "\n" + empDetails[i].idNo + "\n");
        }

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Jay");
        namesList.add("Prakash");
        namesList.add("Niraj");
        namesList.add("Kumar");
        namesList.add(1, "Avinash");
        System.out.println(namesList.indexOf("Avinash"));


        LinkedList<Integer> roll= new LinkedList<>();
        roll.add(90);
        roll.add(79);
        roll.add(80);
        roll.add(802);
        roll.add(8054);
        System.out.println(roll.indexOf(79));


        // non-generic array
        ArrayList aList = new ArrayList<>();
        aList.add(45);
        aList.add("hii");
        aList.add("how are you");
        System.out.println(aList);

        //generic type array
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        Collections.sort(list);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();


        for(String fruit:list) {
            System.out.println(fruit);
        }
        System.out.println();


        ArrayList<String> list2=new ArrayList<String>();
        list2.add("Ravi");
        list2.add("Vijay");
        list2.add("Ravi");
        list2.add("Ravi");
        list2.add("Ajay");
        Iterator<String> itr2=list2.iterator();
        itr2.forEachRemaining(a->
        {
            System.out.println(a);
        });
        System.out.println(list2.size());

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int index = 2;
        int element = numbers.get(index);
        int element2 = numbers.indexOf(40);
        System.out.println("Element at index " + index + " : " + element+"\n"+" index of 40: "+element2);
}
}
