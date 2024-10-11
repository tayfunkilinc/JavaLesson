package d22oop;

public class Dog extends Mammal {
    // herkes Cat class taki feedWithMilk methodunu override etsin
    public void bark() {
        System.out.println("Dogs bark...");
    }
    @Override //buna Anotation denir.  //bu zekilde override yapmis oluyoruz bunu yazmak zorunlu degil ama yazmak kodun okunurlugunu arttirir
    public void eat(){
        System.out.println("Dogs is Eat");
    }
    @Override
    public Animal create(){
        return new Dog(); // upcasting -- yukarinin kalibina doktuk
        // yani burda ustten miras aldigimiz icin retur degeri artik
        // hem Animal olabilir hemde Dog olabilir bu isleme upcasting denir.
        // java bu cevirme islemini otomatik yapar cunku ust classa genisletiyor
        //downcasting var ama manuel yapilir java otomatik yapmaz bu konuyu gelismis java dersinde gorecegiz
    }
    @Override
    public  int add(int a, int b){ // bu data tipi pirmitive oldugu icin bunda ne fark olur bakalim
        // int - long - shor v.b primitiveler arasinda parnet child iliskisi yoktur
        //yani primitiveler birbiri yerine yazilamaz bu sebeple return type degistirilemez
        // oldugu gibi return type degismeden override edlilir method govdesi degistirilerek override edilebilir
        return  a + b;
    }
    //return type override edebilmek icin akarabalik iliskisi olmali bir birinden miras almali
    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }


    /*
    @Override
    public void drink() {
        System.out.println("cat drink..");
    }
    */ // drink() final oldugu icin  uzerinde degisiklik yapilamaz
}
