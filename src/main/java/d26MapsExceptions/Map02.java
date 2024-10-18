package d26MapsExceptions;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        HashMap <String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        stdAges.put("Tom", 35);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}
        // burda Tom ayni key oldugu icin uzerine yazar degistirir fakat bu tercih edilet yontemdegildir
        //tercih edilen yontem replace()

        //1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom", 39);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}  bu  replace methoduyla yapmak tercih edilen yontemdir

        //2) replace() methodu, eski deger kontrolu yaparakta calisir
        stdAges.replace("Tom", 21,45); //burda Tom keye sahip olan deger 21 ise onu 45 olarak guncelle
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18} deger 21 olmadigi icin degistirmedi

        stdAges.replace("Tom", 39,45); // burda Tom keye sahip olan deger 39 ise onu 45 olarak guncelle
        System.out.println(stdAges);//  {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18} deger 39 oldugu icin degisiklik gerceklesti

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler. ---> Absent mevcut olmayan kelime anlamindadir
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.
        stdAges.putIfAbsent("Tom",77);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        //Tom key'i map'te oldugu icin "Tom", 77'yi eklemedi

        stdAges.putIfAbsent("Ayse", 23);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18} //Ayse 18 olmadigi icin eklemeyi yapti
        // musteri kayit sisteminde eger kayit yoksa ekler,  kayit varsa ekleme yapmaz

        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, get() de getOrDefault() her ikiside ayni isi yapar
        //key verirsiniz, size value verirler.
        // Ancak getOrDefault() metodu, anahtar bulunamadığında bir varsayılan değer sağlama avantajına sahiptir.
        System.out.println(stdAges.get("Tom")); //45
        System.out.println(stdAges.getOrDefault("Tom",18));// 45 // default olrak 18 degeri yazdik eger toma ait bir deger varsa o degeri donderir fakat degeri yoksa 18 donderir

        System.out.println(stdAges.get("Jerry")); //null get() methodu key kayitta yoksa null donderir
        System.out.println(stdAges.getOrDefault("Jerry", 18)); //18 // key kayitta yoksa verilen varsayilan degeri donderdi 18
        //burda kullanici oturum acmismi acmamismi diye kontrol yapabilirsin birde varsayilan deger yukleyip eger varsayilan deger geri donerse oturum acilmamis kararini verir ona gore islemini yaparsin

        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        // listemiz en son bu ---> {Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}
        boolean b = stdAges.containsValue(19);
        System.out.println(b);  //true
        System.out.println(stdAges.containsKey(99)); //false

        System.out.println(stdAges.containsKey("TOM")); // false , buyu kucuk harf duyarliligi var
        System.out.println(stdAges.containsKey("Tom")); // true

        ////////-----EK BILGI---------Buyuk Kucuk Harfe Duyarsiz Yapma
        Map<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Tom".toLowerCase(), 25); // kullanici ne girerse girsin kucuk harfe cevirdik
        System.out.println(stdAges2); // {tom=25} daha giris yapilirken kaydi kucuk olarak tutum kontrol yaparkende kucuk harfi kullanacagim

        boolean b1 = stdAges2.containsKey("TOM".toLowerCase()); // burdada kullanici ne girerse girsin kucuk harfe cevirdik ve kontrol ettik
        // bu sekilde buyuk kucuk harf duyarliligini ortadan kaldirmis olduk
        System.out.println(b1); //true
        //---------------------------------------------------//

        String emoji = "\uD83D\uDE02";
        System.out.println("emoji = ❤\uFE0F " + emoji);
        //--------------------------------------------------//

        //6)remove(); methodu key kullanarak entry silmeye yarar
        //bosluklari silmeye yarar
        stdAges.remove("Tom");
        System.out.println(stdAges);// {Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}  --> Tom ve Valuesi Silindi

        stdAges.remove("Can", 18); // hem key hem value eslesmesi gerekir
        System.out.println(stdAges); //{Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18} --> 18 eslesmedigi icin silmedi


    }
}
