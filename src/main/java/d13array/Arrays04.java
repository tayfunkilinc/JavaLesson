package d13array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)

        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr ={0, 2, 3, 0 ,12, 0};
        int[] newArr = new int[arr.length];

        System.out.println(Arrays.toString(arr));  //[0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(newArr)); //[0, 0, 0, 0, 0, 0]

        int firstIndex = 0; //indexlere yükleme yaptıkça bunu bir arttıracağız

        for (int w : arr){

            if(w != 0){
                newArr[firstIndex] = w; //gelen sayıyı verilen indexe yükleme işlemini yaptık
                firstIndex++; //üst üste yükleme olmasındiye index arttırma yaptık
            }

        }
        System.out.println(Arrays.toString(newArr));


    }
}
