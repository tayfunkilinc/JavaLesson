package d24Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

        /*Java'da üç tür set vardır:

        *****1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.
        //hash karisik demektir

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null'i eleman olarak kabul ederler */
        //HashSet -- karisik yukler siralamaya dikkat etme
        //LinkedHashSet -- insersion yani ekleme sirasina gore yukleme yapar bu HashSet e gore bir tik daha yavastir
        //TreeSet -- natural siralamaya gore siralar kucukten buyuge siralar a-z ye 1,2,3...... diye siralar bu siralamaya dikkat ettigi icin en yavasidir


        //------Ek Bilgi--------
        //Hash Kod Gormek Sitersek
        String a = "ali can";
        System.out.println(a.hashCode()); // -916486578 bu hash kond veri degistikce hash kod ureterek ona bagli olarak eklemeler yapar
        //hash kodlari benzersiz degildir aynisi denk gelebilri
        //istisnalar vardir bazen ayni hash koda iki ayni veri ekleme ihtimali var bunu ilerde ayni yere gelmemesi icin kontroller yapip ona gore kayir yapiyoru
        //-------------


        /*
        *********2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

       ********** 3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set'tir.*/

        //HashSet nasil olusturulur ?

        HashSet<String> hs = new HashSet<>();
        System.out.println(hs); //[] -- burda hicbirsey yok bos olunca null degil dikkat null demek ici bos obje demektir
       // =========buradan devam et

         //HasSet`e nasil eleman eklenir
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs); //[Kerem, Sinan, Tuba, Onur]

        hs.add("Kerem"); // tekrar eleman eklemek hata vermez uzerine yazar
        System.out.println(hs); //[Kerem, Sinan, Tuba, Onur]

        hs.add(null); // burda null degerinin varliginin kontrolu icin kullanilir bos ekleme yapilmismi yapilmamismi kontrolu icin kullanilir
        System.out.println(hs); // [Kerem, null, Sinan, Tuba, Onur]

        hs.add(null);
        System.out.println(hs); // [Kerem, null, Sinan, Tuba, Onur]  --eleman eklerken null girdiyse aninda uyari verdirilerek bos deger girmesi engellenir

        //LinkedHashSet nasil olusturulur?
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);  //[14, 19, 7, 1, null] --> insertion order --ekleme sirasi

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(14);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls); //[14, 19, 17, 11]

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls);  // burda lhs ye gir ls ile olan ortaklara bak lhs icine ortaklari yaz
        System.out.println(lhs); //[14, 19]
        System.out.println(ls); // [14, 19, 17, 11]

        //ODEV: Farkli olanlari bulan bir metot var mi?

        //----------
        //TreeSet nasil olusturulur?
        TreeSet<Character> ts = new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        // ts.add(null); ---null dogal siralamssi olmadigi icin nereye koyacagini bilemiyuor dolayisiyla null i kabul etmiyor
        System.out.println(ts); //[A, G, R, U, Z] -- natural order - A`dan Z`ye

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.
        SortedSet<Character> ss = ts.subSet('G','U'); //---G den basla U ya kadar git () bu aramayi ts icinde [A, G, R, U, Z] yapiyor
        System.out.println(ss); //[G, R]
        SortedSet<Character> ss1 = ts.subSet('B','H');
        System.out.println(ss1); //[G] -- burdada ayni ekil B den basladi H ye kadar aradi bu arda sadece G harfi bizim sette var onu donderdi

    }
}
