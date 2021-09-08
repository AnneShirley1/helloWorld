package study;

public class first {
    public static void main(String args[]) {
        String string1 = "hello world !";
        System.out.println("字符串为：" + string1);
        int length = string1.length();
        System.out.println("长度为：" + length);
        char ch = string1.charAt(1);
        System.out.println("第2个字符为：" + ch);//是ch,容易错写为char
        char array[] = new char[20];
        string1.getChars(0, 6, array, 0);
        System.out.println(array);
        String s2 = "apple";
        String s3 = "first";
        String s4 = "APPLE";
        if (s2.compareTo(s3) > 0) {
            System.out.println(s2 + ">" + s3);
        } else if (s2.compareTo(s3) < 0) {
            System.out.println(s2 + "<" + s3);
        } else {
            System.out.println(s2 + "=" + s3);
        }
        int index1=string1.indexOf(" ");
        int index2=string1.indexOf(" ",4);
        System.out.println("第一个空格所在索引："+index1);//找到第一个空格的索引号
        System.out.println("索引4以后的第一个空格为："+index2);
        int index3=string1.indexOf("w");
        System.out.println("第一个索引为W的索引号为："+index3);
        System.err.println();
    }
}