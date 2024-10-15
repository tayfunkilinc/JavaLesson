package d23OopCollections;

public class AudiRunner {
    public static void main(String[] args) {
       // Engine e = new Engine(); // ========HATA interfacelerden obje uretilmez=========

        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir
        a4.dijital(); //Audi A4 dijital klima kullanir

        //---------------------

        a4.run(); //Audi A4 Hava Yastigi Calistirir
        // Engine.price = 5000; // burda direk Interface ismiyle ulastic static method ayni zamanda deger atayamadik bu sebeplede final degiskendir

        System.out.println(Engine.fiyat); //300
        System.out.println(AC.fiyat); //200
        System.out.println(Brake.fiyat); //100
        // burda fiyat degiskeni static oldugu icin direk interface ismi uzerinden ulastigimiz icin herhangi bir karisiklik olmadi istedigimize direk ulasabildik

        Engine.speed(); // speed() static oldugu icin direk Interface adi uzerinden ulasabildik
        a4.power();// power() default oldugu icin nesne uzerinden ulastik

    }
}
