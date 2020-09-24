package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bianli {
    public static void main(String[] args) throws IOException {
        //method1();
        HashMap<String,String>map=new HashMap<>();
        map.put("001","zhangsan");
        map.put("002","lisi");
        map.put("003","wamgwu");
        BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
        for (Object key:map.keySet()
             ) {
            bw.write(key+"-----"+map.get(key));
            bw.newLine();
        }
        bw.close();

    }

    private static void method1() {
        Map<String,String> a=new HashMap<>();
        //put(K key,V value)就是将key映射到value中，如果key存在则覆盖value，并且吧原来的valuse值返回
        a.put("zhangsan","18");
        a.put("lisi","29");
        for (String key:a.keySet()
             ) {
            System.out.println("key=="+key+"Value"+a.get(key));
        }
    }
}
