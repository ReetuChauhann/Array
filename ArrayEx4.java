import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);
        // input
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = sc.nextInt();
                 }
        }
//output
        // for (int i = 0; i < arr.length; i++) {

        //     for (int j = 0; j < arr[i].length; j++) {
        //        System.out.print(arr[i][j] + " ");
        //          }
        //          System.out.println();
        //      }
        // output using Arrays.toStringmethod!
            //  for (int i = 0; i < arr.length; i++) {
            //  System.out.println(Arrays.toString(arr[i]));
            //  }

        //output using for each loop!
        for (int[] a : arr) { //int[] it is the type of the data type of every elements!
            System.out.println(Arrays.toString(a));
        }

            // String[] s = new String[4]; 
            // System.out.println(s[0]);
            // for (String a : s) { // here datatype of every element is String itself!
            //     System.out.print(a);
                
            // }
         }
    
}
