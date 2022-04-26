import java.util.Arrays;

public class richest {
    public static void main(String[] args) {
        int[][] arr = {  {2,5},
                         {5,4},
                         {7,1}

        };
        System.out.println(richestman(arr));
    }
    static int richestman(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int x=0;
            for (int j = 0; j < arr[i].length; j++) {
                x=x+arr[i][j];
            }
        if(x>ans)
            ans=x;
        }
    return ans;
    }
}
