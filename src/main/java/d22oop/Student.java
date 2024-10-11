package d22oop;

public class Student {

    //3.Encapsulation: Data hiding(Veri Saklama)

    // OOP mantiginda class uyelerine erisimi sinirlandirabilirsiniz.
    // Bunu access modifier(erişim değiştiricileri)’larla yapabilirsiniz

    /*Ama class’a ulasim disinda ‘access modifier’ larla yapamadigimiz bazi seyleri ‘encapsulation’ ile yapabiliriz.

    1) Encapsulation, verileri koruma ve gizleme amacı taşır. Encapsulation kullanarak
    read ve write (okuma ve yazma) ozelliklerini birbirinden ayri olarak tanimlayabiliriz.

    2) İstedigimize okuma, istedigimize yazma yetkisi veririz.
    ***Bazi insanlar bilgiyi sadece
    gorsun ama degistiremesin. (Mesela,bir personel bir rapora fiyat bilgisi girsin-write-
    ama rapor sonucunu(sirket kar zararini) goremesin. Sirket muduru de raporu okusun -read- ama degistiremesin.
    CEO’da maliyet artislarini yansitabilmek icin hem okusun hemde yazsin gibi)

    a) Data nasil saklanir?
    Access modifier'larini 'private' yaparak datayi diger class'lardan gorunmez hale getiririm
    boylece data'yi saklamis olurum.

    b) Data'yi sakladin ama okuman gerekirse ne yapacaksin?
    get() method'lar olusturarak saklanmis datalari diger class'lardan okuyabilirim

    c) Data'yi sakladin ama o data'yi degistirmen gerekirse ne yapacaksin?
    set() method'lar olusturarak saklanmis datalari diger class'lardan degistirebilirim

    d)Hem okunabilir hemde yazilabilsin diyorsaniz, hem getter hemde setter method’u ayni anda olusturmaliyiz.
     */
    //-------------------
    //Ornek: Student class’i icinde data girislerini yaptiktan sonra
    // getter ve setter method'larini uygulayiniz.

    public String name = "Ali Can";
    private int age = 13;
    private boolean successful = true;
    // burda age ve successful degiskenlerini encapsulation yaptik gizli yaparak simdi ulasilabilir hale getirelim

    //1- age ve successful datalarini okunabilir yapalim.
    // Getter metodu okuma yaptigi icin parametre almaz

    public int getAge() { // bununla age e ulasim hakki verdik
        return age;
    }

    public boolean isSuccessful() { // bununla successful a ulasim hakki verdik
        return successful;
    }

    //2- age ve successful datalarini degistirilebilir yapalim.
    // Setter metodu yeni data uretmez, var olan datayi degistirir
    //bu yuzden return type'lari hep void olmalidir.

    //Setter metotlar ise private elemanlara deger atamasi gerceklestirdigi icin parametre alirlar.
    public void setAge(int age) {
        this.age = age; //Bu class'taki age'i kullanma, ben sana yenisini parametre olarak gonderecegim
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    //ODEV: encapsulation da private ile gizlenen bir
    // veri baska package'dan set method ile degistirilebilir mi?
    //CEVAP
    //Evet, eğer bir sınıfta tanımlı private bir alan (field) varsa, bu alana doğrudan erişim
    // mümkün değildir. Ancak, sınıf içerisinde tanımlanmış bir public setter metodu varsa,
    // bu setter metodu başka bir paketten bile çağrılarak o private alanın değeri değiştirilebilir.
    //Yani, encapsulation prensipleri gereği alanlar private olsa bile, eğer bir public set
    // metodu varsa, başka bir paketten bu metoda erişip private alanın değeri değiştirilebilir.

}
