package d28ExeptionEnum;

public class E06 {
    public static void main(String[] args) {
        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur
        String s = "Java";
        numberOfChar(s); //4

        String t = "";
        numberOfChar(t); // 0

        String u = null;
        numberOfChar(u); // NullPointerException HATASI aldik null degerleriyle ugrasirken DIKKAT li ol
        //null degeriyle lenght() kullanmayiniz

    }
    public static void numberOfChar(String s){
        try {
            int a = s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("null degeriyle lenght() kullanmayiniz");
        }
    }
}
