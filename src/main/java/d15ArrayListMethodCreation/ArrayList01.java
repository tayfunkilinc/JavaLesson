package d15ArrayListMethodCreation;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class ArrayList01 {
    public static void main(String[] args) {
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan
        // bir list elde ediniz.
        //Example 1: From a list with repeated elements, obtain a list with non-repeated elements.
        //      [J, a, v, a, v] ==> [J, a, v]
        //Bir interface, bir class'a nasıl davranması gerektiğini tanımlayan bir sözleşmedir.
        // Bir class, bir interface'i implement ettiğinde, interface'deki
        // tüm yöntemleri implement etmelidir.

        //List'i kullanmak, kodunuzun daha esnek ve uyumlu olmasını sağlar.
        //List tipinde bir değişken tanımladığınızda, bu değişkenin farklı List implementasyonlarını
        // (örneğin ArrayList, LinkedList, Vector vb.) tutabilmesi mümkündür.
        List<Character> a = new ArrayList<>(); //sag taraf contructure ArrayList<Character> a = new ArrayList<>();
        //List interface dir ArrayList, List interfeceini kullaniy
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a); // [J, a, v, a, v]
        List<Character> b = new ArrayList<>();
        for (Character w : a){
            if (!b.contains(w)) {// b listinde donguden gelen eleman yoksa
                b.add(w);
            }
        }
        System.out.println(b); //[J, a, v]

    }
}
