package XunLian;

import java.util.Scanner;

/**   一个景区根据游人的年龄收取不同价格的门票。
 *   请编写游人类，该类包含两个成员域：年龄和票价；
 *   两个方法：设置年龄和根据年龄段决定能够购买的门票价格并输出。
 *   然后写出该类实例测试该类（类的基本实现）。
 */
public class ShiYian4 {
        int age;int TicktPrice;
        public void setAge(int age){
            this.age=age;
        }
        public void Tickt(){
            if (age<=18);
            TicktPrice=30;
            if (age<=60);
            TicktPrice=60;
            System.out.println("票价"+TicktPrice);
        }
        public static class Test extends ShiYian4{
            public static void main(String[]args){
                Scanner input=new Scanner(System.in);
                Test test=new Test();
                System.out.println("请输入年龄：");
                test.setAge(input.nextInt());
                test.Tickt();
            }
        }
}
