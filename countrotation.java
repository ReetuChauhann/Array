public class countrotation {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int rotationcount = pivot(arr); //it will give me the index of the pivot
        int count = rotationcount+1;
        System.out.println(count);

    }
    

    static int pivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
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
    
}
