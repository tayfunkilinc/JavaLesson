package d25Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {
        //1) Map’ler sozluk gibidir. Aciklamalidir. orn: Ali = 13
        // .Map’ler collections degildir. Ordan miras almaz -- sekildende hatirla bir baglanti yok
        //2) Sol taraf yani key’ler tekrarsizdir. Value tarafi tekrarli olabilir.
        //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
        //4) Map’in elemanlarina komple ‘entry set’ (giris elemani) denir.

        //Map nasil olusturulur?  -- collection baglantisi olmadigi icin add kullanilmaz
        //put():Bir key-value çiftini map’e ekler.
        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.

        HashMap<String, Integer> myMap = new HashMap(); // <String, Integer> bu sekilde iki data tipini ayni anda yazabildik
        myMap.put("Ali Can", 13);
        myMap.put("Veli Han", 18);
        myMap.put("Ayse Kaya", 15);
        myMap.put("Fatma Yilmaz", 19);


        System.out.println(myMap); // {Fatma Yilmaz=19, Ali Can=13, Veli Han=18, Ayse Kaya=15}  -- burda suslu paranteze gecti
        myMap.put("Ali Can", 25); // key tekrarli kullanildiginda
        System.out.println(myMap); // {Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15} -- tekrarli key kullanilinca eski kaydi gunceller ekleme yapmaz

        //Sadece ‘key’ degerlerini nasil alabiliriz?
        //keySet(): Map’teki tüm key’lerin bir set’ini döndürür.Set’in sırası rastgeledir. o yuzden Set class turunde degisken icinde saklayabilirz
        Set<String> keySide = myMap.keySet();
        System.out.println(keySide); //[Fatma Yilmaz, Ali Can, Veli Han, Ayse Kaya] // String verilerden olusan bir set donderdi

        //Sadece ‘value’ degerlerini nasil alabiliriz?
        //values():Map’teki tüm value’ların bir collection’ını döndürür.Collection’ın sırası rastgeledir.

        Collection<Integer> valueSide = myMap.values();
        System.out.println(valueSide); //[19, 25, 18, 15]

        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir

        Integer age = myMap.get("Ali Can"); // bu gidecek Ali Can valuesunu getirecek
        System.out.println(age); //25


        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?
        //Example 1: What is the average age of the people in myMap?
        int total = 0;
        Collection<Integer> ages = myMap.values(); // value degerlerini aldik
        System.out.println(ages); // [19, 25, 18, 15]

        for (int w : ages){
            total += w;
        }
        System.out.println("total = " + total); //total = 77
        int average = total / ages.size();
        System.out.println("average = " + average); //average = 19
        System.out.println("--------------------------");

        //entrySet() metodu, HashMap'in tüm degerlerini içeren (key-value) bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set'in icinde Map yapisi saklanir.

        System.out.println(myMap); //{Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15}
        Set< Map.Entry<String,Integer> > myEntrySet = myMap.entrySet(); //Map.Entry<String,Integer> bu sekildee iki farkli turu yazmamiz saglanmis oldu
        // bu kullanim onemli mapin icinde dolanmamiza olanak sagliyor
        // bir map dogrudan dongu icine sokulamaz o sebeple bu gelistirilmis donguye sokalim
        System.out.println(myEntrySet); //[Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15] --- koseli parantez sete dondu burdan anliyoruz

        for (Map.Entry<String,Integer> w: myEntrySet){  // Map.Entry<String,Integer> bu bir data tipidir
            System.out.println(w);
        }
        // tum verilere ulasim saglamis olduk
        //Fatma Yilmaz=19
        //Ali Can=25
        //Veli Han=18
        //Ayse Kaya=15

        System.out.println("--------------------------------");
        //Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz. -- "Ali", 3 tioplam 6 olmali
        //Example 2: Find the sum of the number of characters and the age of the person names in the given Map.

        //Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Ali", 3);
        people.put("Can", 5);
        people.put("Ayse", 2);

        int sum =0;
        Set<Map.Entry<String,Integer>> mySet = people.entrySet();
        System.out.println(mySet); // [Can=5, Ayse=2, Ali=3]
        for (Map.Entry<String,Integer> w : mySet){
            sum = sum + w.getKey().length() + w.getValue();

        }
        System.out.println(sum); //20


    }
}
