package d28ExeptionEnum;

public class E10Finally {
    public static void main(String[] args) {
        //finally -- hata olsun olmasin her zaman calisir
        /*
        1) finally bloğu genellikle;
         a) Kaynakların serbest bırakılması :  (veritabani baglantisinin kesilmesi, close() methodu ile),
             Özellikle eski Java versiyonlarında (Java 7 öncesi), veritabanı bağlantıları gibi kaynaklar
             manuel olarak kapatılmalıydı. Bu tür kaynaklar, uzun süre açık bırakılırsa sistemde gereksiz
             yere yer kaplar ve potansiyel performans sorunlarına neden olabilir.
             Java 7 sonrasi otomatiklesti ( try-with-resources ifadesi ile)

         b) Dosyaların kapatılması :  (az once dosya baglantisi yapmistik.  fis.close(); ile kapatilabilirdi)
            Dosyaları okuma veya yazma işlemi bittikten sonra kapatmak gereklidir. Aksi halde, dosya kolları
             gereksiz yere sistemde yer kaplar.

         c) Her durumda çalıştırılması gereken temizleme işlemleri :
         (Bazı işlemler, başarılı olsun ya da olmasın, belirli bir sürecin sonunda her zaman yapılmalıdır.

        Örneğin, bir log dosyasına her işlemin başlangıç ve bitiş zamanını kaydetmek gibi. BufferedWriter ile)

         finally icin bir senaryo olusturalim; a/b bolumu ile bir index bulalim ve bu index'i kullanarak
         Array'deki elemani bulalim
         */
        // Coklu finally block kullanilamaz
        //java da try + bir catch, try + birden fazla catch, try + catch + finally,
        // try + finally kullanilabilir. ---> dogrudan hatayi duzeltmeden devam etmek icin veya direk kapatmak icin catch siz direk finally kullanilir

        int a = 12 ;
        int b = 0;
        int[] c = {3, 5, 7, 9};
        bring(c,a,b);

    }
    public static void bring(int[] c, int a, int b){
        try {
            int indx = a / b;
            int element = c[indx];
            System.out.println(element);
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Database Baglantisini Kesiniz");
        }
    }
}
