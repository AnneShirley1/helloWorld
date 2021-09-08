package study;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestSet_1 {
    public static void main(String[]args){
        Random r=new Random();
        Set set=new HashSet();
        set.add(123);
        set.add(456);
        set.add(456);
        set.add(789);
        set.add(0);
        set.add(-111);
        int count=0;
        while(set.size()<10){
            set.add(r.nextInt(100)+1);
            count++;
            System.out.println("共添加过"+count+"个数字");
        }
        System.out.println(set);
    }
}
