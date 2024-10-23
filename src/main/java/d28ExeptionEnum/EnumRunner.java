package d28ExeptionEnum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
       // Cities c = new Cities(); // HATA  Enum types cannot be instantiated --> Enum turleri baslatilamaz Enumdan obje uretilemez

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.AKSARAY;
        System.out.println(il); //AKSARAY

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi= Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara’nin posta koduna ulasalim
        String ilPostCode = Cities.ANKARA.getPostalCode();
        System.out.println(ilPostCode); //16000

        //4- Antalya’nin plaka koduna ulasalim
        System.out.println(Cities.ANTALYA.getPlateCode()); // 7

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //*** values() methodu enum icindeki tum datalari bir Array icinde bize verir
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Plaka Kodunu Giriniz");
        int plaka = input.nextInt();

        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler)); // [ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI, AMASYA, ANKARA, ANTALYA, ARTVİN, AYDIN, BALIKESİR, BİLECİK, BİNGÖL, BİTLİS, BOLU, BURDUR, BURSA, ÇANAKKALE, ÇANKIRI, ÇORUM, DENİZLİ, DİYARBAKIR, EDİRNE, ELAZIĞ, ERZİNCAN, ERZURUM, ESKİŞEHİR, GAZİANTEP, GİRESUN, GÜMÜŞHANE, HAKKARİ, HATAY, ISPARTA, MERSİN, İSTANBUL, İZMİR, KARS, KASTAMONU, KAYSERİ, KIRKLARELİ, KIRŞEHİR, KOCAELİ, KONYA, KÜTAHYA, MALATYA, MANISA, KAHRAMANMARAŞ, MARDİN, MUĞLA, MUŞ, NEVŞEHİR, NİĞDE, ORDU, RİZE, SAKARYA, SAMSUN, SİİRT, SİNOP, SİVAS, TEKİRDAĞ, TOKAT, TRABZON, TUNCELİ, ŞANLIURFA, UŞAK, VAN, YOZGAT, ZONGULDAK, AKSARAY, BAYBURT, KARAMAN, KIRIKKALE, BATMAN, ŞIRNAK, BARTIN, ARDAHAN, IĞDIR, YALOVA, KARABÜK, KİLİS, OSMANİYE, DÜZCE]

        if (plaka < 1 || plaka>81) {
            System.out.println("Lutfen 1 ile 81 arasinda bir plaka kodu giriniz");
        }else {                         //[ADANA, ADIYAMAN, AFYONKARAHİSAR burda dikkat et bu veriler Cities turunde o sebeple dongu icini Cities turunde tanimladik
            for (Cities w : sehirler){
                if (plaka == w.getPlateCode()){
                    System.out.println("Girmis Oldugunuz Plaka " + w.getCityName() + " iline aittir");
                    break; // bu olmassa 81 ilin tamamini tarar bosa calisma gerceklesir
                }
            }
        }




    }
}
