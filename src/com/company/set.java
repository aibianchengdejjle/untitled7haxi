package com.company;

import java.util.*;

public class set {
    public static void main(String[] args) {
        HashSet<student>s=new HashSet<>();
        student s1= new student("jjl","18");
        student s2=new student("ljj","22");
        student s3=new student("jjl","18");
        s.add(s1);
        s.add(s2);
        s.add(s3);
        for (student o:s) {
            System.out.println(o.name+"----"+o.age);

        }
    }

}
class  student {
    String name;
    String age;

    public student(String name, String age) {
        this.age = age;
        this.name = name;
    }

   /* @Override
    public boolean equals(Object o) {
        System.out.println("------");
        if(o==this)
            return false;
        student s=(student)o;
       if(!this.name.equals(s.name))
       {
           return false;
       }
       if(!this.age.equals(s.age))
       {
           return false;
       }
       return true;
    }

    @Override
    public int hashCode() {
        /*
        *   优化hashcode方法  如果我们能对不同的对象返回的hash值不同，
        * 这样就减少了比较equals的方法
        *
        *
        return age.hashCode()+name.hashCode();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
