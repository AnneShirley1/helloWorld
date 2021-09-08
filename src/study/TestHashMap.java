package study;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args){
        HashMap Map=new HashMap();
        Map.put("","80");
        Map.put("数学","98");
        Map.put("英语","99");
        Map.put(" "," ");
        Map.put("","");

        System.out.println(Map);


    }
}
