public class searchinmountain {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,4,3,2};
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int peak = peakinmountain(arr);
        int firsttry = agnosticbinarysearch(arr,target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }else{  
               return agnosticbinarySearch(arr,target,peak+1,arr.length-1);
        } 

    }
    
    static int peakinmountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
        if(arr[mid]>arr[mid+1]){
            end = mid;
        }
        if(arr[mid]<arr[mid+1]){
            start= mid+1;
          }
        }
        return start; // i want to get index over here
    //return arr[start]; // or i can return end over here also!
    }

    static int agnosticbinarysearch(int[] arr,int target, int start, int end){
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                if(target>arr[mid]){
                    start = mid+1;
                }
            }else{
                if(target<mid){
                    start = mid +1;
                }
                if(target>mid){
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    static int agnosticbinarySearch(int[] arr,int target, int start, int end){
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                if(target>arr[mid]){
                    start = mid+1;
                }
            }else{
                if(target<mid){
                    start = mid +1;
                }
                if(target>mid){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
