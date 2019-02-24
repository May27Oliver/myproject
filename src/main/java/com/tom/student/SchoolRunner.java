package com.tom.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args){
        System.out.println("請輸入學生姓名、數學分數、英文分數：");
        System.out.println("請輸入學生姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("請輸入學生數學分數：");
        int math = scanner.nextInt();
        System.out.println("請輸入學生英文分數：");
        int english = scanner.nextInt();
        Student stu = new Student(name,math,english);
        stu.print();

    }
}
