package d13array.arraylist_methotcreation;

import java.util.Arrays;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

         //shortcut to create a list

        List<Integer> myList = Arrays.asList(1,3,5,7,4);

        //asList => we can assign the elements directly with this method
        //But asList has some drawbacks. It works like an Array in the background.
        //Therefore, you can not use methods that change the number of elements in the list...=>
        //....=> such as remove(), add() etc.
        //However, you can use methods like set() or size()

       // myList.remove(0); //Exception in thread "main" java.lang.UnsupportedOperationException
       // myList.add(5); //Exception in thread "main" java.lang.UnsupportedOperationException

        myList.set(0, 9);
        System.out.println(myList);

        //If you want to use some methods provided by list and if you will not change number of elements
        //...you can use asList....

    }

}
