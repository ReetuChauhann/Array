import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class binaryinsortedarray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}
      };
      List<Integer> list=convert(arr);
    //   Iterator i = list.iterator();
    //   while(i.hasNext()){
    //       System.out.print(i.next());
    //   }
    int[] str=convertlisttoarray(list);
    System.out.println(Arrays.toString(str));
    int target=7;
    int ans=search(str, target);
    System.out.println(ans);
    // int target=7;
    // int ans=search(str, target);
    // System.out.println(ans);

      

    }
   static List<Integer> convert(int[][] arr){
    List<Integer> l=new ArrayList<>();
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               l.add(arr[i][j]);
           }
       }
       return l;
   }

   static int[] convertlisttoarray(List<Integer> list){
        int[] str=new int[list.size()]; // this is the code for converting a list to an array
        for(int i =0; i<str.length; i++){
            str[i]=list.get(i);
        }
        return str;
     } 
    static int search(int[] str, int target){
        int start=0;
        int end=str.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(str[mid]==target){
                return mid;
            }
            if(str[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    return -1;
    }
    
}
