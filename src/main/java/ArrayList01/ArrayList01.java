 package ArrayList01;

 import java.util.ArrayList;

 public class ArrayList01 {

    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(13);//veri eklemek
        ages.add(12);
        ages.add(5);// bunlar her zaman sona ekleme yapar
        System.out.println(ages); //[13, 12, 5]

        ages.add(1,25);
        System.out.println(ages); //[13, 25, 12, 5]

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages);





    }
}
