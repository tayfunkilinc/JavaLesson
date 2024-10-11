package d14MultidimensionalArrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Cok boyutlu dizi (MultiDimensional Array) temel olarak Array’in içine Array koymak anlamına gelir.
        // En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
        // İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.

        //MultiDimensional Array nasil olusturulur?

        int[][] a = new int[3][2]; //3 dıştaki 2 içteki eleman sayıs

        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 0;

        //MultiDimensional Array konsola nasil yazdirilir?

        System.out.println(Arrays.toString(a)); // [[I@7b23ec81, [I@6acbcfc0, [I@5f184fc6]
        //coklu arrayleri yazdirirken toString() degil, deepToString() methodunu kullaniriz
        System.out.println(Arrays.deepToString(a));

        //MultiDimensional Array’den spesifik bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);
        //MultiDimensional Array icindeki bir Array nasil yazdirilir?
        System.out.println(Arrays.toString(a[2])); // coklu arrya icinden herhangi bir inner array yazdirmak icin kullaniyoruz

        //Kisa yoldan MultiDimensional Array nasil olusturulur?
        String[][] students = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan"," Burhan"}};

        System.out.println(Arrays.deepToString(students));
        System.out.println("----------------");

        //Ornek 1: Yukaridaki students array’inde toplam kac isim oldugunu bulunuz.
        //Example 1: Find the total number of names in the students array above.

        int sum = 0;
        for (String[] w : students){
            sum = sum + w.length;
        }
        System.out.println(sum);

        System.out.println("---------");
        //Ornek 2: Yukaridaki students Array’inde icinde “m” olan isimleri console’a yazdiriniz.
        //Example 2: Write the names with “m” in the students Array to the console
        for (String[] w : students){
            for (String k : w){
                if (k.contains("m")) {
                    System.out.println(k); //Kemal //Cemal
                }
            }
        }
    }
}
