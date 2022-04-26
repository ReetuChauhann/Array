public class evendigits {
    public static void main(String[] args) {
        int[] nums = {23,345,67,7895,7};
        // System.out.println(fun(nums));
        System.out.println(countdigits(-12345));
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
        //check digits is even or not?
    static boolean even(int num){
        int digitscount=countdigits(num);
        if(digitscount%2==0){
            return true;
        }
      return false;
            
     }
     //countdigits in numbers   
    static int countdigits(int num){
        int count = 0;
        if (num < 0) {
            num = num * -1;
            
        }
        if (num==0) {
            return 1;
        }
        while(num>0){
            count++;
            num=num/10;
        }
    return count;
    }
}
