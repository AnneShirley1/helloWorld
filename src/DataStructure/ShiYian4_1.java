package DataStructure;

/**求解从一个顶点到另一个顶点的最短路径。
 */
//Dijkstra算法,Dijkstra提出按各顶点与源点v间的路径长度的递增次序，
// 生成到各顶点的最短路径的算法。既先求出长度最短的一条最短路径，
// 再参照它求出长度次短的一条最短路径，依次类推，
// 直到从源点v到其它各顶点的最短路径全部求出为止。
public class ShiYian4_1 {
        static int M=10000;//(此路不通)
        public static void main(String[] args) {
            //输入部分可以任意调整
            int[][] weight1 = {
                    {0,3,20,8,M},
                    {3,0,4,2,M},
                    {M,4,0,5,4},//邻接矩阵1，2通过这样的格式输入，把图转换为矩阵
                    {7,2,5,8,6},//可以对应的修改数据，和矩阵的行和列
                    {M,M,4,6,0}
                    };
            int[][] weight2 = {
                    {0,10,M,30,100},
                    {M,0,50,M,M},
                    {M,M,0,M,10},
                    {M,M,20,0,60},
                    {M,M,M,M,0}
            };
            int start=0;
            int[] shortPath = Dijsktra(weight1,start);
            //如果把wight1,换成wight2则求的是，wight2的最短路径
            for(int i = 0;i < shortPath.length;i++)
                System.out.println("从"+start+"出发到"+i+"的最短距离为："+shortPath[i]);
        }
        public static int[] Dijsktra(int[][] weight,int start){
            //接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中）
            //返回一个int[] 数组，表示从start到它的最短路径长度
            int n = weight.length;//顶点个数
            int[] shortPath = new int[n]; //存放从start到其他各点的最短路径
            String[] path=new String[n]; //存放从start到其他各点的最短路径的字符串表示
            for(int i=0;i<n;i++)
                path[i]=new String(start+"-->"+i);
            int[] visited = new int[n]; //标记当前该顶点的最短路径是否已经求出,1表示已求出
            //初始化，第一个顶点求出
            shortPath[start] = 0;
            visited[start] = 1;
            for(int count = 1;count <= n - 1;count++) //要加入n-1个顶点
            {
                int k = -1; //选出一个距离初始顶点start最近的未标记顶点
                int d = Integer.MAX_VALUE;
                //遍历，寻找
                for(int i = 0;i < n;i++) {
                    if(visited[i] == 0 && weight[start][i] < d) {
                        d= weight[start][i];
                        k = i;
                    }
                }
                System.out.println("k="+k);
                //将新选出的顶点标记为已求出最短路径，且到start的最短路径就是dmin
                shortPath[k] = d;
                visited[k] = 1;
                //以k为中间点，修正从start到未访问各点的距离
            }
            for(int i=0;i<n;i++)
                System.out.println("从"+start+"出发到"+i+"的最短路径为："+path[i]);
               //输出部分可以，任意调整
            System.out.println("===========================");
            return shortPath;
        }
    }

