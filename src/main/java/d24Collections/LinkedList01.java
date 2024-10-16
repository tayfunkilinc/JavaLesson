package d24Collections;

import java.util.*;

public class LinkedList01 {
    public static void main(String[] args) {
        /*Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
        bir class'lar ve interface'ler kümesidir.

        —Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
                Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
                Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
                Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
                Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

        —Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
                Verileri verimli bir şekilde depolamak
                Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
                Verileri güvenli bir şekilde depolamak*/
        /*Java da Array'ler neden eksik kaldi da Collection'lar gelistirildi?

        Java'da array'ler eksik kaldı çünkü:

        Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
        İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
        Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

        Collections, bu dezavantajları çözmek için tasarlanmıştır.*/
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(); //daha genel bir referans turu oldugu icin sol tarafta List kullanimi cogu zaman tercih edilir
        //List<String> list3 = new List(); //List interface oldugu icin ; interfacelerden obje uretilemz unutma
        //  -------LinkedList-------
       // 1) ArrayList ===> [A,L,I,C,A,N]  --->  [A,I,C,A,N] index mantigi vardir erisilebilir ve cok hizlidir,.
        // ancak bir veri silmek olumsuz etkiler cunku yeniden indexleme oldugu icin bu islem hacmini asiri arttirir yer degisikligi

        // 2) ArrayList ===> [A,L,I,C,A,N]  --->  [A,L,I,Y,C,A,N] ---> ekleme yapincada araya eleman ekleyincede indexler tekrardan konumlandirildigi icin islemhacmi buyu
        // bu iki sebepten dolayi LinkedList ortaya cikmistir

        /*LinkedList: Bağlı bir listedir.

        LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
        LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1) Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
        ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/
       //*** ------> surekli silme ekleme varsa LinkedList  -- erisimde Hiz istiyorsan ArrayList kullanmak daha mantiklidir

        /// eleman ekleme ve silmede pointer direk isaret edecegi yeri bir sonraki olarak otomatik olarak ayarlar  --> halaya girip cikma olayi gini
        //diger elemanlar yer degistirmeden eleman ekleme cikartma yapilir

        /*Sonuc:
        LinkedList'in bu hızlı ekleme ve silme işlemleri, bazı senaryolarda tercih edilmesine neden olurken,
        veriye doğrudan erişim gerektiren durumlarda ArrayList daha uygundur.

        Bu nedenle, hangi liste türünün kullanılacağı, uygulamanın gereksinimlerine ve
        yapılacak işlemlerin türüne bağlıdır.*/
        LinkedList<String> myList = new LinkedList<>();

        //1- add() : listeye bir eleman ekler
        myList.add("Ali");
        myList.add("Veli");
        myList.add("Ayse");
        myList.add("Fatma");
        System.out.println(myList);  // [Ali, Veli, Ayse, Fatma]  dogrudan yazdiriliyor --> insertion order - ekleme sirasi ekleme sirasina gore bize ciktiyi veriyorsa

        //Java’da LinkedList’e eleman eklemek için genellikle add metodu kullanılır.
        // Bu, standart ve en yaygın yöntemdir. Ancak, LinkedList’e eleman eklemek için daha “kısa yollar” bulunmaktadır.
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Elelman1", "Eleman2", "....")); //[Elelman1, Eleman2, ....] //add olmadan kisa yolla ekleme yapmak
        System.out.println(linkedList);

        LinkedList<String> linkedList2 = new LinkedList<>(List.of("Elelman1", "Eleman2", "....")); // [Elelman1, Eleman2, ....] boylede eklemeyi direk constructor kismindan yapabiliyoruz
        System.out.println(linkedList2);

        //----EK Bilgi
        //List.of(), Constructor'a degil de, dogrudan yazilirsa, immutable (değişmez-Boyutta, elemanda degismez)
        // bir liste döndürür. Bu liste üzerinde herhangi bir değişiklik yapmaya çalışmak
        // UnsupportedOperationException hatası fırlatır. Yani, List.of() ile oluşturulan
        // bir liste üzerinde eleman ekleyemez, çıkaramaz veya mevcut elemanların değerlerini değiştiremezsiniz.
        //YANI buna ornek verecek olursak
        List<String> immutableList = List.of("Elelman1", "Eleman2", "...."); //degismez bir list olusturduk bu eleman nesne ile degil direk kendinden olusturdugumuz icin eklem cikartma yapamassiniz hata verir
        //immutableList.add("tayfun");
        //System.out.println(immutableList); //HATA --> UnsupportedOperationException
        //-------------------------

        //2- add(int index, E element); belirtilen konuma bir oge ekler
        // sadece add() olursa sona ekler ama index verirsen istene indexe ekleme yapar
        myList.add(1,"Zeynep"); // 1. indexe git Zeynep ekle
        System.out.println(myList); // [Ali, Zeynep, Veli, Ayse, Fatma]

        //3- addFirst(E e): Listenin basina oge ekler
        myList.addFirst("Hasan");
        System.out.println(myList); //[Hasan, Ali, Zeynep, Veli, Ayse, Fatma]

        //4- addLast(E e): Listenin sonuna bir öğe ekler. ---> normalde add sona ekler ama bunuda yapmislarki okunurluk artsin diye
        myList.addLast("Usuun");
        System.out.println(myList); //[Hasan, Ali, Zeynep, Veli, Ayse, Fatma, Usuun]

        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur -- bize listeden kaldirdim diye cevap veriyor ne kaldirdigini soylemiyor liste falan dondurmuyor burda 0,1 doner
        boolean m1 = myList.remove("Ali"); //---> buyuk kucuk harf duyarli dikkat et
        System.out.println(myList); //[Hasan, Zeynep, Veli, Ayse, Fatma, Usuun]
        System.out.println(m1); //true

        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.add("Yusuf");
        myList.add(3,"Yusuf");
        System.out.println(myList); //[Hasan, Zeynep, Veli, Yusuf, Ayse, Fatma, Usuun, Yusuf]

        //----------
        //-----Ek Bilgi
//        myList.removeAll(Collections.singleton("Yusuf")); // burda dikkat et Collections clasi ile calis interface ile degil --- Burda tum Yusuf lari siler
//        System.out.println(myList); //[Hasan, Zeynep, Veli, Ayse, Fatma, Usuun]
        //--------------

        myList.removeFirstOccurrence("Yusuf"); //soldan saga dogru tarar ilk gordugunu siler
        System.out.println(myList); //[Hasan, Zeynep, Veli, Ayse, Fatma, Usuun, Yusuf]

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.removeLastOccurrence("Yusuf"); // bu ve ustteki arama yaparak islemi gerceklestiriyor -- sagdan sola arama yapip ilk onune geleni siliyor
        System.out.println(myList); //[Hasan, Zeynep, Veli, Ayse, Fatma, Usuun]  --> burda sasirma 4.indexteki Yusuf u ustte sildik

        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır. -- peek: goz atmak demek
        // Bu metod, elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa null dondurur

        String s  = myList.peek(); // --- geriye deger donderdigi icin donderdigi degeri uygun bir degiskene atadik
        System.out.println(s); // Hasan // sadece ilk degeri donderdi dikkat
        System.out.println(myList); // [Hasan, Zeynep, Veli, Ayse, Fatma, Usuun]

        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.

        System.out.println(myList.poll()); // Hasan
        System.out.println(myList); //[Zeynep, Veli, Ayse, Fatma, Usuun]

        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() den farki peek() null dondurur ama element() liste bos uyarisi dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(myList.element()); //Zeynep
        System.out.println(myList); //[Zeynep, Veli, Ayse, Fatma, Usuun] --> elemani buda kaldirmiyor peek() e benziyor
        //bos eleman olmasi halinde bu meythod kullanilir

        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)
        System.out.println(myList.pop()); //Zeynep
        System.out.println(myList); //[Veli, Ayse, Fatma, Usuun]





    }
}
