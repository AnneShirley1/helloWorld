package XunLian;

import java.util.Scanner;

public class XunLian2 {
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入第一个数字:");//45
        num1 = reader.nextInt();
        System.out.println("请输入第二个数字:");//23
        num2 = reader.nextInt();
        System.out.println("计算结果："+num1+"+"+num2+"="+(num1+num2));
    }
}
