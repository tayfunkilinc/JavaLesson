package d19stringbuilder_buffer_accessmodifier_static;

public class Student {

            /* Access Modifier (Erişim Belirleyici)

           1)public
           2)protected
           3)default
           4)private

           public > protected > default > private

           public      ==> public olanlar her class'dan kullanilabilir
           protected   ==> protected olanlar baska package'lardan kullanilamaz,
                        ancak baska package'larda child classlar icinden kullanilabilir
                        //protected akrabalık ilişkilerine dayanır dışarıya kalıdır ama akrabalarına açıktır
           default     ==> default olanlar baska package'lardan kullanilamazlar
           private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

           Soru: "protected ile default" arasindaki farki söyleyiniz?
           Cevap: protected olanlar baska package'lardan kullanilamaz ancak baska package'larda
           child classlar icinden kullanilabilir. default olanlar baska package'lardan kullanilamazlar
        */
    public String  stdName = "Ali Can"; // heryerden ulaşılır
    protected String address = "Istanbul";  //başka paketten ulaşılamaz ama akrabası miras alacaklar child lar görür
    String email = "alican@gmail.com"; // hiç bir şey yazmassak default olur - başka paketten ulaşılamaz buna sadece aynı paketten ulaşılır ama aynı paketteyse ulaşılır
    private String tcKimlik = "1234567891"; // burda aynı paket içinde dahi olsa ulaşılamaz

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                '}';
    }
}
