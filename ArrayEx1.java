import java.util.*;
public class ArrayEx1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] roll = new int[5];
        // roll[0] = 1; //internally store like [1,2,3,4,5  ] 
        // roll[1] = 2;
        // roll[2] = 3;
        // roll[3] = 4;
        // roll[4] = 5; 
        // System.out.println(roll[4]);
 //input using for loop
        //   for(int i = 0; i<roll.length; i++){
        //       roll[i] = in.nextInt();
        //       //System.out.print(roll[i]+ " ");
        //       }
        // for(int i = 0; i<roll.length; i++){
        //     System.out.println(roll[i]);
        //  
           // print array using for each loop
        //   for (int j : roll) {
        //       System.out.print(j + " ");
        //        }
          // printing the array using Arrays class method toString
          //System.out.print(Arrays.toString(roll));   
          String[] str = new String[4];
          for(int i =0; i<str.length; i++){
              str[i] = in.next();
             // System.out.print(str[i]+ " ");
          }
          System.out.println(Arrays.toString(str));
           
          //modify 
          str[1] = "vishal";
          System.out.println(Arrays.toString(str));
    }
}