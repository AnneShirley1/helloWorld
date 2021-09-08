package OneDay;

import java.util.Scanner;

public class Demon04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //从键盘接受数据
        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数：");
        if(scanner.hasNextInt()){
            int i1 = scanner.nextInt();
        }


        scanner.close();

    }
}
