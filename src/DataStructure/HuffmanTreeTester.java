package DataStructure;

public class HuffmanTreeTester {

        public static void main(String[] args) {
            int[] leafs = {1, 3, 5, 6, 2, 22, 77, 4, 9};
            HuffmanTree tree = new HuffmanTree(leafs);
            HuffmanNode[] nodeList = tree.huffmanTree;
            for (HuffmanNode node : nodeList) {
                System.out.println(node);
            }
        }

    }



