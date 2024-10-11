package d16MethodCreation0;

public class Car {
    /*Java Object Oriented Programming bir dildir. Yani her seyi object olarak kabul eder.
    Object olustururken de iki sey dikkate alinir. Pasif ve aktif ozellikler.
    Bu gune kadar variable ve methodlar kullandik. Simdi kendi object'lerimizi olusturup kullanacagiz.
    Bunun icin class'lar olusturup, class'larimizin icine variable ve methodlar
    ekleyecegiz ki bunlardan object'ler uretebilelim.*/
    //--------------------------
    /*
    1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
    2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken, main methodu oluşturmanız gerekebilir.
    3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method'lu class olur.
    Adina da "runner" eklenir.*/
    //1-Basif ÖZELLİKLER - Variable'lar
    String brand = "Honda";
    String model = "Accord";
    Integer year = 2023;
    boolean hybrid = true;

    //2-Aktif ÖZELLİKLER - Method'lar
    public void action(){
        System.out.println(brand + " hızlı hareket eder.");
    }
    public void stop(){
        System.out.println(brand + " güvenli bir şekilde durur.");
    }
    //3-CarRunner yani main’li class’i olusturalim

    /*6-Constructor nedir?
    Class'tan object olusturmamizi saglayan bolumdur.
    Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
    Bu constructor'lara "default constructor" denir.
    default constructor ===> Car () */

    /*7- Constructor nasil olusturulur?
    Access Modifier + Class ismi + () + {}
    Kendiniz constructor'inizi olusturdugunuz zaman Java default constructor'i siler

    **********Method ile Constructor arasindaki fark nedir? Interview Sorusu
    a)Methodlarda return type olur, constructor'larda olmaz
    b)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    c)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.(constructorlar objeleri başlatmak ve class'in başlatılmasını sağlamak için kullanılır.)
    d)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar clas küçük harfli ise küçük olabilir

    !!!!Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object'ler olusturabiliriz
    Java’da 2 tur constructor vardir
    A- Parametresiz (default)
	    a) otomatik uretilen parametresiz constructor
	    b) kullanici tarafindan tanimlanan parametresiz constructor
    B- Parametreli  */
    /*public Car(String brand, String model, int year, boolean hybrid){
        this.brand = brand; // bu clastaki brand değerini kullanma ben sana parametre olarak göndereceğim.
        // eşşittir sağı parametre eşittir solu class içindeki
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }*///burayı varsayılan construtor bozulmasın diye şimdilik yoruma düşürdüm



}
