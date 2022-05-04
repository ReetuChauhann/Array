import java.util.Arrays;

public class Bs2dcolnrowwisesort {
    public static void main(String[] args) {
        int[][] arr ={  {23,24,26,27},
                        {25,35,37,39},
                        {29,38,40,41},
                        {42,43,44,45}
                      };
        int target = 40;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        int row=0; //start
        int col=arr.length-1; //end
        while( row<arr.length && col>=0){
            if(target==arr[row][col]){
                return new int[] {row,col};
            }
            if(target<arr[row][col]){
                col--;
            }
            if(target>arr[row][col]){
                row++;
            }
            
        }
        return new int[] {-1,-1};
    }
    
}
