package d23OopCollections;

public class HondaRunner {
    public static void main(String[] args) {
        // Honda h = new Honda();  // abstruct classlardan obje uretilemez cunku siniflandirma icin uretildi abstruct class lar belli bir duzene aittir
        Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        Accord a = new Accord();
        a.engine(); //Gas 2.0 Turbo
        //child lar nesne olusturup kullanabilir ama abstruct parent direk olarak nesne olusturamaz artik kendisi usttedir nesne olusturamaz


    }
}
