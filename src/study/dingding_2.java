package study;

public class dingding_2 {
    public static void main(String args[]) {
        int [] a={10,20,30,40},b[]={{1,2},{4,5,6,7}};
        b[0] = a;
        b[0][1] = b[1][3];
        System.out.println(b[0][3]);      //【代码1】
        System.out.println(a[1]);
       }
}

