package d18DateTimeStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class d18DateTimeStringBuilder {
    public static void main(String[] args) {
        /*LocalTime Class'ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August  */
        //-------------
        //ornek 1:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.

        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.

        //format() method’u LocalTime’i String’e istedigimiz formatta cevirir
        LocalTime myCurrentTime = LocalTime.now(); // burda saati verilyor LocalDate ise tarihi veriyor

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a"); //12 li saat sistemi yaptık kendimiz
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime);

        System.out.println("----------------");
        //Ornek 2: Tarih’i formatlayalim
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate); //2024-10-04

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd*MMMM*yyy"); // burası esnek d-M-y , dd-MM-yyyy v.b burayı istediğimiz gibi şekillendirebiliriz
        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate);// 04*October*2024

        System.out.println("----------------");
        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        //ÜLKELERİN LOCAL ID leri  : https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
        //Tokyoda Ayın Kaçı
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Tokyoda Ayın Kaçı
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);
        //ÖDEV: bu bilgiler internetten mi geliyor nerden geliyor araştır
        //-------------------------------------------------
        //Tüm Zone'ları görelim
//        Set<String> zoneIds = ZoneId.getAvailableZoneIds();  //set benzersiz verileri saklat TC gibi
//        for (String w : zoneIds){
//                System.out.println(w);
//        }
//        //Zaman Dilimlerinin Sayısını Görelim
//        System.out.println("Toplam Zaman Dilimi Sayıs:  " + zoneIds.size());
        //-------------------------------------------------------
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2024-10-04T11:46:49.634089

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");
        String formattedLdt = dtf3.format(ldt); //ldt yi drf3 kalıbına göre formatlattık ve formattedLdt içinde sakladık
        System.out.println(formattedLdt); //04 * Oct * 2024 - 11 : 51 AM

    }
}
