package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println(Student2.stdName); // Ali Can // stdName static olduğu için direk class ismiyle ulaştık

        //System.out.println(Student2.age); // age non-static olduğu için nesne oluşturmadan ulaşamayız

        Student2 ali = new Student2();


        System.out.println(ali.age); // 18 // nesne oluşturarak age değişkenine ulaştık

        Student2.staticMethod(); //Ben Static bi methodum. //static olduğu için direk class üzerinden ulaştık
        ali.nonStaticMethod();  // Ben Non-Static bir methodum. // non static olduğu için nesne üzerinden ulaştım

        //neden static - neden non-static kullanıyoz bunu sub string ile inceleyelim
      // non static
       /* String s = "Java Kolaydır";
        s.substring(0,3); ---- veri alınması gereken methodtları non- satatic yaparız

        String.substring(0,3); // hata -- static te direk ulaşıldığı için veri gönderemessin bunedenle veri yokki üzerinde işlem yapılsın
        */

    }
}
