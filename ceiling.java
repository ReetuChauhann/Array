public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 9;
        int ans = ceilingf(arr,target);
        System.out.println(ans);
    }
    static int ceilingf(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
            if(target < arr[mid]){
                end = mid-1;
            }
       }
       //return arr[start];
       return start; //return index
    }
    
}
