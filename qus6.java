import java.lang.String.*;
public class qus6 {
    public static void main(String[] args) {
        String name = "Reetu";
        char target = 'u';
        boolean ans = search(name,target);
        System.out.println(ans);
         
    }
    // static boolean search(String str, char target){
    //     if(str.length()==0)
    //     return false;
    //     for (int i = 0; i < str.length(); i++) {
    //         if(target==str.charAt(i)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    static boolean search(String str, char target){
        if(str.length()==0)
        return false;
        for (char ch : str.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
