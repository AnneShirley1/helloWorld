package XunLian;
import java.util.Scanner;
public class pp{
    public static void main(String args[]){
        int n;//物品个数
        int w;//背包的容量
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入物品的个数");
        n=sc.nextInt();
        int []V=new int[n+1];//价值数组
        System.out.println("请输入背包的容量");
        w=sc.nextInt();//重量数组
        int []W=new int[w+1];
        int []x=new int[n+1];//逆向构造最优解的时候表示,该物品有没有放入背包
        int [][]c=new int[n+1][w+1];//表示前i个物品放入容器为j的背包获得的最大价值
        System.out.println("请输入每个物品的重量");
        for ( i=1;i<=n;i++){
            W[i]=sc.nextInt();
        }
        System.out.println("请输入每个物品的价值");
        for ( i=1;i<=n;i++){
            V[i]=sc.nextInt();
        }
        for ( i = 0; i <=n ; i++) {
            c[i][0]=0;//初始化第0列为零
        }
        for ( j=0;j<=w;j++){
            c[0][j]=0;//初始化第0行为0;
        }
        for ( i=1;i<=n;i++) //计算c[i][j]
            for( j=1;j<=w;j++)
                if(j<W[i]) //当物品的重量大于背包的重量,则不放入此物品
                    c[i][j] = c[i - 1][j];
                else //否则比较此物品放与不放是否能使得背包内的价值最大
                    c[i][j]=Math.max(c[i-1][j],c[i-1][j-W[i]]+V[i]);
        System.out.println(c[n][w]);
        //逆向构造最优解
        j=w;
        for(i=n;i>0;i--){
            if(c[i][j]>c[i-1][j]){
                x[i]=1;
                j-=W[i];
            }
            else
                x[i]=0;
        }
        System.out.println("装入背包的物品为:");
        for(i=1;i<=n;i++){
            if(x[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}



