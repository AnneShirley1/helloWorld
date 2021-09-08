package study;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args){
        Map map=new HashMap();
        map.put("语文","78");
        map.put("数学","98");
        map.put("英语","99");
        System.out.println(map);
        System.out.println(map.containsKey("语文"));
        System.out.println(map.containsValue("78") );
        System.out.println(map.isEmpty());
    }

}
