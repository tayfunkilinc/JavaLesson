package d31Lambda;

import java.util.stream.IntStream;

public class Lambda06 {
    public static void main(String[] args) {
        //System.out.println("getSumFromSeventoSeventy() = " + getSumFromSeventoSeventy());  // //getSumFromSeventoSeventy() = 2464
        //System.out.println("getMultiplicationFromThreeToNine1() = " + getMultiplicationFromThreeToNine1()); //getMultiplicationFromThreeToNine1() = 181440
        //System.out.println("getMultiplicationFromThreeToNine2() = " + getMultiplicationFromThreeToNine2()); //getMultiplicationFromThreeToNine2() = 181440
        //System.out.println("getFactorial() = " + getFactorial(-1)); //Gecersi Data Girdiniz getFactorial() = -1
        System.out.println("getSumsOfBetweenTwoInteger(5,12) = " + getSumsOfBetweenTwoInteger(12, 5)); //getSumsOfBetweenTwoInteger(5,12) = 24


    }

    //-----------------------------
    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    //1) Write the code that returns the sum of all integers from 7 to 70
    public static int getSumFromSeventoSeventy(){
        /*
        a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)
        b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
        temsil eden bir akış oluşturur.
        c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
        temsil eden bir akış oluşturur.
        d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir. // bir yerde Exact gorursen tasma kontrolu yaptigini anlamalisin
        e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
        Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
        */
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt(); //getSumFromSeventoSeventy() = 2464
        // ardisik sayilarla islem yapmak icin IntStream
        // rangeClosed baslangic ve sonu dahil aolan araligi getirir ardisik olarak
        //Math::addExact tasma konrolu yapar toplama islemi yapar taasmayi kontrol eder
        //getAsInt  gelen degeri int e donusturur

    }

    //-----------------------------
    //2) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //2) Create a method that multiplies all integers from 3 to 9.

    //1.YOL
    public static int getMultiplicationFromThreeToNine1(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }

    //2.YOL
    public static int getMultiplicationFromThreeToNine2(){
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt(); // range baslangic dahil son yazilan haric
    }

    //---------------------------
    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    //3)Write the code that calculates the factorial of the given number.

    public static int getFactorial(int x){
        //3! = 1 * 2 * 3 = 6
        //0! = 1
        //Negatif sayıların faktöriyeli yoktur

        if (x == 0){
            return 1;
        } else if (x< 0) {
            System.out.println("Gecersi Data Girdiniz");
            return -1; // burda mecbur bir return gerekli buraya girme olasiligi oldugu icin
        }else {
            return  IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt(); // burda x e 1den buyuk durumlari gonderrebiliriz onun icin kotrolle calistiracagiz
        }
    }

    //-----------------------------
    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    //4)Write the code that gives you the sum of all even numbers between two given integers.
    //beginning and ending are not included.
    public static int getSumsOfBetweenTwoInteger(int a, int b){

        //Yer degistirme Algoritmasi --> bunu yaptigimizda artik hangisinin buyuk kucuk gonderimi fark etmeyecek
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1, b).filter(Utils::isNumberEven).sum();
        //sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür.
    }




}
