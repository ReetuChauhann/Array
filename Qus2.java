import java.util.Arrays;

public class Qus2 { //to find maximum element in a array!
    public static void main(String[] args) {
        int[] arr = {1,3,23,25,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxValue(arr));
        System.out.println(maxinRange(arr, 1, 4));

    }
    static int maxValue(int[] arr){
        int max = arr[0]; //assume
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
              max=arr[i];
            }
        }
       return max;     
    }
    
    static int maxinRange(int[] arr, int start, int end){
        int max = arr[start]; //assume
        for (int i = start; i < end; i++) {
            if(arr[i]>max){
              max=arr[i];
            }
        }
       return max;     
    }
}
