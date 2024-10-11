package d20staticblockIstanceblock;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)
    public String color;
    public String fuelType;
    //instance block - Bu classtan her obje oluşturulduğunda çalışacak
    {//----> dikkat et class dışında yazmıyosun class içinde main dışında
        color = "Siyah";
        fuelType = "Benzin";
    }
    //---------------
    //constructor - Class objesi oluşturulunca çalışır
    public InstanceBlock3(){
        System.out.println("Araba Rengi: " + color);
        System.out.println("Araba Yakıt Türü: " + fuelType);
    }
    //Default olarak Siyah ve Benzin ile başlatmak istemessek parametreli construcrtor oluştururuz.
    public InstanceBlock3(String color, String fuelType){
        this.color = color;
        this.fuelType = fuelType;
    }

}
