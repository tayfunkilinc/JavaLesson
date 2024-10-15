package d23OopCollections;

public interface Engine { //araba motorunu olusturduk
    // arayuzler interface kelimesi ile olusturulur
    /*Interface (arayüz), class'larin uygulayabileceği bir "sözleşme" olarak düşünülebilir.
     Bir interface, bir veya daha fazla abstract method içerir ve
    bu methodların imzalarını (adlarını ve parametrelerini) belirtir,
    ancak bu methodların nasıl uygulanacağını tanımlamaz.
    Class'lar, bu interface'leri uygulayarak (implement ederek) bu methodları
    kendi ihtiyaçlarına göre tanımlarlar.*/

    //i) interface icindeki method'lar otomatik olarak 'public' dir,
    // bu yuzden interface'lerde method olustururken access modifier yazmayiz.(static degillerdir)

    //ii) interface icindeki method'lar otomatik olarak 'abstract' dir, bu yuzden interface'lerde
    // abstract method olustururken 'abstract' keyword'unu ve 'method body' sini yazmayiz.
    // public abstract void eco(); // interface icinde bastaki public abstruct kelimelerine gerek yoktur ottomatik olarak public ve abstruct olurlar

    /*
       1) interface'lerden object olusturamazsiniz.(constructor'lari olmadigi icin eksik yapilardir)
       2) interface'ler sadece parent olur
       3) interface'ler yapilmasi sart olan seyleri depolamak icin olusturulur.
       Bu yüzden interface'lere "to do list " de denir.(yapilacaklar listesi)

               child               	parent

               class               	class        	==> 	 extends
               interface           	interface   	==> 	 extends -->Bir interface baska bir interface'in child'i olabilir

               class               	interface   	==> 	 implements
               interface           	class       	==> 	 olamaz —> Bir interface baska bir class'in child'i olamaz
       */
    //--------------------
              /*4- Birden fazla interface'in her birine aynı isimli ve aynı parametre yapısına sahip abstract metodlar koyabiliriz.
        Örneğin, Engine, AC ve Brake interface'lerinin her birinde run() metodunu tanımlayabiliriz.
        Bu durumda, bu interface'leri implement eden child class bu metodları override ettiğinde,
        tek bir override işlemi yeterlidir ve bir belirsizlik (ambiguity) oluşmaz. Override edilen metod,
        tüm interface'lerdeki abstract metodların yerine geçer.*/
    //-----------
    //5) Interface’ler de variable’lar default olarak public static final’dir. Yani yazmasaniz da olur
    //------------------
    //6) Interface’lerin hepsine ayni isimli variable koyabiliriz. Static olup interface uzerinden ulasildigi icin sorun olmaz.
    //---------------------------
    /*7) Normalde interface icine concrete(govdesi olan methodlar) method konulamaz ama bazi özel durumlarda concrete
    method koymak gerekirse;
        a) default keywordunu kullanarak bunu yapabiliriz
        b) static keywordunu kullanarak bunu yapabiliriz

    ==>  static keywordunu kullanarak olusturdugumuz concrete methodlara ulasmak icin
    object olusturmaya gerek yoktur. Interface ismi yeterlidir

    ==>  default keywordunu kullanarak olusturdugumuz concrete methodlara interface'in child class'indan
    object olusturarak ulasilabilir*/ //burda default erisim belirtesci degil keyword tur karistirma
    //normalde interface icine body li bir method koyamayiz fakat sonradan cikan bir ozellikle bodyli methodlar interfaceler icine eklenebilir default ve static turunde olusturulabilir
    // neden proje icide boyle bir sey yapilir.. geriye donuk seyler calissin diger yerleri etkilemesin diye -
    // static methodlar override edilemezken - default methodlar override edilebilir bu farkliliktan dolayi bazen default methodlar tercih edilir
    //-------------------

    /* INTERVIEW SORUSU
    a) Abstract class'lar hem abstract method hemde concrete methodlar icerebilir.
    fakat interface'ler varsayilan olarak abstract method icerir.
    Ama interfacelerde istersek default ve static keywordlerini kullanarak concrete method olusturabiliriz

    b) Abstract class'lar multiple inheritance'i desteklemez ama interface'ler destekler

    c) Abstract class'lar icinde her turlu variable olusturulabilir, interfaceler icindeki variable'lar
    public, static ve final olmak zorundadir

    d) Interface, concrete class'ın child'ı olamaz. Abstract class, concrete class'ın child'ı olabilir.

    e) Abstract class'lar bir class olduğundan, içinde constructor'lar olabilir. Ancak abstract class'tan
    doğrudan nesne (object) oluşturulamaz. Yani abstract class'ı new anahtar kelimesi ile kullanarak bir
    nesne oluşturamazsınız, ancak constructor'ları kullanılabilir ve miras alınan class tarafından çağrılabilir.
    Interface'lerde ise constructor yoktur, çünkü bir interface'den doğrudan nesne oluşturulamaz.
    Interface'ler sadece bir sözleşme (contract) sunar.
    */

    void eco();
    void turbo();
    void gas();

    void run();
    // public static final int price = 2000; // burda public static final yazmaya gerek yok interfecelerde bunlar otomatik olarak atanir
    int price = 2000;

    int fiyat = 300; //interfacelerin hebsine bu fiyati tanimlayacaz ulasimi nasil bakalim **Static olup interface uzerinden ulasildigi icin sorun olmaz

    default void power(){ // burda body li bir method yazabildik interface icinde bu default keyworlu method override edilebilir
        System.out.println("200HP");
    }
    static void speed(){ // bodyli bir method daha olusturduk fakat static keywordu ile olusturdugumuz icin override edilemez
        System.out.println("Saatte 300km");
    }
}