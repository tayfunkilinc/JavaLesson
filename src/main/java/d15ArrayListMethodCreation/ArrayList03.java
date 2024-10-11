package d15ArrayListMethodCreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //      [12, 23, 10, 19] ==> 12 ve 10
        List<Integer> nums =new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(9);
        System.out.println(nums); // [12, 23, 10, 19]
        //Collections.sort(nums);  //[10, 12, 19, 23] //Listleri Sort() yapmak icin 1.yol:Collections yardimci class'i kullandik
        nums.sort(null); // [10, 12, 19, 23] Listleri sort() yapmak icin 2.yol ArrayList icindekini kullanir

        System.out.println(nums);
        //--------------------
        int minDiff = nums.get(1) - nums.get(0); //12-10 = 2 min fark olarak kabul ettik
        for (int i = 1; i < nums.size(); i++) { //1.index'ten baslattik ki, buyukten kucuk cikaralim siralama yaptigimiz icin
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));
        }
        System.out.println(minDiff); //2
        // farki bulduk en kucuk farki hangi sayidan elde ettigimizi bulalim
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i) + " ve " + nums.get(i-1)); //12 ve 10
            }
        }
        //ODEV: Bu soru tek for’la veya for each’le cozulebilir miydi?
    }
}
