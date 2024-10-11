package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {
        // Student Class'tan bir instance(obje) oluşturalım
        Student ali = new Student(); // ali objesini ürettik
        System.out.println(ali.stdName); // Ali Can // public aynı paket
        System.out.println(ali.email); //ali@gmail.com // default aynı paket olduğu için ulaştı
        System.out.println(ali.address); // Istanbul // protected aynı paket olduğu için ulaştı
        // *****System.out.println(ali.tcKimlik); //private ulaşılamaz sadece aynı class içinden ulaşılır

        System.out.println(ali); // burda toString methodu dikkatsiz kullanılırsa veri sızması olur ulaşılmaması gereken
        // tcKimlik bilgisine ulaşıldı veri sızmasına yol açtı



    }
}
