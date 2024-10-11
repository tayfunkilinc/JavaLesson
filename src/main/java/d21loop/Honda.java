package d21loop;

public class Honda extends Car {

    public  String model = "Civic";
    public int year =2023;

    public Honda(){
        System.out.println("super.model = " + super.model);// super.model = Accord // 1) super cagrisi her zaman ilk satira yazilir
        System.out.println("this.year = " + this.year); //this.year = 2023
        //alt satirlarda hata verir kullanilmaz
        System.out.println("Civic");
    }
    public Honda(String model){ //2 paremtreli constructor olusturduk runnerdan geleni karsilayacak
        super("Sport");
        System.out.println("Accord");
    }
}
