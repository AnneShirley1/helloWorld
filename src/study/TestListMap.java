package study;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestListMap {
    public static void main(String[]args){
        List list1=new ArrayList();
        Map map1=new HashMap();
        list1.add(89);
        list1.add(67) ;
        list1.add(78);
        map1.put("语文",89);
        map1.put("英语",67);
        map1.put("数学",78);
        list1.add(map1);
        System.out.println(list1);
    }
}
