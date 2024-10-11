package arrays;

import java.util.Arrays;

public class MdArrays {
    public static void main(String[] args) {
        //Multidimensional Array
/*
    Multi-dimensional array means putting arrays into array
    The most common is two-dimensional
    A two-dimensional array consist of rows and columns, just like en Excel spreadsheet
*/
        //how to create md array with 3 outer and 2 inner elements...
        int[][] arr = new int[3][2]; //3 element for outer array, 2 elements for each inner array
        System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]]
        //when to print complex(multi-dimensional) array: toString() does not work. we need deepToString()...

        //How to add elements into md array  =>[ [0, 0], [0, 0], [0, 0] ]
        arr[0][0] = 5;
        arr[0][1] = 12;

        arr[1][0] = 81;
        arr[1][1] = 45;

        arr[2][0] = 99;
        arr[2][1] = 3;


        System.out.println(Arrays.deepToString(arr));
        //[   [5, 12],    [81, 45],   [99, 3]   ]
    }
}
