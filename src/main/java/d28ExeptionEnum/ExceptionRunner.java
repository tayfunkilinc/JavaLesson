package d28ExeptionEnum;

public class ExceptionRunner {
    public static void main(String[] args) {
        studentGrade(-55);
    }
    public static void studentGrade(int not){
        // System.out.println(not);
        if (not < 0 || not > 100) {
            try {
                throw new InvalidStudentGradeException("Ogrenci Notu Sifirdan Kucuk veya Yuzden Buyuk Girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace(); // direk hatayi bize gosterdi HATA ayrintilarini gormek icin kullandik
            }
            //Compile Time turunde ozel exception olusturdugumuz icin direk yazma asamasinda hata verdi bunun icin throws veya try-catch bloklariyla bu hatadan kurtulabiliriz
        }else {
            System.out.println("not = " + not);
        }
    }
}
