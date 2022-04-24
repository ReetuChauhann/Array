public class evendigits {
    public static void main(String[] args) {
        int[] nums = {23,345,67,7895,7};
        System.out.println(fun(nums));
    }
    
    static int fun(int[] nums){
        int count=0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
            
        }
    return count;
        }
    static boolean even(int num){
        int digitscount=countdigits(num);
        if(digitscount%2==0){
            return true;
        }
      return false;
            
     }
        
    static int countdigits(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
    return count;
    }
}
