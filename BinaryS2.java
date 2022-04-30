public class BinaryS2 {
    public static void main(String[] args) {
        int[] arr = {98,78,65,54,43,34,23,21,11,10,9,8,5}; // in decreasing order
        int target = 21;
        int ans = Bsearch(arr,target);
        System.out.println(ans);
    }
    
    static int Bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                start = mid +1;
            }

            if(target > arr[mid]){
                end = mid -1;
            }

            if(target == arr[mid]){
                return mid;
            }
        }
    return -1;
    }
}
