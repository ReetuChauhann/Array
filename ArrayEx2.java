import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] ids = {1,2,3,4};
        System.out.println(Arrays.toString(ids));
        fun(ids);
        System.out.println(Arrays.toString(ids));

        
    }
    public static void fun(int[] roll){ //when we pass an object' ref, it actually going to take copy of that reference which is going to point the same object
        roll[0]=99;                     //ids and roll point the same object of the array!
    }

    
}
