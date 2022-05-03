public class searchinrotated {
    public static void main(String[] args) { //without duplicacy
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 1;
        int ans1 = ans(arr, target);
        System.out.println(ans1);
        
    }
    static int ans(int[] arr, int target){
        int start =0;
        int p = pivot(arr);
        if(p==-1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(target==arr[p]){
            return p;
        }
        if(target>arr[0]){
            return binarySearch(arr, target, 0,p-1);
        }
        if(target<arr[0]){
            return binarySearch(arr, target,p+1,arr.length-1);
        }
    return -1;

    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && mid<end){
                return mid;
            }
            if(arr[mid-1]>arr[mid] && mid>start){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }
            if(arr[start]<arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
    
}
