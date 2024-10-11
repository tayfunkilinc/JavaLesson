package ArrayList04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        //Example: Create an Integer list
        //find the closest element in the list
        //[12, 23, 10, 19] ==> 10 and 12

        List<Integer> myList = new ArrayList<>(); //ArrayList Listten kalıtım almış
        //gives more flexibility when we have List interface...

        myList.add(9);
        myList.add(23);
        myList.add(12);
        myList.add(21);

        System.out.println(myList);//[12, 23, 9, 21]

       // myList.sort(null); //küçükten büyüğe sıraladı 1.yol
        Collections.sort(myList);//and we can use sort() from Collection helper class 2.yol
        System.out.println(myList);//[9, 12, 21, 23]

        int minDiff = myList.get(1) - myList.get(0);// this is sample difference to compare other differences in loop

        for (int i =1; i<myList.size(); i++){

          minDiff =  Math.min(minDiff, myList.get(i)- myList.get(i-1));
        }
        System.out.println(minDiff);//2

        for (int i = 1; i <myList.size(); i++) {
            if (myList.get(i)- myList.get(i-1) == minDiff) {
                System.out.println(myList.get(i) + "and" + myList.get(i - 1));
            }
        }


    }
}
