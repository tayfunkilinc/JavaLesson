package d28ExeptionEnum;

public class E05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 0;
        String s = "My Java";
        getCharFromString(s,a,b); //a
        getCharFromString2(s,a,b);
    }
    //  1.YOL
    public static void getCharFromString(String s, int a, int b){  // birden fazla catch kullanabiliriz
        try {
            int indx = a / b; // indexi direk vermedik te belirli hesaplamalar sonrasinda elde ettik
            char ch = s.charAt(indx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Sifira Bolme Yapilamaz " + e.getMessage()); //  Sifira Bolme Yapilamaz/ by zero
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan Index Kullandiniz " + e.getCause()); //Olmayan Index Kullandiniz null
        }
    }
    //---------
    //  2.YOL  Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir
    public static void getCharFromString2(String s, int a, int b){  // birden fazla catch kullanabiliriz
        try {
            int indx = a / b; // indexi direk vermedik te belirli hesaplamalar sonrasinda elde ettik
            char ch = s.charAt(indx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println(" Bir Istisna Olustu " + e.getClass()); //  getClass ile exeption cesidini gorebilirsiniz
           // Bir Istisna Olustu class java.lang.ArithmeticException
        }
    }

}
