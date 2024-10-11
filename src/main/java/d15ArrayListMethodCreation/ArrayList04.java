package d15ArrayListMethodCreation;

import java.util.Arrays;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        //Bir list olusturmak icin kisayol
        List<Integer> myList = Arrays.asList(1, 3, 4, 9, 7);
        System.out.println(myList);
        // dogrudan yazdirabildigimiz icin bu listtir
        // kisa yolla olurturmanin dez avantajlari vardir
        //1- Arrays.asList() ile oluşturulan liste, sabit boyutludur. Array gibi calismaya baslar.
        // Bu, listenin boyutunu değiştiremezsiniz; yani yeni eleman ekleyemez veya çıkaramazsınız.
        //Listin eleman sayisini degistiren methodlari kullanamazsiniz.
        //2- Arrays.asList() ile oluşturulan liste, bazı liste işlemlerini desteklemez.
        // Örneğin, remove(), add(), clear() gibi yöntemler desteklenmez. Ama set() veya size() kullanabilirsiniz
        //clear() metodu, bir listedeki tüm elemanları silmek için kullanılır.

        //--------------
        // myList.remove(0); // HATA kullanilamiyor boyutu sabitlendigi icin
        // myList.add(3); // HATA
        // myList.clear(); // HATA elemanlari komple silemessiniz
        myList.set(0,5); //eleman sayisinda degisiklik vermedigimiz icin hata vermez calisir
        System.out.println(myList); //[5, 3, 4, 9, 7]
        System.out.println(myList.size()); //5 eleman sayisinda degisiklik vermedigimiz icin hata vermez calisir






    }
}
