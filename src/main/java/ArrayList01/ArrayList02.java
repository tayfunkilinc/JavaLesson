package ArrayList02;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();

        s.add("istanbul");
        s.add("atina");
        s.add("houston");
        s.add("moscow");

        for (int i=0; i<s.size(); i++){ //boyutuna bakıyor
            if (s.get(i).contains("a")){ //içerisinde olup olmadığını kontrol ediyor
                s.remove(i);
                i--;
            }
        }
        System.out.println("s latest" + s);

    }
}
