package com.company;

import java.util.*;

/*
*   collection 是集合体系的最顶层，包含了集合体系的共性
*   collections 是一个工具类，私有修饰没法创建对象   这是list所特有的
*   set虽然无序但是他不允许重复的出现，list虽然允许重复出现，但是他是有序的
* */
public class collections {
    public static void main(String[] args) {
        //method();
        method2();



    }

    private static void method2() {
        List<String> l=new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        Collections.fill(l,"18");
        System.out.println(l);
    }

    private static void method() {
        List<String> l=new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        List<String>l1=new ArrayList<>();
        l1.add("");
        l1.add("");
        l1.add("");
        Collections.copy(l1,l);
        System.out.println(l1);
    }
}
