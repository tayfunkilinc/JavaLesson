package d21loop;

public class Animal {
    //OOP (Object Oriented Programming - Nesne Tabanlı Programlama)
    //Gerçek hayatta gördüğümüz birçok Object’in (nesnenin) bilgisayar ortamına aktarılma şeklidir.
    //Yani bir object’in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar
    // ortamında gösterilmesi buna örnek olarak verilebilir.
    //--------------
    /*Object Yönelimli Programlamanın Faydaları:
    1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
    2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
    ile çalıştırılabilir. Substring() method'u 1 kere yazilmis ama surekli kullanabiliyoruz.
    3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
    4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
    5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class' ta değişiklik
    yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/
    //-----------------------
    /* OOP'leri 4 temel özellikte inceleyebiliriz.
    1. Inheritance - Miras Alma
    2. Polymorphism - Çok Biçimlilik
    3. Encapsulation - Kapsülleme
    4. Abstraction - Soyutlama
    */
    //-----------------------------
    /*1.Inheritance, OOP'nin dort temel ozelliginin 1.sidir. Ozellikleri bir class'tan diğer class'lara alan bir kavramdır.*/
    /*Bunun Java daki karsiligi sudur: Siz bir class olusturacaksiniz ama daha once olusturulmus
    bir class sizin istediginiz ozelliklerin bircogunu kapsiyor.
    *****O zaman direkt yeni olusturdugunuz classi, ozelliklerini kullanmak istediginiz classa 'child' yapmalisiniz.
    Bunu da 'extends' keyword'unu kullanarak yapiyoruz.*/

    /*Inheritance'in Faydalari nelerdir?

    1) Kodun yeniden kullanılmasına yardımcı olur.
    2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve emekten tasarruf sağlayabiliriz.
    3) Kolayca update yapabiliriz.
    4) Class'lari kuculturuz.
    5) Daha az geliştirme ve bakım maliyetine yol açar.
    */

    //---------Özel Durumlar

    //a) Java ‘Multiple Inheritance’ i desteklemez. ‘Single Inheritance’ i destekler.
    //  public class Bird extends Animal, Mammal {  // Bu şekil olamaz iki parnttan miras alamassın

    //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
    //  ‘Hierarchical Inheritance’ denir ve Java bunu kabul eder.

    /*c) Ama coklu parent'lardan yararlanamamak iyi olmadi.
    Ozelliklerini inherit etmek istedigimiz class'lar birden fazla ise (parent'lar) o durumda Java bize,
    Apartman tarzi yapilanma olusturmustur.( 'Multi Level Inheritance') Java bunu kabul eder.*/

    //**** Java'da parent'tan child'a olan iliskilere HAS-A Relationship denir
    //**** Java'da child'tan parent'a olan iliskilere IS-A Relationship denir
    /*
        HAS-A Relationship, bir class'in başka bir class'i içerdiği ilişkiyi ifade eder.
        Yani, bir class başka bir class'in bir parçası olduğunda HAS-A ilişkisi vardır.
        Bu ilişki bileşim (composition) veya toplama (aggregation) ile sağlanır.

        IS-A Relationship, bir class'in başka bir class'in bir türü olduğu anlamına gelir.
        Bu ilişki, bir class'in  başka bir class'tan türediği (miras aldığı) durumlarda ortaya çıkar.
        Bu durum kalıtım (inheritance) ile sağlanır.

        IS-A ilişkisi child class'tan parent class'a doğru çalışır.
        Yani, bir alt class üst class'in bir türüdür.
         */
    //ÖRNEK
    //Cat bir hayvandır --- IS-A
    //Hayvan bir kediye sahiptir --- HAS-A

//-----------------------------\

    //2.Polymorphism:
    //Method Overloading + Method Overriding

    //OOP'nin prensiplerinin 2.sidir. Polymorphism (cok bicimlilik) demektir.
    //Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.

    //iki cesidi var.

    // i.Method Overloading: Bunu gormustuk methodu parametreleri ni arttirarak uzerine eklemeler yapilmasidir (uzerine yukleme denebilir)

        //ii.Method Overriding (gecersiz kilmak, agir basan) --  uzerine yazma eskiyi gecersiz kilma olarak anlasilabilir
        // Child class’in Parent’taki methodu degistirerek kullanmasidir.
        // ihtiyac olmadikca cok kullanmamak gerekir override islemini
    //-------------------
    //Override isleminde access modifier’larin durumlari ne olmalidir, onu ogrenelim !!!!
    /*Soru1: private method'lar override edilebilir mi?
    Cevap1: private method'lar override edilemezler cunku
    override edebilmek icin o method'a baska bir class'dan ulasabilmek gerekir.
    Ama private method'lar baska classlardan ulasilamaz methodlardir.

    Not: child'in access modifier'i parent'tan daha dar olamaz.
    Ornek: parent public - child protected olamaz cunku bu hata,
    Child class'ının eat metodunun, Parent class'ının eat metodundan daha az erişilebilir olmasından kaynaklanır.
     */
    // parent protected ise cocuk protected ve puclic olabilir yani child gelisleteblir
    //fakat parent puclic ise cocuk protected olamaz yani pabanin mirasini daraltamaz
    //miras veren parent hic bir zaman private olamaz olursa eger child a miras veremez
    // bu orenklere dayanarak parent default ise child public ve protected olabilir
    //-----------------
    //Override isleminde access modifier’larin durumlarini ogrendik.
    //Simdi de return type durumlarina bakalim.
    //Parent icinde data type’i olan bir method olusturup child’da override edelim
    //--------------------
    //Parent’ta int veri turunde bir method acip, child’da override etseydik ne olurdu?
    // int - long - shor v.b primitiveler arasinda parnet child iliskisi yoktur
    //yani primitiveler birbiri yerine yazilamaz bu sebeple return type degistirilemez
    //-----------------
    //Peki Parent’ta Class veri turunde bir method acip, child’da override etseydik ne olurdu?
    //-------------------------



    public void eat(){
        System.out.println("Animals is Eat");
    }
    public Animal create(){// date type Animal dir
        return new Animal(); // Animal objesi uretip disari Animal gonderdik
        // yani obje ureten bir method yazdik
    }
    public void drink(){
        System.out.println("Animals is Drink....");
    }
    public  int add(int a, int b){ // bu data tipi pirmitive oldugu icin bunda ne fark olur bakalim
        return  a + b;
    }
    public Integer multiply (Integer a, Integer b){
        return a*b;
    }




}
