package study;
import java.util.*;

public class dingding_1 {
        public static void main(String[] args)
        {
            int num1;
            float num2;
            Scanner reader = new Scanner(System.in);
            System.out.println("请输入第一个数字:");//5
            num1 = reader.nextInt();
            System.out.println("请输入第二个数字:");//8
            num2 = reader.nextFloat();
            System.out.println(num1+"*"+num2+"="+(num1*num2));
        }
}
