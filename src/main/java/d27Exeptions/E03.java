package d27Exeptions;

public class E03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        //selectChar(s,2); //v
        selectChar(s,4); //StringIndexOutOfBoundsException HATA si olmayan bir indexin cagrilmasi sonucu bu tur bir hata aliriz
    }
    public static void selectChar(String s, int indx){
        try {
            char ch = s.charAt(indx); // yazdigimiz indexteki karakteri getirir.
            System.out.println("ch = " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan Index Kullanmayiniz: " + e.getMessage()); // burdaki err uyarinin kirmizi renkte verilmesine olanak sagliyor
            //Olmayan Index Kullanmayiniz: Index 4 out of bounds for length 4
            e.printStackTrace(); // bunu kod yazan hatayi gormek isterse yazar, exeption i gosterir ama firlatmaz kodlar alttan calismaya devam eder
        }
        System.out.println("Uygulama Calismaya Devam Ediyor"); // HATA versede try catch bloklarindan sonra devam eder
    }
}
