package d13array;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.
        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements


        int[] ages = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages)); // [20, 23, 19, 44, 15, 32]

        //1.yol
        System.out.println("1.Yol-----------------");
        Arrays.sort(ages); // sıralama işlemi yaptık
        System.out.println(Arrays.toString(ages)); // [15, 19, 20, 23, 32, 44]


        System.out.println(ages[0] + ages[ages.length - 1]); // en büyük ve en küçüğü topladım

        //2.yol
        int[] ages2 = new int[6];

        ages2[0] = 20;
        ages2[1] = 23;
        ages2[2] = 19;
        ages2[3] = 44;
        ages2[4] = 15;
        ages2[5] = 32;

        System.out.println("2.Yol-----------------");
        //0. index min ve max olarak varsayılır ve buna göre referans alarak büyükmü küçükmü kıyaslanarak sıralanır

        int minimum = ages2[0];
        int maximum = ages2[0];

        for(int w : ages2){
            minimum = Math.min(minimum, w); //tek tek karşılaştırıp minimum içine yükleyecek bildiğim gibi tek tek karşılaştırıp yer değiştiriyor
            maximum = Math.max(maximum, w);

        }
        System.out.println(minimum + maximum);



















    }
}
