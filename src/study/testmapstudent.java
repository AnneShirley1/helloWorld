package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testmapstudent {
    public static void main(String[] args){
        Map map=new HashMap();
        map.put("语文","78");
        map.put("数学","98");
        map.put("英语","99");
        System.out.println(map);

        System.out.println(map.remove("语文"));
        System.out.println(map.get("98"));
        Set keys=map.keySet();
        }
    }

