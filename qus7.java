public class qus7 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,78};
        int target = 7;
       int ans = search(arr, target, 3, 6);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end){
              if(arr.length==0)
              return -1;
              for (int i= start; i < end; i++) {
                  if(target==arr[i]){
                      return i;
                  }
              }
            return -1;
    }
}
