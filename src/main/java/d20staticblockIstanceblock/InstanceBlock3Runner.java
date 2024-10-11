package d20staticblockIstanceblock;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1 = new InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakıt Türü: Benzin

        InstanceBlock3 car2 = new InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakıt Türü: Benzin

        InstanceBlock3 car3 = new InstanceBlock3("Kırmızı", "Gaz");
        System.out.println("Araba Rengi: " + car3.color);
        System.out.println("Araba Yakıt Türü: " + car3.fuelType);
        //Araba Rengi: Kırmızı
        //Araba Yakıt Türü: Gaz

        InstanceBlock3 car4 = new InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakıt Türü: Benzin


    }
}
