package d25Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
        //Interview Question
        //Example 1 : Store student email addresses in natural order.

        long t1 = System.nanoTime(); // bu performans olcumu icin kullanilir ne kadar zamanda kodun calistigini tespit icin kullanilir

        //1.Yol : TreeSet dogal siralamayla kaydeder oo sebeple TreeSet Kullandik  yavas - her adimda siralama yapar
        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails); //[a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]
        //TreeSet yavas oldugu icin hizlandirmak icin HashSet ile bu sorunu cozelim

        long t2 = System.nanoTime(); // burdada ikinci bir kilorometre baslattik gibi dusun performans olcumu icin
        //2.yol : Daha hizli hale getirelim
        //bu yol tavsiye edilir islem adimlari uzar ama hiz artar
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        System.out.println(emailsHs);// [b@gmail.com, k@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com, p@gmail.com, z@gmail.com, u@gmail.com, a@gmail.com, l@gmail.com]
        // burda karisik siraladi simdi siralamasini yapabalim

        //Bos bir TreeSet olusturalim ve constructor`ina HashSet i yazalim
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs); // bu islemlede hizli bir sekilde siraladik
        System.out.println(emailsHsTs); // [a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]
        //TreeSet burda add() yapmadi sadece siraladi
        long t3 = System.nanoTime(); // ucuncu bir kilorometre olusturarak kodlar arasinda karsilastirma yapacagim hangisini hizli hangisinin yavas oldugunu tespit etmeye calisacagim

        System.out.println("t2 - t1 = " + (t2 - t1)); //TreeSet hizi -- 254709
        System.out.println("t3 - t2 = " + (t3 - t2)); //HashSet hizi -- 106958
        // TreeSet nerdeyse 2.5 kat daha yavas deger cok buyuk -- bu hizlarin belirlenmesinde bir cok etken vardir ama HashSet herzaman hizlidir


    }
}
