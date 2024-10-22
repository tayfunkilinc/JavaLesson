package d28ExeptionEnum;

public class E11Finally {
    public static void main(String[] args) {
        int a = 12 ;
        int b = 4;
        int[] c = {3, 5, 7, 9};
        bring(c,a,b);
    }

    public static void bring(int[] c, int a, int b) { // bu kullanimda hata duzeltinmez uygulama durdurulabilir
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        }finally {
            System.out.println("Veritabani Baglantisi Kesilmelidir");
        }
        // hata yoksa burdan devam edilir
        System.out.println("finally sonrasi uygulama calisiyor"); // burda hata yakalanamadigi icin program durdurulur ve hata gosterilir
    }

}
