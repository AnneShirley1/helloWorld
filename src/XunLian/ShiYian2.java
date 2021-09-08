package XunLian;

/**
 * 找出所有的水仙花数并输出,水仙花数是三位数,
 * 它的各位数字的立方和等于这个三位数本身,
 * 例如：371=3*3*3+7*7*7+1*1*1，371就是一个水仙花数。
 */
public class ShiYian2 {
    public static void main(String[] args) {
        int a,b,c;
        for (int i = 100; i < 999; i++) {
            a = i / 100;//获取百位数字
            b =i % 100 /10; //获取十位数字
            c = i%10; //获取个位数字
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i);
            }
        }
    }
}

