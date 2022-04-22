public class qus4 {
    public static void main(String[] args) {
        int[] arr = {1,45,26,57,87,35,54,75};
        int target = 35;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0)
            return -1;
        for(int i =0; i<arr.length; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
    return -1; // if target doesnot exits in the array!
    }
}
