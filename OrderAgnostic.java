public class OrderAgnostic {
    public static void main(String[] args) {
       // int[] arr = {-18,-14,-9,-5,0,1,4,22,34,56,66,78,89,99}; // increassing order
        int[] arr = {98,78,65,54,43,34,23,22,21,11,10,9,8,5}; // in decreasing order
        int target = 100;
        int ans = orderagnostic(arr,target);
        System.out.println(ans);
    }

    static int orderagnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }

        if(isAsc){
            if(target < arr[mid]){
                end = mid-1;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
            
        }else{
            if(target > arr[mid]){
                end = mid-1;
            }
            if(target < arr[mid]){
                start = mid+1 ;
            }
            
        }
    }
    return -1;
   
    }
 
}
