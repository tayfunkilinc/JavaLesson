package d18DateTimeStringBuilder;

public class Sb01 {
    public static void main(String[] args) {
         /*
        1) "StringBuilder" class’da String ureten bir class’tir.
        2) String class kullanarak String üretiriz, Java nicin StringBuilder’i da olusturdu?
            String class "immutable" (degistirilemez) String uretir,
            StringBuilder class "mutable"(degistirilebilir) String üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
            StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
         ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
        */

        //Immutable - degistirilemez
        //Bir String variable olusturup, sonra ona baska String degerleri concatenate ettiginizde,
        // her seferinde Heap Memory’de yeni bir String objesi olusur. Orjinal deger degismez.

        String s = "Java";
        String t = s + "x";
        String w = t + "?";

        String str2 = "abc";
        String str4 = "abc";
        String str3 = new String("abc");
        //str2==str4 true döndürürken str2==str3 false döndürür çünkü == adrese bakar new ile oluşturulan String adresi faklıdır
        //bu sebeple stringlerin eşitliklerini herzaman equal ile kontrol et equals değere bakar
        //çalışma sırasında direk String ile oluşturulursa değiştirilemez ama new String ile oluşturursan çalışma anında yeni değer atayabilirsin
        //new ile oluşturulan String her zaman yeni yeni adres alırken normal String ile oluşturulan aynı yazılar aynı adresten gelir


        //---------------------------
        //"Ali" default olarak String kabul edilir ve dogrudan baska bir ture yuklenemez

        //StringBuilder sb1 = "Ali"; HATA
        //append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır.

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1); //Python

        sb1.append("!");
        System.out.println(sb1); //Python! //veri dogrudan sona eklenir

        //--------------------
        //Peki, bir String'i degistirdikten sonra tekrar ayni String'e yuklersem orjinal deger degismez mi?

        String a = "money";
        System.out.println(a); //money
        a = a + " more";
        System.out.println(a); //money more
        //NOT bir veri javada adressiz veri bulursa garbage collector(çöp  toplayıcı) hafızadan bu veriyi kaldırır

        /*1-String’i degistirdikten sonra ayni String’e assign ederseniz Java yine yeni bir container olusturur.
        2-Degismis degeri bu yeni container’in icine koyar ve eski container’i gosteren
        pointer yeni container’a yonlendirilir
        3-Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"
        adressiz olan container’lari siler. GC bellek sızıntılarını önler.
        GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.
        Veri memory’de sahipsiz ve guvenliksiz bir sekilde beklemez.
        4-GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir
        ve uygulamadan bağımsızdır*/



    }
}
