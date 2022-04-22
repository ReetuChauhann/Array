import java.util.*;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[][] arr = new int[3][];defining the size of row is mendatory! or defining the column size is optional!

        // int[][] arr = { {1,2,3}, //0th index
        //                 {4,5}, //1th index
        //                 {6,7,8,9} //2nd index -> 2nd index arr[2] = {6,7,8,9}

        // };

         //input 
        int[][] arr = new int[3][];
        System.out.println(arr.length); //length of row
        for(int i =0; i < arr.length; i++){

            for(int j=0; j < arr[i].length; j++)
            {
                arr[i][j] = in.nextInt();
            }
    }
         //output
        for(int i =0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++)
            {
               System.out.println(arr[i][j] + " ");
            }
            System.out.println();
          }
        
        
    }    
}
