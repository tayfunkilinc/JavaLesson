package d23OopCollections;

public class AudiA4 implements Engine, AC, Brake{ // bir class a bu sekilde bircok yerden miras alamiyorduk implemet ile bu sorunu cozduk
    //burda tum interfaceleri kullanmak zorunda degil istegine bagli olarak istedigini kullanir
    //erisim belirteci yazilmassa class larda default kabul edilirken interfacelerde ersim belirteci yazilmassa public kabul edilir bu yusden ersim belirteci yazmamiza gerek yok
    // bir class bir interface i implement ederse interface icindeki abstruct olanlari kullanmak zorundaburdada parentlarinin methodlarini kullanmak zorunda
    /*
    a) interface'leri parent yapmak icin 'implements' keyword'u child icinde kullanilir

    b) extends kullanilmaz cunku bu iki class arasinda kullanilir

    c) AudiA4 Class'i, Engine interface'i icindeki tum methodlari override etmek zorundadir.

    d) AudiA4 Class'i, Engine interface'i icindeki tum methodlari override etmek zorunda
    oldugundan method'larin bas kismina 'override' yazmak gerekmez ama tavsiye edilir.

    e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
    */

    //----Engine interface`inden override edilenler----
    @Override
    public void eco(){
        System.out.println("Audi A4 Ekonomik Motor Kullanilir");
    }
    @Override
    public void turbo(){
        System.out.println("Audi A4 Turbo Motor Kullanir");
    }
    @Override
    public void gas(){
        System.out.println("Audi A4 Benzinli Motor Kullanir");
    }
    //AC interface`inde override edilenler
    public void analog(){
        System.out.println("Audi A4 Analog Klima Kullanir");
    }
    public void dijital(){
        System.out.println("Audi A4 Dijital Klima Kullanir");
    }
    //Brake interface`inden override edilenler
    public void abs(){
        System.out.println("Audi A4 ABS Fren Sistemi Kullanir");
    }
    public void esp(){
        System.out.println("Audi A4 ESP Fren Sistemi Kullanir Kullanir");
    }
    //Odev AudiS5 clasi olusturup Engine, AC, Brake interfacelerini parent olarak belirleyiniz

    public void run(){ // ayni isimde birden cok inderfacede run() methodu var bir tane override edince tumunu override etmis gibi gorerek belirsizligi ortadan kaldiriyor.
        System.out.println("Audi A4 Hava Yastigi Calistirir");
    }
}
