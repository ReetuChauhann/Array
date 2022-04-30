public class BinaryS {
    public static void main(String[] args) {
        int[] arr = {1,4,22,34,56,66,78,89,99}; //sorted in increasing order
        int target = 34;
        int ans =binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2; //to AVOID exceeding the range of int
            
            if(target<arr[mid]){
                  end = mid-1;
            }
            if(target>arr[mid]){
                start = mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
       }
        return -1;
    }
}
