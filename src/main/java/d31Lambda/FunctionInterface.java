package d31Lambda;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        /*Lambda ifadeleri, fonksiyonel arayüzleri (interface) kullanarak daha temiz ve kısa kod yazmanızı sağlar.
        Fonksiyonel arayüzler, lambda ifadelerine bir isim ve yapısal bir çerçeve sağlar.

        Consumer, Supplier, Function, ve Predicate Java'da fonksiyonel arayüzlerdir (interface).
        Java'da bir arayüzün fonksiyonel arayüz olarak kabul edilmesi için yalnızca
        bir tane soyut metoda (abstract) sahip olması gerekmektedir.

        Fonksiyonel Arayüz Metotları:

        Function<T, R>: apply(), girdi ve çıktı arasında bir dönüşüm veya işlem gerektiriyorsa kullanilir.
            Tek bir girdi alır ve tek bir çıktı üretir
        Consumer<T>: accept(), Bir girdi alır ve bir işlem gerçekleştirir, ancak herhangi bir çıktı üretmez.
        Supplier<T>: get(), Herhangi bir girdi almadan bir çıktı üretir.
        Predicate<T>: test(), Bir girdiyi alır ve bir koşul testi yapar, sonuç olarak true veya false döndürür.*/

        //ODEV arastir:  Lambda ile kullanilabilecek baska interface’ler de var mi?
        //vardir digerlerini arastirin
        //Evet, Java'da lambda ifadeleri ile kullanılabilecek birçok yerleşik (built-in) interface bulunmaktadır.
        //Lambda ifadeleri, yalnızca bir metodun bulunduğu (fonksiyonel) interface'lerde kullanılabilir. İşte bunlardan bazıları:
        /*
        * Java'da lambda ifadeleriyle kullanılabilecek birçok fonksiyonel arayüz (interface) bulunmaktadır. Lambda ifadeleri, özellikle fonksiyonel arayüzlerle birlikte kullanılır. Fonksiyonel arayüzler, yalnızca bir adet soyut metot içeren arayüzlerdir. Java'nın standart kütüphanesinde bu tür birçok arayüz bulunur. İşte en çok kullanılan bazı fonksiyonel arayüzler:
### 1. `Predicate<T>`
- **Açıklama**: Bir koşulu test eder ve boolean bir sonuç döner.
- **Metot**: `boolean test(T t)`
- **Örnek Kullanım**:
  ```java
  Predicate<Integer> isEven = number -> number % 2 == 0;
  System.out.println(isEven.test(4)); // true
  ```
### 2. `Function<T, R>`
- **Açıklama**: Bir girdiyi alır ve bir sonuç döner. Tip dönüşümü gibi işlemler için kullanılır.
- **Metot**: `R apply(T t)`
- **Örnek Kullanım**:
  ```java
  Function<String, Integer> stringLength = str -> str.length();
  System.out.println(stringLength.apply("Hello")); // 5
  ```
### 3. `Consumer<T>`
- **Açıklama**: Bir girdi alır ve herhangi bir değer döndürmez. Genellikle çıktıları yazdırmak veya bir işlev gerçekleştirmek için kullanılır.
- **Metot**: `void accept(T t)`
- **Örnek Kullanım**:
  ```java
  Consumer<String> print = message -> System.out.println(message);
  print.accept("Merhaba Dünya!"); // Merhaba Dünya!
  ```
### 4. `Supplier<T>`
- **Açıklama**: Hiçbir girdi almaz ve bir sonuç döner. Değer üretmek veya veri sağlamak için kullanılır.
- **Metot**: `T get()`
- **Örnek Kullanım**:
  ```java
  Supplier<Double> randomValue = () -> Math.random();
  System.out.println(randomValue.get()); // 0.72483923 (örneğin)
  ```
### 5. `BiFunction<T, U, R>`
- **Açıklama**: İki girdi alır ve bir sonuç döner.
- **Metot**: `R apply(T t, U u)`
- **Örnek Kullanım**:
  ```java
  BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
  System.out.println(add.apply(5, 3)); // 8
  ```
### 6. `UnaryOperator<T>`
- **Açıklama**: `Function` arayüzünün bir alt türüdür. Aynı tipte girdi alır ve aynı tipte bir sonuç döner.
- **Metot**: `T apply(T t)`
- **Örnek Kullanım**:
  ```java
  UnaryOperator<Integer> square = x -> x * x;
  System.out.println(square.apply(5)); // 25
  ```
### 7. `BinaryOperator<T>`
- **Açıklama**: `BiFunction` arayüzünün bir alt türüdür. Aynı tipte iki girdi alır ve aynı tipte bir sonuç döner.
- **Metot**: `T apply(T t1, T t2)`
- **Örnek Kullanım**:
  ```java
  BinaryOperator<Integer> multiply = (a, b) -> a * b;
  System.out.println(multiply.apply(3, 4)); // 12
  ```
Bu arayüzler, lambda ifadeleriyle birlikte kullanıldığında, kodun daha kısa ve okunabilir olmasını sağlar. Ayrıca, Java 8 ile gelen `Stream` API'sinde de bu tür arayüzlerin kullanımı yaygındır.
        * */

        //----------------------
        //Ornek : Bir Lambda fonksiyonu tanimlayarak verilen sayinin karesini aliniz.
        //Example : Square the given number by defining a Lambda function.

        //1.YOL
        Function<Integer, Integer> squaring = x -> { // bunu main disinda yapsaydik public static yapmamiz gerekir
            int result = x * x;
            return result;
        }; //burda bir lambda fonksiyonu tanimlamis olduk
        //burda lambda islemini bir degiskene yukleme islemini yaptik

        //2.YOL
        Function<Integer, Integer> squaring2 = x -> x * x ; // cok basit islemlerde body acmamiza gerek yok direk bu sekilde kullanilabilir



        int sonuc = squaring.apply(5);  //apply() burda Function interfacenin soyut methodudur bunu verileri almak icin kullaniyoruz her interfacein ayri abstract methodu var yukarda yaziyor
        System.out.println(sonuc); // 25




    }
}
