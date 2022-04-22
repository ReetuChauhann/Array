public class qus5 {
    public static void main(String[] args) {
        int[] arr = {23,4,5,7,89,22,55,67,87,98,-1};
        int target=89;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        // int target2 = -1;
        // boolean ans2 = linearSearch2(arr, target2);
        // System.out.println(ans2);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0)
        return -1;
        for (int element: arr) {
            if(element==target){
                return element;
            }
        }
      return -1;
    }

    static boolean linearSearch2(int[] arr, int target2){
        if(arr.length==0)
        return false;
        for (int element: arr) {
            if(element==target2){
                return true;
            }
        }
      return false;
    }
}
