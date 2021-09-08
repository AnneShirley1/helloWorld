package XunLian;

public class ShiYian7_1 {
    public static void main(String args[]) {
        String[] str = {"1", "2"};
        try {
            System.out.println(str[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        }
    }
}
