package DataStructure;
/**求解从一个顶点出发到其它所有顶点的最短路径
 */
import java.util.ArrayList;

public class ShiYian4 {
        static int len = 7;
        static int[] costs = new int[len];
        static int[] parents = new int[len];

        public static void main(String[] args) {
            int[][] datas = { { 1, 0, 8 }, { 1, 2, 5 }, { 1, 3, 10 }, { 1, 6, 9 }, { 2, 0, 1 }, { 0, 6, 2 }, { 3, 6, 5 },
                    { 3, 4, 8 }, { 0, 5, 4 }, { 5, 6, 7 }, { 5, 3, 8 }, { 5, 4, 5 } };

            // 邻接表
            ArrayList<Edge>[] graph = new ArrayList[len];
            for (int i = 0; i < len; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < datas.length; i++) {
                int u = datas[i][0];
                int v = datas[i][1];
                int c = datas[i][2];
                graph[u].add(new Edge(v, c));
                graph[v].add(new Edge(u, c));
            }

            dijk(1, graph);
            System.out.println("Costs:");
            for (int i : costs) {
                System.out.print(i + " ");
            }
            System.out.println("\nParents:");
            for (int i : parents) {
                System.out.print(i + " ");
            }
        }

        public static void dijk(int start, ArrayList<Edge>[] graph) {
            boolean[] vis = new boolean[len];

            for (int i = 0; i < len; i++)
                costs[i] = Integer.MAX_VALUE;
            costs[start] = 0;

            parents[start] = -1;

            int count = 0;
            while (count < len) {
                // 先在costs中找最小花销的未确定的边
                int minNode = -1;
                int minCost = Integer.MAX_VALUE;
                for (int i = 0; i < len; i++) {
                    if (!vis[i] && costs[i] < minCost) {
                        minCost = costs[i];
                        minNode = i;
                    }
                }
                vis[minNode] = true;
                count++;

                // 再从这个最小边的结点出发找未被访问的结点的边，更新costs
                ArrayList<Edge> nextEdge = graph[minNode];
                for (Edge edge : nextEdge) {
                    int node = edge.next;
                    int cost = edge.cost;
                    if (!vis[node] && minCost + cost < costs[node]) {
                        costs[node] = minCost + cost;
                        parents[node] = minNode;
                    }
                }
            }
        }

    }

    class Edge {
        int next;
        int cost;

        Edge() {
        }

        Edge(int next, int cost) {
            this.next = next;
            this.cost = cost;
        }
    }


