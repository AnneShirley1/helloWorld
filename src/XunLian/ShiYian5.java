package XunLian;

/**
 两游戏角色决斗。角色1交手次数＋1，生命值－1,经验值＋2；
 角色2交手次数＋1,生命值－2,经验值＋3。
 经验值每增加50时,生命值＋1；生命值<0判为负。
 生命值初始为1000,经验值初始为0。
 给定二个不同的角色，判定交手的胜负关系。
 实验报告给出决斗结果和交手次数
 */
public class ShiYian5 {
    public static void main(String[] args) {
        int a = 1000, b = 1000, a1 = 0, b1 = 0, n = 0, c = 0;
        while (a >= 0 || b >= 0) {
            a = a - 1;
            a1 = a1 + 2;
            b = b - 2;
            b1 = b1 + 3;
            if (a <= 0 || b <= 0) {
                break;
            }
            if (a1 >= 50) {
                c = a1 / 50;
                a = a + c;
                a1 = a1 % 50;
            }
            if (b1 >= 50) {
                c = b1 / 50;
                b = b + c;
                b1 = b1 % 50;
            }
            n++;
        }
        System.out.println("交手次数" + n);
        if (a > b) {
            System.out.println("胜利者为a:" + a);
        }
        if (a < b) {
            System.out.println("胜利者为b:" + b);
        }
    }
}
