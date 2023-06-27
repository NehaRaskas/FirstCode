package org.apache.maven;

public class VariableDemo {

    public static void main(String Args[]){

        //byte,short,character,int,float,double,long,boolean

        long l = 999999999999999999L;//big value datatype 8 bytes -> 64 bits  but every value in long must end with "L"
        long l1 = 5;
        long l2 = 500000000;//9 digit can be written without 'l/L' at the end
        long l3 = 8000000000000000000l;// 'l/L' are prefered at the end of value
        long l4 = l1;
        l1 = 789456123;
        long l5 = 0L;//default value of long


        double d = 5.5555555555555555555555555555555555555555555;
        double d1 = 5;
        double d2 = 0.56789;
        double d3 = 0.0;//default value of double
        double d4 = 0.0d;
        double d5 = 0.0D;

        float f = 5.5f;
        float f1 = 0.0f;//default value of float

        int i = 5;//4 bytes -> 32 bits [-2,147,483,648 to 2,147,483,647]
        int i1 = 0;//default value of int

        short s = 5;//2 bytes -> 16 bits [-35768 to 35,767] Instead of wasting two bytes we can use short
        short s1 = 'A';

        byte b = 5;//low value datatype 1 byte -> 8 bits [-128 to 127] Instead of wasting one byte use byte and byte is the lowest data storing datatype

        char c = 'A';
        c = 70;
        char c1 = 77;
//        //char c1 = "A"; Only string value is denoted with double quotes
        char c2 = 'E';
        char c3 = '\u0000';//default value of character

        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);

        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        System.out.println(f);
        System.out.println(f1);

        System.out.println(i);
        System.out.println(i1);

        System.out.println(s);
        System.out.println(s1);

        System.out.println(b);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
