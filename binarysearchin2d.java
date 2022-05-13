import java.util.*;

public class binarysearchin2d {
    public static void main(String[] args) {
        int[][] arr={ {1,2,3},
                      {4,5,6},
                      {7,8,9}
                     };
        int target =8;
        List<Integer> l3=convert(arr);
        //System.out.println(l3);
        int[] arr2=convertlisttoarray(l3);
        //System.out.println(Arrays.toString(arr2));
        int ans=binarysearch(arr2, target);
        System.out.println(ans);
    }
// code to convert 2d array into arraylist
    static List<Integer> convert(int[][] arr){
        List<Integer> l=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
             for(int j=0; j<arr[i].length; j++){
                  l.add(arr[i][j]);
             }
        }
        return l;
    }
//now i will convert list into 1d array
    static int[] convertlisttoarray(List<Integer> l2){
        int[] str=new int[l2.size()];
        for(int i=0; i<str.length; i++){
            str[i]=l2.get(i);
        }
       return str;
    }
    //binary search
    static int binarysearch(int[] arr2, int target){
        int start=0;
        int end=arr2.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr2[mid]==target){
                return mid;
            }
            if(target<arr2[mid]){
                end=mid-1;
            }
            if(target>arr2[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
    
}
