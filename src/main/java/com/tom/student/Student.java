package com.tom.student;

public class Student {
    String id;
    String name;
    int math;
    int english;

    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print(){
        System.out.println(name + "\n"+english+"\n"+math + "\n"+
                (math+english)/2);
    }
}

