package com.tom;

public class Hello {
    public static void main(String[] args){
//        System.out.println("Hello World!!");
        Person p = new Person( "Tom",66.5f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println( score >80 || score<90);
        char c = 'A';
        System.out.println(c > 'a');


        /*int age;
        age = 22;
        char c = '中';
        Character c2 = 'A';
        byte b = 30;
        float weight = 65.5f;
        boolean enroll = false;
        String s = new String("ABCD");
        System.out.println(enroll);*/
    }
}
