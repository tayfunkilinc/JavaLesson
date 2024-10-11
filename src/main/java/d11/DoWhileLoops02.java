package d11;
import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {
        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.

      Example 1:
       Valid Username="admin" and Password="pwd123".
       Get the username and password from the user.
       If the username and password are correct, print "Welcome to your account!" to the console.
       If the username or password is incorrect, prompt "Enter your username and password" 4 times.
       If the username or password is entered incorrectly for the 4th time, complete the process with the message "Your account is blocked".
*/
        Scanner input = new Scanner(System.in);

        int counter = 0; // kalan hak kontrolü yapılacak
        int kalanHak =4;
        do {
            if (counter == 4) {
                System.out.println("Hesabınız Bloke Olmuştur");
                break;
            }
            System.out.println("Lütfen Username Girininz");
            String userName = input.next();

            System.out.println("Lütfen Password Giriniz");
            String password = input.next();



            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabınıza Hoşgeldiniz");
                break;
            }
            counter++;
            kalanHak--;
            System.out.println("Kalan Hak: " + kalanHak);

        }while (true); // içerden kırılmadığı sürece çalışacak
    }
}
