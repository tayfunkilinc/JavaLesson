package d16MethodCreation0;

public class CarRunner {
    public static void main(String[] args) {
        //4- Car class’indan bir object uretelim
        Car c1 = new Car(); // objemizi oluşturduk // parametreli constructure yazınca default construture silindi
        System.out.println(c1.brand); // Honda
        System.out.println(c1.model); // Accord
        System.out.println(c1.year); // 2023
        System.out.println(c1.hybrid); // true

        c1.action(); //Honda hızlı hareket eder.
        c1.stop(); //Honda güvenli bir şekilde durur.

        //5- Car class’a donup, constructor olusturalim


    }
}
