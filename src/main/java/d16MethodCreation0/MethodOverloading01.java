package d16MethodCreation0;

public class MethodOverloading01 {
    public static void main(String[] args) {
        /*
        Polymorphism:
                    Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

                OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
                Polymorphism (cok bicimlilik) demektir.
                Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
        */
        /* i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
        aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.*/
        //String s ;
        //s.substring(int beginIndex);  ===> tek parametre
        //s.substring(int beginIndex, int endIndex);  ===> iki parametre almis
        //burda substring aşırı yüklenmiştir overloading
        add(123,321);
        add(12.12,21.21);
        //------------------------------
        String s = "Java";
        //NON-STATIC - STATIC
        //  s.substring() => Bu methodu bir string objesi üzerinden cağırırız. Böyle methodlara non-static denir.
        // Math.min() => böyle direk class ismiyle çağrılanlar statictir böyle methodlara statıc method denir.
        //------------------------------



    }
//    public static void  add(int a, int b){
//        System.out.println(a + b);
//    }
    public static void  add(double a, double b){
        System.out.println(a + b);
    }
//    public static void  add(double a, int b){
//        System.out.println(a + b);
//    }
    //NOT tür dönüşümü yapabildiği bir method varsa dönüşümü yapar daraltma yapmaz ama genişletme yaparak
    // uygun methoda dönüşüm yapar burda int a int b gönderiyor en yakın alttaki method olduğu için alttaki methodu kullandı.
    //ama üstteki methodda aktif olsaydı iki aynı türde dönüşümü seçeneği olduğu için hata verirdi
    public static void  add(int a, double b){
        System.out.println(a + b);
    }
    public static void  add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    //----------
    // Method ismi + Parametre = Method Signature (method imzası) benzersiz olmalıdır
     /* Method Overloading'de sadece parametreler degistirilir.
          Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

        Method Overloading icin;
        a) Parametre sayisini degistirebilirsiniz.
        b) Parametre data tiplerini degistirebilirsiniz.
        c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
        Dikkat:
        d)Method overloading olustururken return type'in, access modifier'in,
           static veya non-static olmanin hicbir etkisi yoktur.
           */
        /*
        Soru 1: private method'lar overload edilebilir mi?

        Cevap 1: private method'lar overload edilebilirler cunku;
        overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
        ulasilabilir oldugundan overload'a engel degildir.

        Soru 2: static method'lar overload edilebilir mi?
        Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
         */

}
