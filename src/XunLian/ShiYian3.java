package XunLian;
/**
 * 编写一程序，计算矩阵A={{7,9,4},{5,6,8}}
 * 与矩阵B={{9,5,2,8},{5,9,7,2},{4,7,5,8}}相乘，
 * 把结果存入矩阵C,并在屏幕输出结果。
 * 矩阵乘法
 * a点乘b，当矩阵a的列数x与矩阵b的行数y相等时可进行相乘
 * a乘b得到的新矩阵c，c的行数y等于a的行数，c的列数x等于b的列数
 */
public class ShiYian3 {
    public static void main(String[] args) {
        //当a的列数与矩阵b的行数不相等时，不能进行点乘，返回null
        int a[][] = {{7, 9, 4}, {5, 6, 8}};
        int b[][] = {{9, 5, 2, 8}, {5, 9, 7, 2}, {4, 7, 5, 8}};
        if (a[0].length != b.length)
            return;
            //c矩阵的行数y，与列数x
        else ;
        int y = a.length;
        int x = b[0].length;
        int c[][] = new int[y][x];
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++)
                //c矩阵的第i行第j列所对应的数值，等于a矩阵的第i行分别乘以b矩阵的第j列之和
                for (int k = 0; k < b.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
        int i, j;
        for (i = 0; i < c.length; i++)  //输出矩阵
        {
            for (j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

