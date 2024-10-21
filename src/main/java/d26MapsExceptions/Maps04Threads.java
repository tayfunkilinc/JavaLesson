package d26MapsExceptions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps04Threads {
    public static void main(String[] args) {
        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

        /*
        Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
        Veri yarışlarını ve tutarsızlıkları önler. //is parcaciklarini guvenligi ayni isi yaparken tutarsizlik olmamasi.
        //bir kisinin yaptigi islem digerini etkilememesi gerekir

        Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
        Paralel işleme ve performans artışı sağlar.
        //coklu paralel islemlerde kaynaklar dolunca arkadan gelenleride thread safe seri olarak kuyruga sokar
        Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
        Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.

        */
        //ayni kaynaga erisim saglanacaksa synchronize olmalari gerekir
        // Singel Thread ayni anda tek is yapilmasi bunda veri yarisi ortaya cikmaz synchron olarak islemlerini yaparlar biz duzen icinde calisirlar

        /*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?
        1-) HashMap
             a) Thread Safety:
        Thread-safe değildir.
        Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
             b) Multi Thread:
        ***Tek iş parçacıklı (single-threaded) ortamlar için idealdir.
        Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
             c) Synchronized:
        Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
             d) Null Key/Value:
        Bir null key ve birden fazla null value kabul eder.
             e) Performans:
        En hızlısıdır çünkü synchronized değildir.
         */
        /*
        2-) Hashtable
             a) Thread Safety:
        Thread-safe'tir.
        Synchronized yapısı nedeniyle aynı anda sadece bir iş parçacığı tarafından kullanılabilir.
        coklu islemi kabul eder ama is hizmete gelince sadece bir kisinin hizmetini yapar
        //hastanede iceri birden cok kisi alinir ama icerde teker teker muayene olurlar bu ornek olabilir
               b) Multi Thread:
        *** Çok iş parçacıklı (multi-threaded) ortamlar için uygundur.
             c) Synchronized:
        Synchronized'dir, yani tüm metotlar synchronized olarak işaretlenmiştir ve aynı anda sadece bir iş parçacığı tarafından erişilebilir.(bunun anlami kilit mekanizmasi var cokluyu kabul eder ama sirayla isleme sokar)
            d) Null Key/Value:
        Ne null key ne de null value kabul eder. HATA olarak NullPointerException atar.
            e) Performans:
        HashMap'ten daha yavaştır çünkü synchronized'dir*/

        /*
        3-) ConcurrentHashMap  --- en yeni teknoloji budur HashTable eski sirketlerde vardir
            a) Thread Safety:
          Thread-safe'tir. eger bir konu thread safe ise paralel islemi kabul ediyor analamina gelir
          Segment-based locking kullanarak senkronizasyon sağlar.
            b) Multi Thread:
          *** Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.
          Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
            c) Synchronized:
          Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
            d) Null Key/Value:
          Ne null key ne de null value kabul eder. NullPointerException atar.
            e) Performans:
          HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
          Çok iş parçacıklı ortamlar için optimize edilmiştir.
            */
       //---------------------

       /*HashMap, Hashtable ve ConcurrentHashMap ne zaman kullanılir?
        1- HashMap:
      Tek iş parçacıklı uygulamalar için idealdir  çünkü synchronized değildir(ek bir işlem ve zaman gerektirmez)
      Çok iş parçacıklı ortamda kullanılacaksa, dış senkronizasyon mekanizmaları ile korunmalıdır.

        2- Hashtable:
      Eski kod tabanları ve miras uygulamalar için uygundur(Varolan bir kod tabanını korumak veya mevcut bir projeyi
      güncellemek zorunda olduğunuz durumlar)
      Yeni projeler için genellikle önerilmez çünkü daha modern ve performanslı alternatifler vardır.

        3- ConcurrentHashMap:
      Modern ve yüksek performanslı çok iş parçacıklı uygulamalar için en iyi seçenektir.
      (Web sunucuları, veri işlem sistemleri, yüksek trafikli uygulamalar)
      Thread safety ve performansın önemli olduğu her durumda tercih edilir.*/
        //  NOT ConcurrentHashMap tekli islemde kullanmak cok iyi bir bilgisayari israf etmek gibi olur

        Hashtable<String, Integer>  studentGrades = new Hashtable<>(); // Hashtable eski teknoloji
        studentGrades.put("Selma", 70);
        studentGrades.put("Tugba", 75);
        studentGrades.put("Ibrahim", 85);
        studentGrades.put("Sefa", 87);
        //studentGrades.put(null, 87); //HATA
        //studentGrades.put("Ahmet", null); //HATA
        //Hashtable key de ve value da null kabul etmez

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 41);
        stdAges.put(null, 41);  // {null=41, Ahmet=41, Ali=18}
        stdAges.put("a", null); //{null=41, Ahmet=41, a=null, Ali=18}
        stdAges.put("b", null);  //{null=41, Ahmet=41, a=null, b=null, Ali=18}
        //key tarafinda ayni degerler bir defa olmasi gerektigi icin bir defa kabul eder diger gelenleri ustune yazar
        //value tarafinda ayni degerlerden birden cok olabilecegi icin benzer kayitlari kabul eder
        //null herzaman dikkatli kullanilmali exeption atabilir

        System.out.println(stdAges);

        //---------------------------------------
        //ConcurrentHashMap olusturma

        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
        stock.put("Elma", 10);
        stock.put("Muz", 20);

        System.out.println("Elmanin Stok Miktari: "  + stock.get("Elma")); //Elmanin Stok Miktari: 10

        //Guncelleme Veya Ekleme
        stock.putIfAbsent("Cilek", 30); // stock ta Cilek yoksa 20 tane ekleme yapar varsa bir sey yapmaz
        System.out.println(stock); // {Muz=20, Elma=10, Cilek=30}

        stock.replace("Muz", 20, 25); // mu zdegeri 20 ise degerini 25 yap --uygulamada stock 20 ye duserse 25 olarak guncellersin
        System.out.println(stock); //{Muz=25, Elma=10, Cilek=30} stock 20 oldugu icin 25 olarak value guncellendi

        //Eleman Silme
        stock.remove("Elma");
        System.out.println(stock); //{Muz=25, Cilek=30}

        for (Map.Entry<String,Integer> entry : stock.entrySet()){ // entrySet() bunu icerisine veri koyacagimiz degisken tipi ile uyumluluk icin yaptik
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " stok mikatari " + value);
        }

           /*
        1) TreeMap'ler entry'leri natural order'a gore siraya koyar, bu yuzden yavastirlar
        2) TreeMap'ler  thread-safe ve synchronized degildir.
        3) TreeMap'lerin key'lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
        ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) TreeMapler key'e bakarak siralama yapar
          */

        TreeMap<String, Integer> countryPopulation = new TreeMap<>();

        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);

        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);

        System.out.println(countryPopulation); //{Germany=83000000, Netherland=18000000, Turkiye=83000000, USA=400000000}

        //-------------------------------------------
        /*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.

        **ornegin,bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir.
        yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
        restoranın sipariş hazırlama sırasını belirler.

        Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
        benzeri senaryolarda da kullanılabilir.
        Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.LinkedHashMap sınıfı thread-safe degildir
        */
        LinkedHashMap<String, Integer> lhm  = new LinkedHashMap<>();
        lhm.put("Ali", 25);
        lhm.put("Can", 18);
        lhm.put("Mehmet", 30);

        for (Map.Entry<String, Integer> entry: lhm.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
       /* Ali --> 25
        Can --> 18
        Mehmet --> 30 */ //insertion sirasi yani ekleme sirasi
        }

        //------------------------------------
        //HashMap arka planda nasil calisiyor?
        //HashMap'in varsayılan boyutu(kapasitesi) 16'dır (0 ila 15).16 adet "bucket" (kova) bulunacağı anlamına gelir.
        // Bu "bucket"lar, HashMap içindeki anahtar-değer çiftlerini tutar. Bucket'in memory'de kapsadigi alan degiskendir.
        //surekli 16 ya bolup kalaninim bulundugu hafiza alanina ekler ayni kalanlari olanlari ayni indexe LinkList seklinde ani indexe ekler


        HashMap<String , String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");

        capitals.put("Italy", "Rome");
        capitals.put("Turkiye", "Ankara");

        capitals.get("Turkiye");
    }
}
