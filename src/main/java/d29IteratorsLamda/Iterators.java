package d29IteratorsLamda;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        /*
        1)  Iterator'ler loop'larin yaptigi ayni isi yapar
        2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
        3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
        4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir
        5) Iki tip iterator vardir:
            a) Iterator:
                Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
            b) ListIterator:
                Bu eleman silebilir, ekleyebilir ve degistirebilir

            Not:
            Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
            ListIterator iki yonlu calisabilir
         */
        //-----------methodlar
        //hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean) -- sirasiyla varsa true ureterek gider yoksa false ureterek gider
        //next() : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir --->
        //remove() : Pointer'in atladigi elemani siler --> geride kalan elemani siler
        //--------------


        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");

        System.out.println(myList); // [Tom, Jim, Clara, Fatma, Mustafa]

       Iterator<String> myIterator =  myList.iterator();
       //System.out.println(myIterator); //java.util.ArrayList$Itr@7b23ec81 adres geldi dogrudan yazdirilamazlar
//        while (myIterator.hasNext()){ // en basa konumlana pointer dan sonra eleman varmi diye bakar varsa true yoksa false uretir
//            myIterator.next(); // pointer'i bir sonraki elemanin onune alir ve atladigi elemani verir
//            myIterator.remove();// next'in atladigi elemani siler next() inceler gecer remove da inceledigini siler
//        }
//        System.out.println(myList); //[] --> tum elemanlari kaldir di


        //-----------------
        //specific bir elemani iterator ile nasil silebiliriz? (Tom’u silelim)
        while (myIterator.hasNext()){
            String el = myIterator.next();
            if (el.equals("Tom")){
                myIterator.remove();
                break;
            }
        }
        System.out.println(myList); //[Jim, Clara, Fatma, Mustafa] --> tom silindi ve dongu durduruldu

        //------------------
        //ListIterator
        List<String> yourList = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList); // [Ali, Can, Aliye]

        ListIterator<String> yourListItr = yourList.listIterator();

        //1) set(E e): Koleksiyonun geçerli elemanını değiştirir.

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + "*");
        }
        System.out.println(yourList); //[Ali*, Can*, Aliye*]

        //---------------
        //2)elemanlari sondan basa dogru yazdirin
        List<String> yourList2 = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList2); // [Ali, Can, Aliye]

                                                                 // [Ali, Can, Aliye]
        ListIterator<String> listItr2 = yourList2.listIterator();

        //Bu loop pointeri en sona almak icin yazildi
        while (listItr2.hasNext()){ // burda pointer'i sona tasidik ordanda geriye dogru okuyarak elemanlari tersten yazdiracagiz
            listItr2.next();
        }
        while (listItr2.hasPrevious()){ // burda hasPrevious elemanin soluna bakiyor true false donderiyor
            String el = listItr2.previous(); // burda previous elemani getirir -- next gibi pointerin atladigi eleman degerini getirir.
            System.out.println(el + " <-- ");
                    //Aliye <--
                    //Can <--
                    //Ali <--

        }
    }
}
