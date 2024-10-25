package d30Lambda;

import java.util.*;

public class Lambda03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10)); // burda sayilari surekli degistirdik calisirken ciktilar degisebilir dikkat et
        //printCubeOfDistinctOddElements(nums); //3. ornek icin method
        //printSumOfSquaresOfDistinctEvenElements(nums);
        //printProductOfSquareOfDistinctEvenElements(nums);
        //maksimum1(nums);
        //maksimum2(nums);
        //maksimum3(nums);
        //maksimum4(nums);
        //minimum1(nums);
        //minimum2(nums);
        //minimum3(nums);
        //minimum4(nums);
        minimum5(nums);
    }
    //---------------------------------------------
    //3) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //3) Create a method that prints the cubes of odd numbers in a list of integers,
    // without repeating, on the same line, with spaces between them. (Functional)

    public static void printCubeOfDistinctOddElements (List<Integer> nums){
        //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir
        //1,2,2,2,3,3,4,4,5 olani 1,2,3,4,5 olarak tekrarsiz hale getirir distinct()
        nums.stream().distinct().filter(t -> t%2 !=0).map(t -> t*t*t).forEach(t-> System.out.print(t + " ")); // 27 125
                // eleme yapan methodlari basta kullanki sayilar azalsin ram'e dusen yuk azalsin


    }
    //-----------------------------------------------
    //4)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //4)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger. -- tum elemanlari toplar, cikartir, carpar, boler, min, max, ortalama alir,
        //  3 + 5 = 8 bu sekilde ornegin iki sayiyi teke indirdi

        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

        /*Java'da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
        Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
        Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/

      /*  bu sekildede olur
      int toplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 ==0).
                map(t-> t * t).
                reduce(0,(a,b) -> a + b);
                */
        //bu sekilde Method Reference olarak kullanimi daha tercih edilendir
        int toplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 ==0).
                map(t-> t * t).
                reduce(0, Integer::sum); //burda Integer::sum method referace olarak kullanmak diye adlandirilir
        // ilk parametre toplama icin 0 carpma icin 1 verilir
        //(a,b) -> a + b burda iki degisken olusturup ne yapacaklarini soyledik a + b
        System.out.println(toplam); //104
        // akistan gelenler b'ye yuklenir. ilk deger ve ara toplamlar a'ya yuklenir
    }

    //----------------------------------------
    //5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.
    //5) Create a method that calculates the product of the squares of all non-repeating even numbers in a list.

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){
        int carpim = nums.stream().distinct().filter(t -> t%2 ==0).map(t -> t*t).reduce(1, (a,b)->a*b);
        System.out.println(carpim); // 64
    }

    //6)Verilen List’teki maksimum değeri bulmak için bir method oluşturun.
    //6)Create a method to find the maximum value in the given List

    // 1.YOL
    public static void maksimum1(List<Integer> nums){
        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)
        //karsilastirma yapmak icin ilk bir deger vermemiz gerek onun icin bu kucuk degeri ilk deger olarak vercegiz

        int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (a,b)-> a > b ? a : b); // a > b ? a : b ternary kullandik burda bir if else blogu ile kosullu cozume gittik
        System.out.println(max);// 11
    }
    //2.YOL
    public static void maksimum2(List<Integer> nums){
        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)
        //karsilastirma yapmak icin ilk bir deger vermemiz gerek onun icin bu kucuk degeri ilk deger olarak vercegiz

        int max = nums.stream().distinct().reduce(nums.get(0), (a,b)-> a > b ? a : b);
        // Integer.MIN_VALUE baslangic karsilartirma degrini nums.get(0) yani listenin ilk degeride kabul edebiliriz burada amac bir karsilastirma degeri vermektir
        //liste icinden bir deger veya cok cok kucuk bir deger verilebilir
        System.out.println(max);// 11
    }
    //3.YOL
    public static void maksimum3(List<Integer> nums){
        //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)

        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();// siraladigimiz icin u her zaman t den buyuk oldugu icin u yu almak yeterli ama
        // reduce tek parametreli kullanilinca Optional deger geri donderir bu Oprional null kontrolu ister bizde Integer a cevirerek null kontrolunu gormemezlikten geldik
        // get() methodu geri donen Optional degeri Integer degere ceviriyor
        System.out.println(max); //11
    }
    //4.YOL : Best Practice
    public static void maksimum4(List<Integer> nums){
        //Java’da :: işareti, “Method Reference” olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.

        Integer max = nums.stream().distinct().reduce(Math::max).get(); // en iyi kullanim bu max methoda direk :: bu isaret ile ulasak kullanimini yapabiliriz
        System.out.println(max); //11
    }

    //-------------------------------------------------------
    //7)Verilen List’teki minimum değeri bulmak için bir method oluşturun.
    //7)Create a method to find the minimum value in the given List

    //1.YOL
    public static void minimum1(List<Integer> nums){
        int min = nums.stream().distinct().reduce((a, b) -> a>b ? b: a).get();
        System.out.println(min); //2
    }

    //2.YOL
    public static void minimum2(List<Integer> nums){
        //sorted(Comparator.reverseOrder()) ifadesi,
        // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
        //Comparator class, reverseOrder() methoddur.
        //2, 3, 4, 5, 11, 10 ----> 2, 3, 4, 5, 11, 10 --> 11,10,5,4,3,2
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((a,b)-> b).get();
        System.out.println(min); //2
    }

    //3.YOL
    public static void minimum3(List<Integer> nums){
        /*Integer min = nums.
                stream().
                distinct().
                sorted(). //2,3,4,5,10,11
                        reduce((t, u) -> t).get();
        System.out.println(min); */

        // buradada Optional turunde tamimlama yaparak get() kullanimina gerek kalmadi ama bos gelme olasigini if-else ile kontrol edecegiz
        Optional<Integer> min = nums.stream(). //2,3,4,5,10,11
                distinct().sorted().reduce((t,u)->t);

            if (min.isPresent()){ // isPresent degerin mevcut olup olmadigini kontrol edip boolean deger donderir
                System.out.println(min);// Optional[2]
            }else {
                System.out.println("Min deger Bulunamadi");
            }
    }

    //4.YOL
    public static void minimum4(List<Integer> nums){
       Integer min = nums.stream().distinct().reduce((t,u) -> Math.min(t,u)).get(); // burda min methodunu dogrudan kullandik refrance kullanimi :: ile yapilir
        System.out.println(min); // 2
    }

    //5.YOL
    public static void minimum5(List<Integer> nums){
        /*Integer min = nums.stream().distinct().reduce((t,u) -> Math.min(t,u)).get(); // burda min methodunu dogrudan kullandik refrance kullanimi :: ile yapilir
        System.out.println(min); // 2
        */

        Integer min = nums.stream().distinct().reduce(Math::min).get(); //  bu sekildede referance ile kullanimini yaptik
        System.out.println(min); // 2
    }

}
