package d31Lambda;

public class Utils {
    /*Java'da "Utils" (fayda-araclar-utilities) class'i oluşturmanın temel mantığı,
    belirli bir konsept veya işlevsellikle ilgili yardımcı (helper) metotları bir araya toplamaktır.
    Bu class'lar genellikle static metotlardan oluşur ve doğrudan class adı üzerinden çağrılırlar.

    *********Buraya  Java'da olmayan ama bizim surekli projemizde kullandigimiz bir islevi method olarak ekleriz
    ve onu cagirip kullaniriz. Amaca uygun yeni methodlar olusturabiliriz.*/

    // burda ayni amaca yonelik kodlari methoda dokup istedigimiz yerde kullanmak icin olusturulan bir class tir utils

    public static void printInTheSameLineWithSpace(Object obj){ // bu en ust class oldugu icin buna parametre ne gelirse kabul edecek
        System.out.print(obj + " ");
    }

    //----------------------
    public static boolean isNumberEven(int num){
        return num % 2 == 0;
    }


}
