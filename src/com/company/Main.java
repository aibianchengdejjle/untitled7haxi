package com.company;
/*
*       set集合 顺序有可能不一样
*
*
* */
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("Java");
        method1(hs);
        method2(hs);
        method3(hs);

    }

    private static void method3(HashSet<String> hs) {
        for (Object p : hs) {
            System.out.println(p);
        }
    }


    private static void method2(HashSet<String> hs) {
        Object []o=hs.toArray();
        for (int i = 0; i <o.length ; i++) {
            System.out.println(o[i]);
        }
    }

    private static void method1(HashSet<String> hs) {
        for (int i = 0; i <hs.size() ; i++) {
            System.out.println(hs.toString());
        }
    }
}
