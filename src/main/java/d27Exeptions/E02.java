package d27Exeptions;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "1234";
        convertStringToInt(s); // 1235 cevirme islemi basali
        String b = "1234a";
        convertStringToInt(b); //NumberFormatException HATA metni sayisal degere donustururken bu hatayla karsilasabilirz
        //try-catch bolklari olunca hata mesajini biz duzenleyip programin kitlenmesini onledi
        //Donusum Icin Rakam Disi Karakter Kullanmayiniz : For input string: "1234a"
        
    }
    public static void convertStringToInt(String s){
        try {
            int intS = Integer.valueOf(s); // bu gelen veriyi int degerine cevirir
            System.out.println(intS +1);
        }catch (NumberFormatException e){
            System.out.println("Donusum Icin Rakam Disi Karakter Kullanmayiniz : " + e.getMessage());
        }
    }
}
