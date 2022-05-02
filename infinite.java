public class infinite {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,9,14,17,19,20,22,23,25,27,28,29};
        int target = 22;
        //int result = ans(arr, target);
        System.out.println(ans(arr, target));
        
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
//condition for doubling

        while(target > arr[end]){
            int temp = end+1; //new start
            //now to double the size of the chunsks
            end = end + (end - start + 1) * 2;
            start = temp;
        }
       return infinit(arr, target, start, end);

    }
    static int infinit(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start = mid+1;
            }
            if(target<arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
}
