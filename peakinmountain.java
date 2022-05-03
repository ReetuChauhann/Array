public class peakinmountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2};//first increasing and then decreasing
        int ans = peak(arr);
        System.out.println(ans);
    }
    static int peak(int[] arr){
        int  start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){ //in the increasing order
                start= mid+1;
            }
            if(arr[mid]>arr[mid+1]){// in the decreasing order
                end = mid;
            }
        }
       // return start; this will only give me the index of the peak element
        return arr[start];//or i can return end over here bcoz both are pointing to the same peak element in the end
    }
}
