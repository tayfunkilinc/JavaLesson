package d13array;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //      [12, 3, -3, 5, 23] ==> 3, -3

        int[] numbers = {12, 3, -3, 5, 23}; //bu daha hızlı bunu tek veri kabul ediyor diğer yolda ayrı ayrı veri kabul ediyor
        System.out.println(Arrays.toString(numbers)); //[12, 3, -3, 5, 23]

        for (int w : numbers){
            if (w < 5){
                System.out.println(w + "");
            }
            
        }
        //------------------
        //Ornek 2: Spesifik bir elemanin Array’de olup olmadigini anlamak icin gereken kodu yaziniz.
        //Example 2: Write the code to find out if a specific element is in Array

        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // “-” ==> isaretinin anlami eleman yok demektir

                /*
            Yani, metot şu şekilde çalışır:
            Diziyi ikiye bölün.
            Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
            Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
            Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
            Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
         */

        System.out.println("------------");
        String[] names = {"A", "T", "K", "E", "B"};

        Arrays.sort(names); // ilk ve son index i toplayı 2 ye bölüyor eğer tam sayı değilse alta yuvarlayıp bulduğu sayı indexini orta kabul ediyor
        System.out.println(Arrays.toString(names));

        int result = Arrays.binarySearch(names, "B"); // bu bana B nin indexini vercek
        System.out.println(result);

        /*"C" aramasını yaparsak -3 değerine ulaşırız sebebi veri grubunda olmadığı için
        * eğer olsaydı 2. sırada olurdu deyip başına eksi koyuyor ve -1 ekliyor 0 olmadan indexe bakıyor gibi*/



        //----------------------
        int[] arr = {2, 1, 7, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 6, 7]

        System.out.println(Arrays.binarySearch(arr, 2)); //1
        System.out.println(Arrays.binarySearch(arr, 7)); //3
        System.out.println(Arrays.binarySearch(arr, 3)); //-3
        System.out.println(Arrays.binarySearch(arr, 9)); //-5

        //---------------
        String[] s = {"A", "C", "B", "D"};
        Arrays.sort(s);

        System.out.println(Arrays.toString(s)); //[A, B, C, D]

        System.out.println(Arrays.binarySearch(s, "A")); //0
        System.out.println(Arrays.binarySearch(s, "C")); //2
        System.out.println(Arrays.binarySearch(s, "E")); //-5
        System.out.println(Arrays.binarySearch(s, "G")); //-5


        //----------------------------
        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        //Example 3: Write the code that shows you how many words are in a given sentence.
        //String s = "Java is easy. Learn Java earn money.";


        String s1 = "Java is easy. Learn Java earn money.";
        System.out.println(s1);

        String[] words = s1.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]

        System.out.println(words.length); //7





    }
}