package d27Exeptions;

public class E05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(s,a,b); //a
    }
    public static void getCharFromString(String s, int a, int b){
        int indx = a / b; // indexi direk vermedik te belirli hesaplamalar sonrasinda elde ettik
        char ch = s.charAt(indx);
        System.out.println(ch);
    }
}
