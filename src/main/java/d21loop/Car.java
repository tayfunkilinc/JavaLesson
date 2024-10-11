package d21loop;

public class Car extends Vehicle { //inheritance yapıldı
    public  String model = "Accord";
    public int year =2024;
    public Car(){
        this("Sport"); // bu this cagrisi kendi icindeki constructor i cagirir
        // bununla kendi icindeki paremetreli constructor larada erisim imkani bulduk
        System.out.println("Sedan");
    }
    public Car(String tip){ // bu constructor hondadan gelen super clasi karsilayacak
        super();
        System.out.println("Sport");
    }
}
