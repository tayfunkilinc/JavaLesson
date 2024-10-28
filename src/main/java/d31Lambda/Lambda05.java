package d31Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda05 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("AliX");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        //removeIfLengthGreaterThanFive(myList);
        //removeIfElementsStartsWithZorEndsWithf1(myList);
        //removeIfElementsStartsWithZorEndsWithf2(myList);
        removeIfElementsContainsX(myList);
    }
    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    //1) Create a method that deletes elements with more than 5 characters.

    public static void removeIfLengthGreaterThanFive(List<String> myList){
        //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
        // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
        // stream kullanilmadan cagirilir

        myList.removeIf(t-> t.length()> 5); // removeIf stream akis ile kullanilmiyor direk kullaniliyor DIKKAT !!!!! --> tekrarlari kaldirmak icin set yapisina atariz
        System.out.println(myList);// [Ali, Elif, Yusuf, Elif] ----> 5 den fazla olanlar silindi
    }

    //2) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.
    //2) Create a method that deletes elements that start with 'Z' or end with 'f'.

    //1.yol:
    public static void removeIfElementsStartsWithZorEndsWithf1(List<String> myList) {
    myList.removeIf(t-> t.charAt(0)== 'Z' || t.charAt(t.length()-1) == 'f');
        System.out.println(myList); // [Ali, Mustafa]
    }

    //2.yol
    public static void removeIfElementsStartsWithZorEndsWithf2(List<String> myList) {
        myList.removeIf(t-> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList); // [Ali, Mustafa]
    }
    //----------------------------------
    //3 ) “X” karakteri iceren elemanları silen bir method oluşturun.
    //3 ) Create a method that deletes elements containing the “X” character.
    public static void removeIfElementsContainsX(List<String> myList){
        myList.removeIf(t-> t.contains("X")); // buyuk kucuk harf duyarliligi var dikkat
        System.out.print(myList); //[Elif, Yusuf, Elif, Zeynep, Mustafa]
    }


}
