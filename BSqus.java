public class BSqus {
    public static void main(String[] args) {
        char[] arr ={'a','b','c','d','e','f','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char target = 'g';
        char ans = ceilingEx(arr,target);
        System.out.println(ans);
    }
    static char ceilingEx(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            if(target<=arr[mid]){
                end = mid-1;
            }
            if(target>=arr[mid]){
                start=mid+1;
            }
        }
        return arr[start];
    }
    
}
