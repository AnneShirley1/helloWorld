package OneDay;

import java.util.Scanner;

public class Demon03 {
    public static void main(String[] args) {
        //输入多个数字，求它们的和与平均数，每输入一个数字用回车键确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);
        //上面这句话由new Scanner(System.in)变换而来;

        double sum = 0;
        int m = 0;

        //通过循环判断是否，还有输入，并在里面对每一次进行求和统计
        System.out.println("请输入数据：");
        while(scanner.hasNextDouble()) {
            double v = scanner.nextDouble();
           //上面这句话由 scanner.nextDouble()变换而来;

            m++;
            sum = sum + v;
            System.out.println("你输入了第"+m+"个数据，然后当前结果sum="+sum);

        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值为" + (sum / m));
        scanner.close();
    }
}