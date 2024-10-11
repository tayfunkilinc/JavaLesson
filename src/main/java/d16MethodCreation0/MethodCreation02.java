package d16MethodCreation0;

public class MethodCreation02 {
    public static void main(String[] args) {
        int result1 = multiply(3, 5);
        System.out.println(result1);

        int result2 = firstTwoMultiplyTrirdAdd(4,4,2);
        System.out.println(result2);
        print("Ali Evde Ne Ediyisin Çık Oyna");
    }
    //ornek 1: Iki sayiyi carpan bir method olusturunuz.
    //example 1: Create a method that multiplies two numbers

    //protected: Bu class’tan erisilebilir.
    //Bir de sadece miras alinan class’lardan erisilebilir(extends)
    protected static int multiply(int a, int b){
        return a * b;
    }
    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    //example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.
    //private : Buraya sadece ayni class icerisinden erisilebilir.Diger class’lar erisemez

    private  static int firstTwoMultiplyTrirdAdd(int a, int b, int c){
        return a * b +c;
    }
    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    //example 3: Create a method that prints an entered word to the console

    //Eger bir method yeni bir data uretmiyor ise return type’i void olur.void ise return yazilmaz

    public static void print(String str){
        System.out.println(str);
    }
}
