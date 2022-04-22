public class qus8 {
    public static void main(String[] args) {
        int[] arr = {56,76,5,98,1,72,0,54};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
                
            }
        }
    return min;
    }
}
