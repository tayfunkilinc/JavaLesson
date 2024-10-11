package d22oop;

public class TestClass {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        System.out.println("SONUC = " + obj.multiply(5, 4)); // bu ChildClass dakini secti ilk asamada cunku obj chlid dan uretildi
        //obj nerden uretilirse once oradaki islemi yapar
    }
}
