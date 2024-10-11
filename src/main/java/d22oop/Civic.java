package d22oop;

public class Civic extends  Honda{
    // sadece extend etmek abstract class lardan miras almaya yetmez
    // abstract methodlari kullanmamiz zorunludur
    @Override
    public void engine(){ // body li bir method abstract olamaz dikkat et
        System.out.println("Gas 1.6 Eco");
    }

    // hocam her nesne encapsulation yaptiklarimiza ulasacaksa en capsulation a neden ihtiyacimiz var

}
