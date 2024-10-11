package d14MultidimensionalArrays;

import java.util.ArrayList;

public class Md03 {
    public static void main(String[] args) {
        //Ornek 1: int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        //Example 1: Find the sum of the smallest and largest element in a Multidimensional Array of type int.

        int[][] ages = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47
        //herhangi bir elemani referans olarak kabul edip basliyoruz
        int smalest = ages[0][0]; // 15
        int biggest = ages[0][0]; // 15
        for (int[] w: ages){
            for (int k : w){
                smalest = Math.min(smalest, k);
                biggest = Math.max(biggest, k);
            }
        }
        System.out.println(smalest); //4
        System.out.println(biggest); //43
        System.out.println(smalest + biggest); //47

    }
}
