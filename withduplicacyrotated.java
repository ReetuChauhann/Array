public class withduplicacyrotated {
    public static void main(String[] args) {
        int[] arr = {2,2,9,2,2,2};
        int ans=pivotinduprotated(arr);
        System.out.println(ans);
        
    }

    // there are also 4 cases over here
    static int pivotinduprotated(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                //i will skip both end and start
                //but first check they are pivot or not?
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //for checking the right hand side
           if(arr[start]<arr[mid] ||(arr[start]==arr[mid] && arr[end]<arr[mid])){
               start=mid+1;
           }else{
               end = mid-1;
           }
        }
        return -1;
    }
    
}
