import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx6 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(10);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        a.add(11);
        a.add(12);
        a.add(13);
        
        // System.out.println(a.get(0));
        // System.out.println(a);
        // a.set(0, 97);
        // System.out.println(a);
        // a.remove(0);
        // System.out.println(a);

        Iterator i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
    
}
