package d19stringbuilder_buffer_accessmodifier_static;

public class Sb03 {
    public static void main(String[] args) {
        //1-reverse(): StringBuilder Object’inin içeriğini ters çevirir.String class’ta yoktur
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy
         sb1.reverse();
        System.out.println(sb1); //ysae si avaJ

        //---------------------------
        //2- deleteCharAt(int index): Belirtilen konumda(index’te) bulunan karakteri siler.
        sb1.deleteCharAt(1); //1. indexdeki karakteri siliyor
        System.out.println(sb1); //yae si avaJ  1. indexdeki s silindi diğerleri yapıştı indexler yeniden düzenlendi

        //--------------------------
        //3- delete(int start - dahil , int end - haric): Belirtilen aralıktaki karakterleri siler.
        sb1.delete(0,2);  //0. indexten başla 2. indexe kadar siler
        System.out.println(sb1); // e si avaJ  (burdada indexler yeniden düzenlendi)

        //-------------------------------
        //4-replace(int start-dahil, int end-haric, String str): Belirtilen indexteki karakterleri verilen stringle değiştirir.
        sb1.replace(0, 2, "HASAN");
        System.out.println(sb1); //HASANsi avaJ  //0dan başlayarak 2 yekadar değiştiriyor diğerleri aynen hasan devamına eklenir. DİKKAT HASAN kadar değiştirmez 0-2 arası değişir gerisi kalı

        //----------------------
        //5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
        // Buradaki offset, eklemenin başlayacağı konumu belirtir ve aslında bir index görevi görür.
        sb1.insert(2,"34");
        System.out.println(sb1);//HA34SANsi avaJ (belirtilen konymdan itibaren ekleme yapıyor üzerine yazma yapmıyor)

        //--------------------------
        //6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
        // int değeri döndürür.Sozluk gibidir.Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa, negatif deger döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden sonra geliyorsa, pozitif deger döndürür.
        // Farkli olan iki harfin ascii kodlari arasindaki farki verir.
        // Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur.
        // Kelimelerin sözlük sıralamasını belirleyebilirsiniz, kelimeleri alfabetik sıraya göre sıralayabilirsiniz.

        StringBuilder sb2 = new StringBuilder("Zava"); //90 Z nin aski değeri
        StringBuilder sb3 = new StringBuilder("Kava"); //75 K nin aski değeri

        int result = sb2.compareTo(sb3);
        System.out.println(result); //15 Z ve K aski değerlerini birbirinden çıkarttı bu sonucu verdi bu sonuca göre hangi kelimenin diğer kelimeye göre sıralamasını bulabiliriz

        //----------------------
        //7-toString() metodu, StringBuilder nesnesinin içeriğini bir String nesnesine dönüştürür.
        String str = sb1.toString().toUpperCase(); //normalde StringBuilder da toUpperCase yok ama stringe dönüştürerek string methodlarınıda kullanabildik
        System.out.println(str); //HA34SANSI AVAJ sb1 tamamen dönüşmedi olduğu yerde döüştü yine eski halinde StringBuilder olarakduruyor

        StringBuilder newStr = new StringBuilder(str); //bu şekilde str yi StringBuilder a dönüşüm yaparız
        System.out.println(newStr); //  HA34SANSI AVAJ data tipi artık StringBuilde oldu

        //----------------------------------------------------------
        //StringBuffer nasil olusturulur?
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);
        /*
        1) StringBuffer Java'da String ureten bir diger classtir.

        2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable-degistirilebilir" String uretir
        3) StringBuffer "multi-thread(coklu is parcacigini destekler)" dir,
        ama StringBuilder "multi-thread" degildir.
        4) StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir
        5) Multi-thread yapilirken, yapilan islerin siralamasi onem arzeder. Yapilan isleri mantikli bir
        siraya koymak "synchronization" olarak adlandirilir
        StringBuffer multi-thread oldugu icin ayni zamanda synchronized'dir

                Uc tane String olusturan class ogrendik;
                1) Immutable String lazimsa ==> String class
                2) Mutable String lazimsa , StringBuilder veya StringBuffer
                                a) StringBuilder'i multi-thread gerekmezse kullaniriz
                                b) StringBuffer'i multi-thread gerekirse kullaniriz
        */
        /*Tek iş parçacığı (Single-Threaded), aynı anda sadece bir görevi işleyebilirken,
         birden fazla iş parçacığı (Multi-Threaded) aynı anda farklı görevleri işleyebilir ve
         böylece işlerin daha hızlı ve etkili bir şekilde tamamlanmasına olanak tanır.*/

        //-----------------
        /*Senkronizasyon olmadan, birden fazla thread'in aynı veri üzerinde çakışan değişiklikler yapması
         (örneğin aynı hesaptan para çekilmesi) veri yarışı (race condition) denilen duruma yol açar ve
         bu da veri kaybına veya tutarsızlığa sebep olabilir. Senkronizasyon mekanizması,
         bu tür sorunları önleyerek veri bütünlüğünü ve programın doğru çalışmasını sağlar.*/









    }
}
