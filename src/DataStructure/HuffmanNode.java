package DataStructure;
/**由文本字符及字符在文本文件中出现的频率，
 * 构造带权路径最短的最优二叉树（哈夫曼树），
 * 并依此为基础构造字符的前缀编码（哈夫曼编码）。
 */
public class HuffmanNode {
    private int weight = -1;
    private int parent = -1;
    private int left = -1;
    private int right = -1;
    public HuffmanNode(int weight) {
        super();
        this.weight = weight;
    }
    public HuffmanNode(int weight, int left, int right) {
        super();
        this.weight = weight;
        this.left = left;
        this.right = right;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getParent() {
        return parent;
    }
    public void setParent(int parent) {
        this.parent = parent;
    }
    public int getLeft() {
        return left;
    }
    public void setLeft(int left) {
        this.left = left;
    }
    public int getRight() {
        return right;
    }
    public void setRight(int right) {
        this.right = right;
    }
    @Override
    public String toString() {
        return "HuffmanNode [weight=" + weight + ", parent=" + parent + ","
                + " left=" + left + ", right=" + right + "]";
    }
}

