package DataStructure;
import java.util.Scanner;
public class ShiYian4_2 {
    public static class ShortestPath {
        static int min = Integer.MAX_VALUE;
        static int[][] edge = new int[100][100];
        static int[] vertex = new int[100];
        static int n, m;
        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            n = input.nextInt();
            m = input.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i == j) {
                        edge[i][j] = 0;
                    } else {
                        edge[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
            System.out.println("输入数据格式为第一行输入顶点数和边数，从第二行开始每一行输入3个整数，分别代表连接顶点的边和权重。");
            for (int i = 1; i <= m; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                edge[a][b] = c;
            }
        //在输入数据时第一行输入顶点数和边数
        // 第二行开始每一行输入3个整数，分别代表连接顶点的边和权重
           //例如：1 2 3，表示从1号顶点到2号顶点连接的边，权重为2
            vertex[1] = 1;
            dfs(1, 0);
            System.out.println(min);
        }

        public static void dfs(int cur, int dis) {
            //如果当前路径大于之前找到的最小值，可直接返回
            if (dis > min) {
                return;
            }
            //判断是否达到最后一个结点，更新最小值，返回
            if(cur == n) {
                if (dis < min) {
                    min = dis;
                    return;
                }
            }
             //当前点到其他各点之间可连通但是还未添加进来时，遍历执行

            for (int i = 1; i <= n; i++) {
                if (edge[cur][i] != Integer.MAX_VALUE && vertex[i] == 0) {
                    vertex[i] = 1;
                    dfs(i, dis+edge[cur][i]);//回溯
                    vertex[i] = 0;
                }
            }
            return;
        }
    }
}

