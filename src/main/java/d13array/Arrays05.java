package d13array;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        //Arraylerin eşit olup olmadığı nasıl anlaşılır

        //Iki arrayin ayni olabilmesi icin,aynı uzunluğa sahip olmaları
        // ve ayni index te ayni elemanlarin bulunmasi gerekir


        int[] a = new int[3];

        a[0]=2;
        a[1]=1;
        a[2]=3;

        int[] b = new int[3];

        b[0]=2;
        b[1]=1;
        b[2]=3;

        boolean result = Arrays.equals(a,b);
        System.out.println("result =" + result);
    }
}
