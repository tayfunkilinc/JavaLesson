package d28ExeptionEnum;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        //6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.

        printAge(25); // 25
        printAge(-5); // -5 // HATA burda -5 yazdirdi fakat -5 diye bir yas olmaz HATA

    }
    //Girdigimiz yasi konsola yazdiran bir method olusturalim
    public static void printAge(int age){ // burda program duracak durmasini istemiyorsan icinde tekrar try-catch kullanarak istersen negatifi pozitife cevirebilirsin
        if (age < 0) {
            throw new IllegalArgumentException("Yasi NEgatif Girmeyiniz");// IllegalArgumentException: Yasi NEgatif Girmeyiniz
        }else{
            System.out.println(age);
        }
    }
}
