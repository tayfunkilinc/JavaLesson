package d29IteratorsLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        Lambda ifadeleri, Java 8 ile birlikte tanıtılan ve fonksiyonel(methodsal) programlamayı
        kolaylaştırmak için kullanılan bir özelliktir.

        Lambda ifadelerinin genel avantajları:
        1- Daha az kod yazma: Lambdalar, daha az ve daha okunabilir kod yazmanızı sağlar.
        2- Fonksiyonel programlama: Java'nın fonksiyonel programlama özelliklerini kullanmanıza yardımcı olur.
        3- İsimsizdir: Lambda ifadeleri, bir isme sahip değildir.(method ismi yoktur)
        4- Tek bir ifade içerebilir: Lambda ifadeleri, bir veya daha fazla işlem gerçekleştiren tek
        bir ifade içerebilir.
        5- Bir veya daha fazla parametre alabilir*/

         /*1) Lambda Functional Programming'dir, digeri "Structured Programming" dir
        Structured Programming: Yapısal programlama, programların belirli yapılar veya kontrol yapıları
        (örneğin döngüler, şartlı ifadeler) kullanılarak yazılmasını teşvik eden bir programlamadir.
        2) Functional programming, Collection'lar ve Array'ler ile yaygin olarak kullanilir.(Map'lerde direkt kullanilmaz
        entrySet ile Set'e cevrilirse kullanilabilir)*/

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));
        printElements1(nums); // 12 9 131 14 9 10 4 12 15 -- Eski Yapiyla yapim
        System.out.println();
        printElements2(nums); //12 9 131 14 9 10 4 12 15 -- Lambda ile yapim
        System.out.println();
        printEvenElements1(nums); //12 14 10 4 12
        System.out.println();
        printEvenElements2(nums); //12 14 10 4 12

    }
            //1) ESKI YOLLA YAPALIM: Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
            // yazdiran method'u olusturunuz.(Structured == Yapisal)
            //1) List elements on the same line with a space between them create the method that writes
     public static void printElements1(List<Integer> nums){   /////BURADAKI @ isareti null kontrolu yapmadin listen bos ise sorun olabilir uyarisi veriyor
        for (Integer w : nums){
            System.out.print(w + " ");
        }
    }

            //2)LAMBDA ILE YAPALIM:  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
            //   yazdiran method'u olusturunuz.(Functional)
            // 2) List elements in a list on the same line with a space between them
            // create the method that writes.(Functional)

    //stream() metodu, koleksiyonları bir akışa (stream) dönüştürerek üzerinde işlem yapmayı sağlar.
    //Akışın (stream) adı, verinin bir kaynaktan hedefe doğru "akmasını" ifade eder.
    public static void printElements2(List<Integer> nums){
        nums.stream().forEach(t -> System.out.print(t + " ")); // akistan gelen her bir t degeri icin ne yaptirmak istiyorsam -> (erov) ile onu yaziyoruz
        // burda gelen degerleri ekrania yazdiracak
    }

    //Örnek 3: ESKI YAPIYLA YAPALIM: Bir List<Integer> içindeki tüm çift sayıları bulun ve bu sayıları aynı satırda,
    // aralarında bir boşluk olacak şekilde konsola yazdıran bir metod yazınız.(Structured)
    //Example 3:Find all even numbers in a List<Integer> and write a method that prints these numbers to the console on the same line,
    // with a space between them.(Structured)

    public static void printEvenElements1(List<Integer> nums){
        for (Integer w : nums){
            if( w % 2 == 0){
                System.out.print(w + " ");
            }
        }
    }
    //--------------------------
    //Örnek 4: LAMBDA ILE YAPALIM:  Bir List<Integer> içindeki tüm çift sayıları bulun ve bu sayıları aynı satırda,
    // aralarında bir boşluk olacak şekilde konsola yazdıran bir metod yazınız.(functional)
    //Example 4: Find all even numbers in a List<Integer> and write a method that prints these
    // numbers to the console on the same line, with a space between them.(functional)

    //Stream API’si ile birlikte sıkça kullanılan bazı metodlar şunlardır:
    //1) filter(): Koşulu karşılayan elemanları filtreler.
    public static void printEvenElements2(List<Integer> nums){
        nums.stream().filter(t-> t%2 ==0).forEach(t -> System.out.print(t + " "));
        // burda filter ile bir baraj kurduk 2 ye bolumunden kalan 0 olanlari secip forEach() ile ekrana yazdirma islemini yaptim

    }



}
