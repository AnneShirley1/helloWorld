package study;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class TestSet_2 {
    public static void main(String[]args){
        Set set=new HashSet();
        set.add(123);
        set.add(456);
        set.add(456);
        set.add(789);
        set.add(0);
        set.add(-111);
        set.remove(123);
        System.out.println(set);

    }
}
