package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String,String> a=new HashMap<>();
        //put(K key,V value)就是将key映射到value中，如果key存在则覆盖value，并且吧原来的valuse值返回
        a.put("zhangsan","18");
        a.put("lisi","29");
        for (String key:a.keySet()
        ) {
            System.out.println("key==" + key + "    Value==" + a.get(key));
        }
       // System.out.println(a.put("zhangsan","20"));
        //System.out.println(a);
        //System.out.println(a.containsKey("zhangsan"));
        //System.out.println(a.containsValue("20"));
        //System.out.println(a.replace("zhangsan","20","22"));
        //删除
        //System.out.println(a.remove("zhangsan"));
        //method(a);
        //method2(a.values());

    }

    private static void method2(Collection<String> values) {
        Collection c = values;
        for (Object o : c
        ) {
            System.out.println(o);
        }
    }

    private static void method(Map<String, String> a) {
        //因为k是不允许重复的所以用set存储
        Set s=a.keySet();
        for (Object o:s
        ) {
            System.out.println(o);

        }
    }

}
