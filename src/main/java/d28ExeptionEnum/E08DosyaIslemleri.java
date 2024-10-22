package d28ExeptionEnum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E08DosyaIslemleri {
    public static void main(String[] args) throws IOException {
        /*1)Run butonuna bastiktan sonra console'da alinan Exception'lara Runtime Exception denir
          ArithmeticException, NullPointerException vs...
          RunTime Exception'lara Unchecked Exception'da denir. (run butonundan once kontrol edilmemis)

        2) Code yazarken kirmizi alt cizgi seklinde alinan Exceptionlar'da vardir.
        Bunlara da Compile Time Exception denir,
        Compile Time Exception'lara Checked Exception'da denir.(run butonuna basmadan once kontrol var)*/

        /*Aciklama: FileInputStream kullanacagiz. Bir class'tir.FileInputStream sınıfı, Java'da dosyaları bayt (byte) bazlı
        okumak için kullanılır. Bu sınıf, Java'nın java.io paketinin bir parçasıdır.
        Genellikle metin dosyaları, resimler, ses dosyaları vb. dosya türlerini okumak için kullanılır.
        Not: ASCII tablosundaki "A" ya da herhangi bir başka karakter 1 byte'a eşittir.*/

        //--------------
        /*
            interview sorusu
            throw ile throws arasindaki farklar nelerdir?
            1) throw method body'si icinde, throws ise method parantezinden sonra kullanilir
            2) throw method body'si icinde istenilen yerde istenildigi kadar yazilip kullanilabilir
               throws ise method signature'dan hemen sonra ve sadece bir kere yazilir
            3) throw'dan sonra new keyword'u ve constructor kullanarak object olusturulur
               throws'dan sonra ise sadece Exception class ismi yazilir
            4) throw belli sartlar icin Exception firlatmada kullanilir (age negatif olamaz diye biz sart koyduk)
                throws ise bir methodun belli bir Exception'u firlatabileceğini belirtmek icin kullanilir
                (olusabilecek bir hataya karsi yazilir)
         */
        //------------------------
        //read() metodu dosyadan bir bayt (byte) okur (tam sayı değerini-0-255 arasında)
        //Dosyada 'A' karakteri varsa, read() metodu 65 değerini döndürecektir.
        //Dosyada 'a' karakteri varsa, read() metodu 97 değerini döndürecektir.
        //-1 değeri, dosya sonu (EOF - End of File) olarak kabul edilir.
        //read, dosya sonuna ulaşıldığında -1 değerini döndürur.
        //--------------


        FileInputStream fis = new FileInputStream("src/main/java/d28ExeptionEnum/file.txt"); // burda calismadan once java bize uyari veriyor
        //HATA Unhandled exception: java.io.FileNotFoundException -- > bu bir Compile Time Exception hatalarindan biridir
        //bu hatayi duzeltmek icin more etion kismindan yapiyoruz
        //1. throw firlattik throws FileNotFoundException ustte main yanina eklendi

        int k= 0; // burda read tam sayi donderince bu degisken icin de donen veriyi tutacagiz
        while ((k = fis.read()) != -1){ //bosluk gelene kadar okuma yapacak
            // burdada read() bize Compile Time exeption hatasi verdi --> turu : Unhandled exception: java.io.IOException
            // burda more ations kismindan throwas firlattik usteki eklenti dahada genele dondu throws IOException bu method yanina eklendi main yanina
            // System.out.print(k); //bu sekilde calisirsa asici karsiliklari geldi = 749711897327511110897121100105114
            System.out.print((char)k);//type casting yaparak normal halini aldik ---> Java Kolaydir
        }

    }
}
