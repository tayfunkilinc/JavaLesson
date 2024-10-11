package d17ConstructorsDatetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.
        //Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
        //If the date you have received from the user is in the future, say “You can enter the time”.

        //soruyu geliştirelim
        Scanner input = new Scanner(System.in);
        LocalDate givenDate = null; // kullanıcı sonra girecek veya LocalDate givenDate; bu şekilde başlatabilirdim

        while (true){
            System.out.println("Lütfen Yılı Giriniz: ");
            int year = input.nextInt();

            System.out.println("Lütfen Ayı Giriniz: ");
            int month = input.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Ay 1 ile 12 Arasında Olmalıdır Tekrar Giriniz: ");
                continue; // kullanıcıyı döngünün başına yönlendirir
            }
            System.out.println("Lütfen Günü Giriniz: ");
            int day = input.nextInt();
             // Ayın kaç çektiğini bulalım Yıl ve ay için YearMonth objesi olurturularak ayın kaç çektiğini buluruz
            YearMonth yearMonth = YearMonth.of(year, month); //kullanıcının girdiği yıl aya göre aldık

            //ayın maksimum gun sayısını bulalım
            int daysInMonth = yearMonth.lengthOfMonth(); // girilen yılın içindeki ayın kaç çektiğini bize döndürdü

            if (day < 1  || day > daysInMonth) {
                System.out.println("Girilen Ay İçin Geçersiz Gün. Tekrar deneyini");
                continue;
            }
            givenDate = LocalDate.of(year, month, day); // girilen bilgilerle tarih oluşturduk.
            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println("Geçersiz, Geçmiş b10ir Tarih Girdiniz. Tekrar Deneyiniz.");
            }else {
                System.out.println("Zamanı Girebilirsiniz");
                break; // geçerli tarih girildiği için döngüyü kırdık
            }
        }
        //break olsada while dışında kalanlar çalışmaya devam eder
        //return içinde bulunduğu methodu sonlandırır yani main methottan çıkılır. ve programın çalışması durdurulur
        //javada method içinde methot olmaz bunu unutma

    }
}
