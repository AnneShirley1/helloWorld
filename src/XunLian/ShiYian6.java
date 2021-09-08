package XunLian;

/**（1）.编写两个JAVA程序，在China,java中，能显示“我是中国人”；
 * 在America.java中能显示“我是美国人”。
 （2）.编写一个Java程序，在程序中定义一个接口Shape，
 定义一个类Cylinder实现接口Shape，
 在Cylinder类中实现Shape接口中的抽象方法。
 */
public class ShiYian6 {

        public static void main(String[] args)
        {
            woman chen=new woman();
            chen.say();
        }
    }
    class woman
    {
        void say()
        {
            System.out.println("我是中国人");
        }
    }


