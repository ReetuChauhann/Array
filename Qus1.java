import java.net.SocketTimeoutException;
import java.util.Arrays;

public class Qus1 {
    public static void main(String[] args) { //swap to elements in an array!
        int[] arr = {1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
