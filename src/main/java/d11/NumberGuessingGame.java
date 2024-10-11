package d11;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0-100 arası rasgele sayı üretelim tam sayı olarak

        int rastgeleSayi = random.nextInt(101); //0-100 arası sayı üretir 0 dahi 101 dahil değil
        //ondalıklı sayı üretebilirmiyiz araştır

        //Kullanıcının Kaç Kere Tahmin Yaptığını Takip İçin Sayaç Oluşturalım

        int denemeSayisi = 0;
        //kullanıcının  yaptığı tahmini saklamak için bir değişken oluşturalım

        int tahminEdilen; // int tahminEdilen =""; böyle çalışırmı bir bak

        //Kullanıcının Sayıyı Doğru tahmin edip etmediğini kontrol etmek için bir
        //boolean değişken oluşturalım
        boolean tahminDogrumu = false;

        System.out.println("0-100 arasında Bir Sayıyı Tahmin Etmeye Çalışın");
        do {
            //kullanıcıdan bir tahmin alalım
            System.out.println("Tahmininizi Yapınız");
            tahminEdilen = scanner.nextInt();

            //Sayacı Bir Arttıralım
            denemeSayisi++;

            //Tahmini Kontrol Edelim
            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayı Daha Büyük");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayı Daha Küçük");
            }
            else {
                tahminDogrumu = true;
                System.out.println("Tebrikler Doğru Tahmin");
                System.out.println("Deneme Sayısı: " +denemeSayisi);
            }


        }while (!tahminDogrumu); //dögü tahmin doğru olduğunda kırılacak
    }
   // scanner.close(); //bunu burda kapatmalıyız elektiriği kesmeden çıkmak boşa masraftır
    //random class kapatılacak mı bir bak



}
