package OneDay;


import java.util.Scanner;

public class Demon05 {
    public static void main(String[] args) {

        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNextLine()){

            String str = scanner.nextLine() ;
            System.out.println("输入的内容为："+str);
            // if (scanner.hasnext()){
            //String str = scanner.next() ;
           //next与nextLine区别在于，next输出空格符前面的一串字符，nextLine输出回车符前面所有内容

        }
        //凡是属于IO流的类，如果不关闭会一直占用资源
        scanner.close();

    }
   
}
