package d31Lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        //Ornek: Rastgele sayi ureten bir method olusturunuz.
        //Example: Create a method that generates random numbers.
        // Supplier paremetre almadan islem yapar bunuda () ile ifade ederiz
        // deger  ne zaman kullanilacagi belli olmayan degerler bunla uretilir kullanima ihityac olunca kullanilir buna lazy degerler denir

        Supplier<Double> randomSupplier = ()-> Math.random(); // burda hic bir parametre vermeden random sayilar uretecegiz
        System.out.println(randomSupplier.get()); //0.8200863471102222  // 0-1 arasi bir deger uretir // Supplier interface inin soyut methodu get()'dur

        Supplier<Integer> constandNUmber = () -> 42595957;
        System.out.println(constandNUmber.get()); // burda surekli kullandikca 42595957 bu sayi onumuze otomatik olarak gelir gereksiz uretimden kurtuluruz


    }
}
