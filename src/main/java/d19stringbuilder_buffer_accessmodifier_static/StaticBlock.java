package d19stringbuilder_buffer_accessmodifier_static;

import java.time.LocalDate;

public class StaticBlock {
    //Bir variable olusturup deger atamazsaniz o variable’i initialize(hazır hale getirmek - başlatmak) etmediniz demektir
    //class yüklenmesi sırasında static bloklar yüklenir program başlamadan hazır halede bekler
    static  double pi; //1-) tanımlama burda yapılır çünkü global olmalıki diğer yerlerden erişim sağlansın
    static int price;
    // 2-) bunu daha başlatmadık sadece oluşturduk =3.14 yapmadım yani başlatmadım. bunu static blok içinde başlatacağız
    static { //static block
        pi=3.14;
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
        LocalDate currentDate = LocalDate.now(); //Su anki tarihi aldik

        if (currentDate.getMonthValue() == 2) { //Alinan tarihin ayini aldik ve 2'ye esit mi diye kontrol ettik
            price = 1000;
            System.out.println(price);
        } else {
            price = 2000;
            System.out.println(price);
        }
        //static blok blok birden fazlaysa yukardan aşağı sırasıyla çalışır

    }

    public static void main(String[] args) {
        /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
     veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
     Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
     Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
     bir şekilde hazır olmasını sağlar.*/
        System.out.println(pi);
        System.out.println("Main İçi");
        // Static block 1 --> static block içi hemen oluşturuldu class yüklenmesi sırasında oluştuğu için
        //  3.14 ----> static blok her zaman önce çalıştığı için bu sadece atama yapıldı static içinde yazdırma main içinde olduğu için Static block 1 altında yazıldı
        //  Main İçi


    }
}
