import java.util.Arrays;

public class qus9 {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,5},
                         {6,7,8,9},
                         {10,11,12,13},
                         {14,15,5}

        };
        int target = 13;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] search(int[][] arr, int target){
        if(arr.length==0)
        return new int[]{-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{-1,-1};
    }
}
