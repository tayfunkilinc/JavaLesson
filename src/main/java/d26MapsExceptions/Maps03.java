package d26MapsExceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        //get methodunun kullanimi
        //list claslarinda kullanirken index yazarsiniz degeri gelir
        //map classlarinda kullanirken key veririz value gelir

        //ornek 1: Size verilen bir String’deki her kelimenin, o String’de kac defa kullanildigini
        //      gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)

        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        String s = "Ali nasilsin Ali.";// burda Ali kelimesinin 1 defa gorunur java gozunden -- sondaki . isareti olmassa iki defa var diye gorur
        //ali = 2 , nasilsin 1  bu sekilde cikti verilmesi isteniyor buda map yapisidir bos bir map olusturup icine bu sekilde kayir yapacagiz

        s = s.replaceAll("\\p{Punct}", "").toLowerCase(); // burda regex yapisini kullandik regex e calis
        //burda noktadan kurtulup kucuk harfe cevirdik tamamini
        System.out.println(s); //ali nasilsin ali

        String[] words = s.split(" ");// tum bosluklardan kelimeleri bolup dizi icine kaydini yaptik
        System.out.println(Arrays.toString(words)); // [ali, nasilsin, ali]
        //bundan sonrasi dongu ile saydirip map icine kaydini yapacagiz

        HashMap<String , Integer> myMap = new HashMap<>();
        System.out.println(myMap); // {}

        for (String w : words){
            //ilk dongude map`te ali olmadigindan null gelecek
            Integer isThere = myMap.get(w); // bu geri donus yapacak o nedenle donus degeri belirliyoruz // burda Integer oldugu icin null kabul etti
            // isThere icine her zaman map icindeki key`in value degeri kaydedilir bunun durumuna gore kayitlar guncelleniyor
            // primitive ler null kabul etmez wrapper lar null kabul eder
            if (isThere == null) {
                myMap.put(w,1); // map`te ali yok 1 tane eklenecek
            }else {
                myMap.put(w, isThere + 1);
            }
            System.out.println(myMap); //{nasilsin=1, ali=2}

            //ODEV: Size verilen bir String’deki her harfin o String’de kac defa kullanildigini gosteren kodu yaziniz.
            //example 2: Write the code that shows how many times each letter in a given String is used in that String.
            //      “Hello” ==> H=1, e=1, l=2, o=1



        }
    }
}
