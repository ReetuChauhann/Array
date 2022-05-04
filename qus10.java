import java.util.Arrays;

public class qus10 {
    public static void main(String[] args) {
        int[][] arr = { {4,5,6,8,9},
                         {56,87,23,90},
                         {34,87,65,44},
                         {22,67,55,1,100}

        };
    //   int ans = minval(arr);
    //   System.out.println(ans);
    //   int ans = maxval(arr);
    //   System.out.println(ans);
        // int[] ans = maxval2(arr);
        // System.out.println(Arrays.toString(ans));
        int[] ans = minval2(arr);
        System.out.println(Arrays.toString(ans));
       
    }
     static int minval(int[][] arr){ //min value in 2d aaray!
         if(arr.length==0)
         return -1;
         int min=arr[0][0]; //assume
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 if(arr[i][j]<min)
                 min =arr[i][j];
             }
             
         }
       return min;
     }

    // static int maxval(int[][] arr){ //max value in 2d aaray! with index number
    //     if(arr.length==0)
    //     return -1;
    //     int max=arr[0][0]; //assume
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             if(arr[i][j]>max)
    //             max =arr[i][j];
    //         }
            
    //     }
    //   return max;
    // }

    // static int[] maxval2(int[][] arr){ //max value index in 2d aaray! index of max value in array
    //     if(arr.length==0)
    //     return new int[] {-1,-1};
    //     //assume
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             if(maxval(arr)==arr[i][j])
    //             return new int[] {i,j};
    //         }
            
    //     }
    //     return new int[] {-1,-1};
    // }

    static int[] minval2(int[][] arr){ //min value index in 2d aaray!
        if(arr.length==0)
        return new int[] {-1,-1};
        //assume
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(minval(arr)==arr[i][j])
                return new int[] {i,j};
            }
            
        }
        return new int[] {-1,-1};
    }
}
