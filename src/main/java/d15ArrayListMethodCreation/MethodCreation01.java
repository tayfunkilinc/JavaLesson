package d15ArrayListMethodCreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        /*Java da Method Olusturma: Java'da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.
        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class'in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */
        // Method icinde methot olusturulma Ancak Method icinde class olsturulur adida inner class tir
        // INNER CLASS LAR ICINDE METHODLAR OLABILIR ve  BU IC LOCAL METHOD SADECE TANIMLANDIGI YERDE KULLANILIR

        /* Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1- main method'un disinda, class'in icinde olusturulur
        2- Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3- Olusturulan method nasil kullanilir?
           --->  Main icinden method cagrisi yapilmalidir. Buna Method Call denir.*/

        int result = sum(3,5);
        System.out.println(result);
    }
    ///main disi class ici
    // ornek 1: Toplama yapan bir method olusturunuz.
    // Example 1: Create a method that performs addition //clastan ocje uretmeden kullanmak icin static kullanilir
    public static int sum (int a, int b){
        return a + b;
    }
    //1- main metodunda sum(3, 5) çağrısında 3 ve 5 değerleri argümanlardır.
    //2- sum metodunun tanımında a ve b parametrelerdir.
}
