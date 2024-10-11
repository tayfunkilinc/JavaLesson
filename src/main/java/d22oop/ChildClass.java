package d22oop;

public class ChildClass extends ParentClass{

    @Override
    public Integer multiply(Integer a, Integer b) {
        // super cagrisi ile bir ustundeki degerlere ulasmamizi sagliyor
        // parentindaki multiply methoduna cagri yapiyorum demek
       Integer sonuc = super.multiply(a, b);
       //parenttaki deger degismez orjinal durur burda sadece bir islem yapmak icin kullandik


        // ek islevsellik katalim
        return sonuc + 10;
        //parenttaki deger degismez orjinal durur burda sadece bir islem yapmak icin kullandik

    }
}
