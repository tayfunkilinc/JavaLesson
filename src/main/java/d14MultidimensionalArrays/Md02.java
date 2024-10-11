package d14MultidimensionalArrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.
        //Example 1: Convert a two-dimensional Array to a one-dimensional Array.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers ={{5, 4}, {2, 3, 2}};
        // iki boyutlu arrayde kac eleman oldugunu bulalim

        int totalNumberOfElement = 0;

        for (int[] w : numbers){
            totalNumberOfElement = totalNumberOfElement + w.length; //5
            //bunu yeni olusturacagimiz 1 boyutlu array boyutunu belirlemek icin kullaniyoruz
        }
        //2.adim: Tek boyutlu Array’i, iki boyutlu Array’in eleman sayisini kullanarak olusturalim

        int[] newArr = new  int[totalNumberOfElement];
        System.out.println(Arrays.toString(newArr)); //[0, 0, 0, 0, 0]

        //icinde dolarip tek boyutlu diziye aktarma yapacagim
        int idx = 0;
         for (int[] w : numbers){
             for (int k : w){
                 newArr[idx] = k;
                 idx++;
             }
         }
        System.out.println(Arrays.toString(newArr));








    }
}
