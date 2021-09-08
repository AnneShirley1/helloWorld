package XunLian;

import java.util.Scanner;

public class XunLian3 {
    public static void main(String[] args) {
        System.out.print("请输入小写字母：");
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        //将字符串字母转成大写
        System.out.println("转成大写字母："+s1.toUpperCase());
        System.out.print("请输入大写字母：");
        String s2=scanner.next();
        //将字符串字母转成小写
        System.out.println("转成小写字母："+s2.toLowerCase());
        System.out.println("拼接为："+s1+s2);
    }
}