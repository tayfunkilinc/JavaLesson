package d21loop;

public class Vehicle {
    /*Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
    en ustteki parent class'tan baslatilarak alta doğru calistirilir*/

    //javada her şeyin üstünde görünmez  bir Object Class vardır hiç bir yerden miras alınmassa Objeden alınıyor gibi düşün

    //Constructor olusturalim
    public Vehicle(){
        this("Honda",2024,"Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int yil, String motor){
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }



}
