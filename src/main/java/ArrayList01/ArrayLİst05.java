package ArrayLİst05;

import java.util.Arrays;
import java.util.List;

public class ArrayLİst05 {
    public static void main(String[] args) {

        //liste oluşturmanın kısa yolu
        List<Integer> myList = Arrays.asList(1,3,5,7,4);

        // remove(), add(), gibi methodlar kullanılamaz
        //myList.remove(0); //hata
        //myList.add(5); //hata

        myList.set(0, 9); //eklemeyi bu şekilde yapıyoruz
        System.out.println(myList);

        //asList => we can assign the elements directly with this method
        //But asList has some drawbacks. It works like an Array in the background.
        //Therefore, you can not use methods that change the number of elements in the list...=>
        //....=> such as remove(), add() etc.
        //However, you can use methods like set() or size()

        // myList.remove(0); //Exception in thread "main" java.lang.UnsupportedOperationException
        // myList.add(5); //Exception in thread "main" java.lang.UnsupportedOperationException


    }
}
