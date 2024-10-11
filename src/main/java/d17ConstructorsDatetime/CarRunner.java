package d17ConstructorsDatetime;

public class CarRunner {
    public static void main(String[] args) {
        //4- Car class’indan bir object uretelim
        //9- Default Car() icine parametre girelim
        Car c1 = new Car("BMW", "3.20", 2024, false); // objemizi oluşturduk // parametreli constructure yazınca default construture silindi
        System.out.println(c1.brand); // BMW
        System.out.println(c1.model); // 3.20
        System.out.println(c1.year); // 2024
        System.out.println(c1.hybrid); // false

        c1.action(); //BMW hızlı hareket eder.
        c1.stop(); //BMW güvenli bir şekilde durur.

        //5- Car class’a donup, constructor olusturalim

        //10- Baska bir object uretelim ve direkt objeyi yazdiralim
        Car c2 = new Car("Audi", "A4", 2018, false);

        //doğrudan sınıf tamamına ulaşamıyoruz bize referanslarını verir
        System.out.println(c1);//d17ConstructorsDatetime.Car@5b480cf9
        System.out.println(c2); //d17ConstructorsDatetime.Car@6f496d9f

        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.
        //toString Oluşturduktan sonra deneyelim
        System.out.println(c1); //Car{brand='BMW', model='3.20', year=2024, hybrid=false}
        System.out.println(c2); //Car{brand='Audi', model='A4', year=2018, hybrid=false}

        //16- Yeni bir object uretelim - SON
        Car c3 = new Car("Tofaş", "Şahin"); // year=2023, hybrid=true bunlar defalt construtor dan geldi
        System.out.println(c3); //Car{brand='Tofaş', model='Şahin', year=2023, hybrid=true}


    }
}
