package study;

import java.util.ArrayList;
import java.util.Random;

public class third {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList list = new ArrayList();
        list.add("sdfc");
        list.add("kmvdsj");
        list.add("2324");
        list.add("34278");
        for (int i = 0; i < 6; i++) {
            int j = r.nextInt(32) + 1;
            list.add(j);
        }
        System.out.println(list);
        //遍历集合
        for (int y = 0; y < list.size(); y++) {
            System.out.println(list.get(y));
        }
    }
}
