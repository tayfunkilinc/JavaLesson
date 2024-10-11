package d11;

import java.util.Scanner;


public class Odev1 {
    public static void main(String[] args) {
        //------------------------------------------------------------------------------------
        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.

	    *
	    * *
	    * * *
	    * * * *

        */
        System.out.println("----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayısal değeri giriniz: ");
        int r = scanner.nextInt();
        for (int i = 1; i <r ; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
